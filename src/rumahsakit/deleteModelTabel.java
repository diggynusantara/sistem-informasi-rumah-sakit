/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Diggy Nusantara
 */
public class deleteModelTabel {
    public void hapusDokter(String KdDokter){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "DELETE FROM dokter WHERE KdDok=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdDokter);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void hapusPerawat(String KdPerawat){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "DELETE FROM perawat WHERE KdPrwt=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdPerawat);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void hapusPasien(String KdPasien){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "DELETE FROM pasien WHERE KdPsn=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdPasien);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void hapusObat(String KdObat){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "DELETE FROM obat WHERE KdObat=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdObat);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void hapusKlinik(String KdKlinik){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "DELETE FROM klinik WHERE KdKln=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdKlinik);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void hapusPenyakit(String KdSakit){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "DELETE FROM penyakit WHERE KdSakit=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdSakit);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void hapusServis(String KdSakit){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "DELETE FROM servis WHERE KdSakit=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdSakit);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void hapusResep(String KdResep){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "DELETE FROM resep WHERE KdRsp=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdResep);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void hapusKunjung(String KdPasien){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "DELETE FROM kunjung WHERE KdPsn=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdPasien);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void hapusTarif(String KdDokter){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "DELETE FROM tarifdok WHERE KdDok=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdDokter);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
}
