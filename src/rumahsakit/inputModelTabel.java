/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Diggy Nusantara
 */
public class inputModelTabel {
    public void inputDokter(String KdDokter, String NmDokter, String AlDok1, String AlDok2, String KtDok, String KpDok, String TlpDok){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "INSERT INTO dokter VALUES (?,?,?,?,?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdDokter);
            prestat.setString(2, NmDokter);
            prestat.setString(3, AlDok1);
            prestat.setString(4, AlDok2);
            prestat.setString(5, KtDok);
            prestat.setString(6, KpDok);
            prestat.setString(7, TlpDok);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void inputPerawat(String KdPerawat, String NmPerawat, String AlPrwt1, String AlPrwt2, String KtPrwt, String KpPrwt, String TlpPrwt){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "INSERT INTO perawat VALUES (?,?,?,?,?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdPerawat);
            prestat.setString(2, NmPerawat);
            prestat.setString(3, AlPrwt1);
            prestat.setString(4, AlPrwt2);
            prestat.setString(5, KtPrwt);
            prestat.setString(6, KpPrwt);
            prestat.setString(7, TlpPrwt);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void inputPasien(String KdPasien, String NmPasien, String AlPasien1, String AlPasien2, String KtPasien, String KpPasien, String TlpPasien){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "INSERT INTO pasien VALUES (?,?,?,?,?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdPasien);
            prestat.setString(2, NmPasien);
            prestat.setString(3, AlPasien1);
            prestat.setString(4, AlPasien2);
            prestat.setString(5, KtPasien);
            prestat.setString(6, KpPasien);
            prestat.setString(7, TlpPasien);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void inputObat(String KdObat, String NmObat, String KetObat, String Harga){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "INSERT INTO obat VALUES (?,?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdObat);
            prestat.setString(2, NmObat);
            prestat.setString(3, KetObat);
            prestat.setString(4, Harga);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void inputKlinik(String KdKlinik, String NmKlinik, String RngKlinik){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "INSERT INTO klinik VALUES (?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdKlinik);
            prestat.setString(2, NmKlinik);
            prestat.setString(3, RngKlinik);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void inputPenyakit(String KdPenyakit, String NmPenyakit){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "INSERT INTO penyakit VALUES (?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdPenyakit);
            prestat.setString(2, NmPenyakit);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void inputResep(String KdResep, String KdObat, String Jumlah){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "INSERT INTO resep VALUES (?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdResep);
            prestat.setString(2, KdObat);
            prestat.setString(3, Jumlah);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void inputServis(String KdServis, String KdKlinik, String KdDokter, String KdPerawat, String Tarif){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "INSERT INTO servis VALUES (?,?,?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdServis);
            prestat.setString(2, KdKlinik);
            prestat.setString(3, KdDokter);
            prestat.setString(4, KdPerawat);
            prestat.setString(5, Tarif);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void inputTarif(String KdDokter, String Tarif){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "INSERT INTO tarifdok VALUES (?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdDokter);
            prestat.setString(2, Tarif);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void inputKunjung(String KdPasien, String KdSakit, String KdResep){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "INSERT INTO kunjung VALUES (?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdPasien);
            prestat.setString(2, KdSakit);
            prestat.setString(3, KdResep);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
}
