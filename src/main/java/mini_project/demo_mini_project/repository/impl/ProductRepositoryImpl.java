package mini_project.demo_mini_project.repository.impl;

import mini_project.demo_mini_project.db.DBUtility;
import mini_project.demo_mini_project.model.entity.Product;
import mini_project.demo_mini_project.repository.ProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();

        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;

        con = DBUtility.getConnection();
        try {
            pstmt = con.prepareStatement("select * from Products");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setProId(rs.getInt("product_id"));
                p.setProName(rs.getString("product_name"));
                p.setShortDescription(rs.getString("short_description"));
                p.setDescription(rs.getString("description"));
                p.setImageName(rs.getString("image_name"));
                p.setPrice(rs.getDouble("price"));
                p.setCateId(rs.getInt("cate_id"));
                list.add(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtility.closeConnection(con);
        }
        return list;
    }

    @Override
    public List<Product> findLimit8() {
        List<Product> list = new ArrayList<>();

        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;

        con = DBUtility.getConnection();
        try {
            pstmt = con.prepareStatement("select * from Products limit 8");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setProId(rs.getInt("product_id"));
                p.setProName(rs.getString("product_name"));
                p.setShortDescription(rs.getString("short_description"));
                p.setDescription(rs.getString("description"));
                p.setImageName(rs.getString("image_name"));
                p.setPrice(rs.getDouble("price"));
                p.setCateId(rs.getInt("cate_id"));
                list.add(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtility.closeConnection(con);
        }
        return list;
    }

    @Override
    public Product findById(Integer proId) {
        Product p = null;

        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;

        con = DBUtility.getConnection();
        try {
            pstmt = con.prepareStatement("select * from Products where product_id=?");
            pstmt.setInt(1, proId);
            rs = pstmt.executeQuery();
            if(rs.next()){
                p = new Product();
                p.setProId(rs.getInt("product_id"));
                p.setProName(rs.getString("product_name"));
                p.setShortDescription(rs.getString("short_description"));
                p.setDescription(rs.getString("description"));
                p.setImageName(rs.getString("image_name"));
                p.setPrice(rs.getDouble("price"));
                p.setCateId(rs.getInt("cate_id"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtility.closeConnection(con);
        }
        return p;
    }

    @Override
    public boolean save(Product product) {
        boolean bl = false;

        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;

        con = DBUtility.getConnection();
        try {
            pstmt = con.prepareStatement("insert into Products(product_name, short_description, description, image_name, price,cate_id) values (?,?,?,?,?,?))");
            pstmt.setString(1, product.getProName());
            pstmt.setString(2, product.getShortDescription());
            pstmt.setString(3, product.getDescription());
            pstmt.setString(4, product.getImageName());
            pstmt.setDouble(5, product.getPrice());
            pstmt.setInt(6, product.getCateId());
            int i = pstmt.executeUpdate();
            if(i>0)
                bl = true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtility.closeConnection(con);
        }

        return bl;
    }
}
