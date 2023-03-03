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
public class updateModelTabel {
    public void updateDokter(String KdDokter, String NmDokter, String AlDok1, String AlDok2, String KtDok, String KpDok, String TlpDok){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "UPDATE dokter SET NmDok=?,AlDok01=?,AlDok02=?,KtDok=?,KpDok=?,TlDok=? WHERE KdDok=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, NmDokter);
            prestat.setString(2, AlDok1);
            prestat.setString(3, AlDok2);
            prestat.setString(4, KtDok);
            prestat.setString(5, KpDok);
            prestat.setString(6, TlpDok);
            prestat.setString(7, KdDokter);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updatePerawat(String KdPerawat, String NmPerawat, String AlPerawat1, String AlPerawat2, String KtPerawat, String KpPerawat, String TlpPerawat){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "UPDATE perawat SET NmPrwt=?,AlPrwt01=?,AlPrwt02=?,KtPrwt=?,KpPrwt=?,TlPrwt=? WHERE KdPrwt=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, NmPerawat);
            prestat.setString(2, AlPerawat1);
            prestat.setString(3, AlPerawat2);
            prestat.setString(4, KtPerawat);
            prestat.setString(5, KpPerawat);
            prestat.setString(6, TlpPerawat);
            prestat.setString(7, KdPerawat);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updatePasien(String KdPasien, String NmPasien, String AlPasien1, String AlPasien2, String KtPasien, String KpPasien, String TlpPasien){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "UPDATE pasien SET NmPsn=?,AlPsn01=?,AlPsn02=?,KtPsn=?,KpPsn=?,TlPsn=? WHERE KdPsn=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, NmPasien);
            prestat.setString(2, AlPasien1);
            prestat.setString(3, AlPasien2);
            prestat.setString(4, KtPasien);
            prestat.setString(5, KpPasien);
            prestat.setString(6, TlpPasien);
            prestat.setString(7, KdPasien);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateObat(String KdObat, String NmObat, String KetObat, String Harga){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "UPDATE obat SET NmObat=?,KetObat=?,Harga=? WHERE KdObat=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, NmObat);
            prestat.setString(2, KetObat);
            prestat.setString(3, Harga);
            prestat.setString(4, KdObat);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateKlinik(String KdKlinik, String NmKlinik, String RngKlinik){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "UPDATE klinik SET NmKln=?,RngKln=? WHERE KdKln=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, NmKlinik);
            prestat.setString(2, RngKlinik);
            prestat.setString(3, KdKlinik);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updatePenyakit(String KdSakit, String NmSakit){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "UPDATE penyakit SET NmSakit=? WHERE KdSakit=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, NmSakit);
            prestat.setString(2, KdSakit);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateServis(String KdSakit, String KdKlinik, String KdDokter, String KdPerawat, String Tarif){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "UPDATE servis SET KdKln=?,KdDok=?,KdPrwt=?,Tarif=? WHERE KdSakit=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdKlinik);
            prestat.setString(2, KdDokter);
            prestat.setString(3, KdPerawat);
            prestat.setString(4, Tarif);
            prestat.setString(5, KdSakit);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateResep(String KdResep, String KdObat, String Jumlah){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "UPDATE resep SET KdObat=?,Jumlah=? WHERE KdRsp=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdObat);
            prestat.setString(2, Jumlah);
            prestat.setString(3, KdResep);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateKunjung(String KdPasien, String KdSakit, String KdResep){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "UPDATE kunjung SET KdSakit=?,KdRsp=? WHERE KdPsn=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, KdSakit);
            prestat.setString(2, KdResep);
            prestat.setString(3, KdPasien);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateTarif(String KdDokter, String Tarif){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit","root","");
            String query = "UPDATE tarifdok SET TrfDok=? WHERE KdDok=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, Tarif);
            prestat.setString(2, KdDokter);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
}
