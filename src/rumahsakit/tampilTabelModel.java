/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
/**
 *
 * @author Diggy Nusantara
 */
public class tampilTabelModel {
    public Vector tampilBayar(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://" +
                    "localhost/rsakit","root","");
            String query = "SELECT pasien.NmPsn, penyakit.NmSakit, obat.NmObat, " +
                           "tarifdok.TrfDok, servis.Tarif, obat.Harga, " +
                           "resep.Jumlah, ((tarifdok.TrfDok+servis.Tarif) + (obat.Harga*resep.Jumlah)) as Total " +
                           "FROM servis INNER JOIN kunjung ON " +
                           "servis.KdSakit=kunjung.KdSakit " +
                           "INNER JOIN resep ON kunjung.KdRsp=resep.KdRsp " +
                           "INNER JOIN pasien ON kunjung.KdPsn=pasien.KdPsn " +
                           "INNER JOIN penyakit ON servis.KdSakit=penyakit.KdSakit " +
                           "INNER JOIN obat ON resep.KdObat=obat.KdObat " +
                           "INNER JOIN tarifdok ON servis.KdDok=tarifdok.KdDok";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("NmPsn"));
                kolom.add(rs.getString("NmSakit"));
                kolom.add(rs.getString("NmObat"));
                kolom.add(rs.getString("TrfDok"));
                kolom.add(rs.getString("Tarif"));
                kolom.add(rs.getString("Harga"));
                kolom.add(rs.getString("Jumlah"));
                kolom.add(rs.getString("Total"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR"
                    ,JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilDerita(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://" +
                    "localhost/rsakit","root","");
            String query = "SELECT pasien.NmPsn, penyakit.NmSakit, obat.NmObat, " +
                           "klinik.NmKln, dokter.NmDok " +
                           "FROM servis INNER JOIN kunjung ON " +
                           "servis.KdSakit=kunjung.KdSakit " +
                           "INNER JOIN resep ON kunjung.KdRsp=resep.KdRsp " +
                           "INNER JOIN pasien ON kunjung.KdPsn=pasien.KdPsn " +
                           "INNER JOIN penyakit ON servis.KdSakit=penyakit.KdSakit " +
                           "INNER JOIN obat ON resep.KdObat=obat.KdObat " +
                           "INNER JOIN klinik ON servis.KdKln=klinik.KdKln " +
                           "INNER JOIN dokter ON servis.KdDok=dokter.KdDok";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("NmPsn"));
                kolom.add(rs.getString("NmSakit"));
                kolom.add(rs.getString("NmObat"));
                kolom.add(rs.getString("NmKln"));
                kolom.add(rs.getString("NmDok"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR"
                    ,JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilDatang(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://" +
                    "localhost/rsakit","root","");
            String query = "SELECT pasien.NmPsn, penyakit.NmSakit, klinik.NmKln " +
                           "FROM kunjung INNER JOIN servis ON " +
                           "kunjung.KdSakit=servis.KdSakit " +
                           "INNER JOIN pasien ON kunjung.KdPsn=pasien.KdPsn " +
                           "INNER JOIN penyakit ON servis.KdSakit=penyakit.KdSakit " +
                           "INNER JOIN klinik ON servis.KdKln=klinik.KdKln";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("NmPsn"));
                kolom.add(rs.getString("NmSakit"));
                kolom.add(rs.getString("NmKln"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR"
                    ,JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilLayanan(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://" +
                    "localhost/rsakit","root","");
            String query = "SELECT penyakit.NmSakit, klinik.NmKln, klinik.RngKln " +
                           "FROM servis INNER JOIN penyakit ON " +
                           "servis.KdSakit=penyakit.KdSakit " +
                           "INNER JOIN klinik ON servis.KdKln=klinik.KdKln";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("NmSakit"));
                kolom.add(rs.getString("NmKln"));
                kolom.add(rs.getString("RngKln"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR"
                    ,JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilDokter(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit", "root", "");
            String query = "SELECT * FROM dokter ORDER BY KdDok";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("KdDok"));
                kolom.add(rs.getString("NmDok"));
                kolom.add(rs.getString("AlDok01"));
                kolom.add(rs.getString("AlDok02"));
                kolom.add(rs.getString("KtDok"));
                kolom.add(rs.getString("KpDok"));
                kolom.add(rs.getString("TlDok"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilPasien(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit", "root", "");
            String query = "SELECT * FROM pasien ORDER BY KdPsn";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("KdPsn"));
                kolom.add(rs.getString("NmPsn"));
                kolom.add(rs.getString("AlPsn01"));
                kolom.add(rs.getString("AlPsn02"));
                kolom.add(rs.getString("KtPsn"));
                kolom.add(rs.getString("KpPsn"));
                kolom.add(rs.getString("TlPsn"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilPerawat(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit", "root", "");
            String query = "SELECT * FROM perawat ORDER BY KdPrwt";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("KdPrwt"));
                kolom.add(rs.getString("NmPrwt"));
                kolom.add(rs.getString("AlPrwt01"));
                kolom.add(rs.getString("AlPrwt02"));
                kolom.add(rs.getString("KtPrwt"));
                kolom.add(rs.getString("KpPrwt"));
                kolom.add(rs.getString("TlPrwt"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilKlinik(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit", "root", "");
            String query = "SELECT * FROM klinik ORDER BY KdKln";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("KdKln"));
                kolom.add(rs.getString("NmKln"));
                kolom.add(rs.getString("RngKln"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilObat(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit", "root", "");
            String query = "SELECT * FROM obat ORDER BY KdObat";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("KdObat"));
                kolom.add(rs.getString("NmObat"));
                kolom.add(rs.getString("KetObat"));
                kolom.add(rs.getString("Harga"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilPenyakit(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit", "root", "");
            String query = "SELECT * FROM penyakit ORDER BY KdSakit";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("KdSakit"));
                kolom.add(rs.getString("NmSakit"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilTarifDok(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit", "root", "");
            String query = "SELECT * FROM tarifdok ORDER BY KdDok";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("KdDok"));
                kolom.add(rs.getString("TrfDok"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilServis(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit", "root", "");
            String query = "SELECT * FROM servis ORDER BY KdSakit";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("KdSakit"));
                kolom.add(rs.getString("KdKln"));
                kolom.add(rs.getString("KdDok"));
                kolom.add(rs.getString("KdPrwt"));
                kolom.add(rs.getString("Tarif"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilResep(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit", "root", "");
            String query = "SELECT * FROM resep ORDER BY KdRsp";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("KdRsp"));
                kolom.add(rs.getString("KdObat"));
                kolom.add(rs.getString("Jumlah"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
    
    public Vector tampilKunjung(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/rsakit", "root", "");
            String query = "SELECT * FROM kunjung ORDER BY KdPsn";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("KdPsn"));
                kolom.add(rs.getString("KdSakit"));
                kolom.add(rs.getString("KdRsp"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
}
