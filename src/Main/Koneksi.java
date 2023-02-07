
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Koneksi {
    private static Connection conn;
    public static Connection koneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/libeeo","root","");
            System.out.println("terhubung");
        } catch (SQLException e) {
            System.out.println("gagal karena "+e);
        }
        return conn;
    }
    public static void main(String[] args) {
        koneksi();
    }
}
