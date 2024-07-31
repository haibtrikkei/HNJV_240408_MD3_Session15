package mini_project.demo_mini_project.repository.impl;

import mini_project.demo_mini_project.db.DBUtility;
import mini_project.demo_mini_project.model.entity.Cart;
import mini_project.demo_mini_project.model.entity.Category;
import mini_project.demo_mini_project.repository.CartRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartReposityImpl implements CartRepository {
    @Override
    public boolean checkProductInCart(Integer proId) {
        boolean bl = false;

        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;

        con = DBUtility.getConnection();
        try {
            pstmt = con.prepareStatement("select * from Cart where product_id = ?");
            pstmt.setInt(1, proId);
            rs = pstmt.executeQuery();
            if(rs.next()){
                bl = true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtility.closeConnection(con);
        }

        return bl;
    }

    @Override
    public boolean update(Integer proId) {
        boolean bl = false;

        Connection con;
        PreparedStatement pstmt;

        con = DBUtility.getConnection();
        try {
            pstmt = con.prepareStatement("update Cart set quantity = quantity+1 where product_id = ?");
            pstmt.setInt(1, proId);
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

    @Override
    public boolean save(Integer proId) {
        boolean bl = false;

        Connection con;
        PreparedStatement pstmt;

        con = DBUtility.getConnection();
        try {
            pstmt = con.prepareStatement("insert into Cart(product_id,quantity) values (?,1)");
            pstmt.setInt(1, proId);
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

    @Override
    public List<Cart> findAll() {
        List<Cart> list = new ArrayList<>();

        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;

        con = DBUtility.getConnection();
        try {
            pstmt = con.prepareStatement("select * from Cart");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Cart c = new Cart();
                c.setCartId(rs.getInt("cart_id"));
                c.setProId(rs.getInt("product_id"));
                c.setQuantity(rs.getInt("quantity"));
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
