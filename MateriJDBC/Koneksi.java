package MateriJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    public static void main(String[] args) {
        Koneksi tesKoneksi = new Koneksi();
        tesKoneksi.koneksi();
    }

    Connection con = null;

    String statusKoneksi;
    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost:3306/mahasiswa?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
            //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
            statusKoneksi = "Berhasil";
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
           //JOptionPane.showMessageDialog(null, "Koneksi gagal: " + e.getMessage());
            statusKoneksi = "Gagal";
        }
    }
}
