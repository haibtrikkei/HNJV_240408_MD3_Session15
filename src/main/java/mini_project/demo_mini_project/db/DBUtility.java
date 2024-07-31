package mini_project.demo_mini_project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
    private static String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/db_jv240408_mini_project";
    private static String USER_NAME = "root";
    private static String PASS_WORD = "1234$";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(DRIVER_CLASS_NAME);
            con = DriverManager.getConnection(URL,USER_NAME,PASS_WORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }

    public static void closeConnection(Connection con){
        if(con!=null) {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
