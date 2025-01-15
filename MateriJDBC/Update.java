/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MateriJDBC;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Update {
    Koneksi konek = new Koneksi();
    public void update(int nim, String nama, String alamat, String jenis) {

        try {

            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_alamat = "update identitas set alamat='"+alamat+"'where nim='"+nim+"'";
            String sql_nama = "update identitas set nama='"+nama+"'where nim='"+nim+"'";
            String sql_jenis = "update identitas set gender='"+jenis+"'where nim='"+nim+"'";
            
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jenis);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
