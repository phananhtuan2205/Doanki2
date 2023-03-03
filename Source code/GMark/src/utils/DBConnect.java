package utils;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {

    private static String url = "jdbc:mysql://localhost:3306/gmark";
    private static String user = "root";
    private static String password = "";
    public static Connection conn = null;

    
    public static boolean open() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, password);
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // đóng kết nối kèm ps , rs nếu có (nếu không có thì truyền vào null
    public static void close(PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

//    public static void main(String[] args) {
//        System.out.println(conn);
//        System.out.println(DBConnect.open());
//        
//        System.out.println(conn);
//        
//        close(null,null);
//        
//        System.out.println(conn);
//        
//        
//    }
}
