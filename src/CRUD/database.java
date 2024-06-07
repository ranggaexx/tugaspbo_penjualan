/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

/**
 *
 * @author YSRL
 */
public class database {
    private String databaseName = "angga_2210010638";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
    
    public database(){
        try {
           String location = "jdbc:mysql://localhost/"+databaseName;
           Class.forName("com.mysql.jdbc.Driver");
           
           connectionDB = DriverManager.getConnection(location, username, password);    
           System.out.println("Sistem Terkoneksi");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    

    public void simpanKonsumen(int id, String noKTP, String nama, String hp, String alamat) {
        try {
            String sql = "INSERT INTO konsumen (id_konsumen, no_ktp, nama_kon, hp_kon, alamat_kon) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id);
            perintah.setString(2, noKTP);
            perintah.setString(3, nama);
            perintah.setString(4, hp);
            perintah.setString(5, alamat);
            perintah.executeUpdate();
            System.out.println("Data Konsumen Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahKonsumen(int id, String noKTP, String nama, String hp, String alamat) {
        try {
            String sql = "UPDATE konsumen SET no_ktp = ?, nama_kon = ?, hp_kon = ?, alamat_kon = ? WHERE id_konsumen = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, noKTP);
            perintah.setString(2, nama);
            perintah.setString(3, hp);
            perintah.setString(4, alamat);
            perintah.executeUpdate();
            System.out.println("Data Konsumen Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapusKonsumen(int id) {
        try {
            String sql = "DELETE FROM konsumen WHERE id_konsumen = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id);
            perintah.executeUpdate();
            System.out.println("Data Konsumen Berhasil Dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
     public void simpanPembayaran(int idPembayaran, int idPenjualan, int jumlahBayar, Date tanggalBayar, int idUser) {
        try {
            String sql = "INSERT INTO pembayaran (id_pembayaran, id_penjualan, jumlah_bayar, tgl_bayar, id_user) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, idPembayaran);
            perintah.setInt(2, idPenjualan);
            perintah.setInt(3, jumlahBayar);
            perintah.setDate(4, new java.sql.Date(tanggalBayar.getTime()));
            perintah.setInt(5, idUser);
            perintah.executeUpdate();
            System.out.println("Data Pembayaran Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahPembayaran(int idPembayaran, int idPenjualan, int jumlahBayar, Date tanggalBayar, int idUser) {
        try {
            String sql = "UPDATE pembayaran SET id_penjualan = ?, jumlah_bayar = ?, tgl_bayar = ?, id_user = ? WHERE id_pembayaran = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, idPenjualan);
            perintah.setInt(2, jumlahBayar);
            perintah.setDate(3, new java.sql.Date(tanggalBayar.getTime()));
            perintah.setInt(4, idUser);
            perintah.setInt(5, idPembayaran);
            perintah.executeUpdate();
            System.out.println("Data Pembayaran Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapusPembayaran(int idPembayaran) {
        try {
            String sql = "DELETE FROM pembayaran WHERE id_pembayaran = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, idPembayaran);
            perintah.executeUpdate();
            System.out.println("Data Pembayaran Berhasil Dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Implementasi metode untuk simpan, ubah, dan hapus Pembelian
    // (Implementasi metode serupa untuk kelas Pembelian)
    public void simpanPembelian(int idPembelian, int idSupplier, String noFaktur, String totalBeli, String status, String tanggalPembelian, int idUser) {
    try {
        String sql = "INSERT INTO pembelian (id_pembelian, id_supplier, no_faktur, total_beli, status, tgl_beli, id_user) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idPembelian);
        perintah.setInt(2, idSupplier);
        perintah.setString(3, noFaktur);
        perintah.setString(4, totalBeli);
        perintah.setString(5, status);
        perintah.setString(6, tanggalPembelian);
        perintah.setInt(7, idUser);
        perintah.executeUpdate();
        System.out.println("Data Pembelian Berhasil Disimpan");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

public void ubahPembelian(int idPembelian, int idSupplier, String noFaktur, String totalBeli, String status, String tanggalPembelian, int idUser) {
    try {
        String sql = "UPDATE pembelian SET id_supplier = ?, no_faktur = ?, total_beli = ?, status = ?, tgl_beli = ?, id_user = ? WHERE id_pembelian = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idSupplier);
        perintah.setString(2, noFaktur);
        perintah.setString(3, totalBeli);
        perintah.setString(4, status);
        perintah.setString(5, tanggalPembelian);
        perintah.setInt(6, idUser);
        perintah.setInt(7, idPembelian);
        perintah.executeUpdate();
        System.out.println("Data Pembelian Berhasil Diubah");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

public void hapusPembelian(int idPembelian) {
    try {
        String sql = "DELETE FROM pembelian WHERE id_pembelian = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idPembelian);
        perintah.executeUpdate();
        System.out.println("Data Pembelian Berhasil Dihapus");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

    
    // Implementasi metode untuk simpan, ubah, dan hapus Kategori
    public void simpanKategori(int idKategori, String namaKategori) {
        try {
            String sql = "INSERT INTO kategori (id_kategori, nama_kat) VALUES (?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, idKategori);
            perintah.setString(2, namaKategori);
            perintah.executeUpdate();
            System.out.println("Data Kategori Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahKategori(int idKategori, String namaKategori) {
        try {
            String sql = "UPDATE kategori SET nama_kat = ? WHERE id_kategori = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, namaKategori);
            perintah.setInt(2, idKategori);
            perintah.executeUpdate();
            System.out.println("Data Kategori Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapusKategori(int idKategori) {
        try {
            String sql = "DELETE FROM kategori WHERE id_kategori = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, idKategori);
            perintah.executeUpdate();
            System.out.println("Data Kategori Berhasil Dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}

