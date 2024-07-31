package mini_project.demo_mini_project.repository.impl;

import mini_project.demo_mini_project.db.DBUtility;
import mini_project.demo_mini_project.model.entity.Category;
import mini_project.demo_mini_project.model.entity.Product;
import mini_project.demo_mini_project.repository.CategoryRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    @Override
    public List<Category> findAll() {
        List<Category> list = new ArrayList<>();

        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;

        con = DBUtility.getConnection();
        try {
            pstmt = con.prepareStatement("select * from Categories");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Category c = new Category();
                c.setCateId(rs.getInt("cate_id"));
                c.setCateName(rs.getString("cate_name"));
                c.setStatus(rs.getBoolean("status"));
                list.add(c);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtility.closeConnection(con);
        }

        return list;
    }
}
