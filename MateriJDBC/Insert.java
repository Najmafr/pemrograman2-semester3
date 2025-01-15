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
public class Insert {
    
    Koneksi konek = new Koneksi();
    public void insert(int nim, String nama, String alamat, String gender) {
      
        try {
            
          konek.koneksi();
          Statement statement = konek.con.createStatement();
          String sql= "insert into identitas values('"+nim+"','"+nama+"','"+alamat+"','"+gender+"');";
          statement.executeUpdate(sql);
          statement.close(); 

          JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        } catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
