package alumni202457201034;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    
    private static Connection mysqlconfig;
    
    public static Connection konek() {
        
        try {
            String url = "jdbc:mysql://localhost:3306/alumni_202457201034";
            String user = "root";
            String pass = "";
            
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (SQLException sQLException) {
            System.err.println(sQLException.getMessage());
        }
        
        return  mysqlconfig;   
    }
}
