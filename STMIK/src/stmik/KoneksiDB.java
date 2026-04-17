package stmik;

import java.sql.*;
/**
 *
 * @author abi
 */
public class KoneksiDB {
    private static Connection conn;
    
    public static Connection getConnection() {
        if(conn == null){
            try{
                String url = "jdbc:mysql://localhost:3306/dbSTMIK";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                conn = DriverManager.getConnection(url,user,pass);
            } catch (SQLException se){
                System.out.println("Database Connection error");
            }
        }
        return conn;
    }
    
}
