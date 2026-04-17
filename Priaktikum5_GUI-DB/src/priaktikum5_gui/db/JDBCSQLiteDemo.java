package priaktikum5_gui.db;

import java.sql.*;

/**
 *
 * @author abi
 */
public class JDBCSQLiteDemo {
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost/";
    
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName(DRIVER);
            
            System.out.println("Connecting To MySQL...");
            conn = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Connected");
            
            stmt = conn.createStatement();
            String query = "CREATE DATABASE dbTokoBuku";
            System.out.println("dbTokoBuku Database created succesfully");
            System.out.println("");
            
            stmt.executeUpdate(query);
            
            query = "USE dbTokoBuku";
            stmt.executeUpdate(query);
            
            stmt = conn.createStatement();
            query = """
                    CREATE TABLE tbBarang(
                    kodeBrg CHAR(5) NOT NULL, 
                    namaBrg VARCHAR(50),
                    satuanBrg VARCHAR(8), 
                    hargaBrg INTEGER,
                    PRIMARY KEY(kodeBrg))
                    """;
            stmt.executeUpdate(query);
            System.out.println("Table created succesfully");
            //seeding db
             query = """
                    INSERT INTO tbBarang VALUES
                    ('PS-01','Pencil 2 FABER CASTELL', 'pcs',2500)
                    """;
            stmt.executeUpdate(query);
            
            query = """
                    INSERT INTO tbBarang VALUES
                    ('PS-02','Pencil 2 STAEDLER', 'pcs',2500)
                    """;
            stmt.executeUpdate(query);
           
            
            query = """
                    INSERT INTO tbBarang VALUES
                    ('PH-01','Penghaps FABER CASTELL', 'pcs',2500)
                    """;
            stmt.executeUpdate(query);
            
            query = """
                    INSERT INTO tbBarang VALUES
                    ('KR-01','Kertsd A4 PAPER ONE', 'rim',25000)
                    """;
            stmt.executeUpdate(query);
            
            query = "SELECT kodeBrg, namaBrg, satuanBrg, hargaBrg FROM tbBarang";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String kodeBrg = rs.getString("kodeBrg");
                String namaBrg = rs.getString("namaBrg");
                String satuanBrg = rs.getString("satuanBrg");
                int hargaBrg = rs.getInt("hargaBrg");
                
                System.out.println("");
                System.out.println("Kode Barang: " + kodeBrg);
                System.out.println("Nama Barang: " + namaBrg);
                System.out.println("Satuan Barang: " + satuanBrg);
                System.out.println("Harga Barang: " + hargaBrg);
                System.out.println("");
                
            }
        rs.close();
        System.out.println("Changing records kodeBrg=PS-02...");
        query = "UPDATE tbBarang SET hargaBrg=2000 WHERE kodeBrg='PS-02'";
        stmt.executeUpdate(query);
        System.out.println("Records kodeBrg=PS-02 updated successfully");

        query = "SELECT namaBrg, kodeBrg, satuanBrg, hargaBrg FROM tbBarang";
        rs = stmt.executeQuery(query);
        while(rs.next()){
            String kodeBrg = rs.getString("kodeBrg");
            String namaBrg = rs.getString("namaBrg");
            String satuanBrg = rs.getString("satuanBrg");
            int hargaBrg = rs.getInt("hargaBrg");
            
            System.out.println("");
            System.out.println("Kode Barang: " + kodeBrg);
            System.out.println("Nama Barang: " + namaBrg);
            System.out.println("Satuan Barang: " + satuanBrg);
            System.out.println("Harga Barang: " + hargaBrg);
            System.out.println("");
        }
        rs.close();
        
        System.out.println("Deleting records kodeBrg=PS-02...");
        query = "DELETE FROM tbBarang WHERE kodeBrg='PS-02'";
        stmt.executeUpdate(query);
        System.out.println("Records kodeBrg=PS-02 deleted successfully");

        query = "SELECT namaBrg, kodeBrg, satuanBrg, hargaBrg FROM tbBarang";
        rs = stmt.executeQuery(query);
        while(rs.next()){
            String kodeBrg = rs.getString("kodeBrg");
            String namaBrg = rs.getString("namaBrg");
            String satuanBrg = rs.getString("satuanBrg");
            int hargaBrg = rs.getInt("hargaBrg");
            
            System.out.println("");
            System.out.println("Kode Barang: " + kodeBrg);
            System.out.println("Nama Barang: " + namaBrg);
            System.out.println("Satuan Barang: " + satuanBrg);
            System.out.println("Harga Barang: " + hargaBrg);
            System.out.println("");
        }
        rs.close();
        } catch (SQLException se){
            se.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if(stmt!=null) stmt.close();
            } catch (SQLException se2){
            }
            try{
                if(conn!=null) conn.close();
            } catch (SQLException se){
                se.printStackTrace();
            }
        }
        
        System.out.println("Goodbye!");
    }
    
}
