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
    

    public void simpanKonsumen(String id, String noKTP, String nama, String hp, String alamat) {
        try {
            String sql = "INSERT INTO konsumen (id_konsumen, no_ktp, nama_kon, hp_kon, alamat_kon) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
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

    public void ubahKonsumen(String id, String noKTP, String nama, String hp, String alamat) {
        try {
            String sql = "UPDATE konsumen SET no_ktp = ?, nama_kon = ?, hp_kon = ?, alamat_kon = ? WHERE id_konsumen = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, noKTP);
            perintah.setString(2, nama);
            perintah.setString(3, hp);
            perintah.setString(4, alamat);
            perintah.setString(5, id);
            perintah.executeUpdate();
            System.out.println("Data Konsumen Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapusKonsumen(String id) {
        try {
            String sql = "DELETE FROM konsumen WHERE id_konsumen = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            perintah.executeUpdate();
            System.out.println("Data Konsumen Berhasil Dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
     public void simpanPembayaran(String idPembayaran, String idPenjualan, String jumlahBayar, String tanggalBayar, String idUser) {
        try {
            String sql = "INSERT INTO pembayaran (id_pembayaran, id_penjualan, jumlah_bayar, tgl_bayar, id_user) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, idPembayaran);
            perintah.setString(2, idPenjualan);
            perintah.setString(3, jumlahBayar);
            perintah.setString(4, tanggalBayar);
            perintah.setString(5, idUser);
            perintah.executeUpdate();
            System.out.println("Data Pembayaran Berhasil Di simpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahPembayaran(String idPembayaran, String idPenjualan, String jumlahBayar, String tanggalBayar, String idUser) {
        try {
            String sql = "UPDATE pembayaran SET id_penjualan = ?, jumlah_bayar = ?, tgl_bayar = ?, id_user = ? WHERE id_pembayaran = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, idPenjualan);
            perintah.setString(2, jumlahBayar);
            perintah.setString(3, tanggalBayar);
            perintah.setString(4, idUser);
            perintah.setString(5, idPembayaran);
            perintah.executeUpdate();
            System.out.println("Data Pembayaran Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapusPembayaran(String idPembayaran) {
        try {
            String sql = "DELETE FROM pembayaran WHERE id_pembayaran = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, idPembayaran);
            perintah.executeUpdate();
            System.out.println("Data Pembayaran Berhasil Di hapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Implementasi metode untuk simpan, ubah, dan hapus Pembelian
    // (Implementasi metode serupa untuk kelas Pembelian)
    public void simpanPembelian(String idPembelian, String idSupplier, String noFaktur, String totalBeli, String status, String tanggalPembelian, String idUser) {
    try {
        String sql = "INSERT INTO pembelian (id_pembelian, id_supplier, no_faktur, total_beli, status, tgl_beli, id_user) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, idPembelian);
        perintah.setString(2, idSupplier);
        perintah.setString(3, noFaktur);
        perintah.setString(4, totalBeli);
        perintah.setString(5, status);
        perintah.setString(6, tanggalPembelian);
        perintah.setString(7, idUser);
        perintah.executeUpdate();
        System.out.println("Data Pembelian Berhasil Di simpan");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

public void ubahPembelian(String idPembelian, String idSupplier, String noFaktur, String totalBeli, String status, String tanggalPembelian, String idUser) {
    try {
        String sql = "UPDATE pembelian SET id_supplier = ?, no_faktur = ?, total_beli = ?, status = ?, tgl_beli = ?, id_user = ? WHERE id_pembelian = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, idSupplier);
        perintah.setString(2, noFaktur);
        perintah.setString(3, totalBeli);
        perintah.setString(4, status);
        perintah.setString(5, tanggalPembelian);
        perintah.setString(6, idUser);
        perintah.setString(7, idPembelian);
        perintah.executeUpdate();
        System.out.println("Data Pembelian Berhasil Diubah");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

public void hapusPembelian(String idPembelian) {
    try {
        String sql = "DELETE FROM pembelian WHERE id_pembelian = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, idPembelian);
        perintah.executeUpdate();
        System.out.println("Data Pembelian Berhasil Dihapus");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

    
    // Implementasi metode untuk simpan, ubah, dan hapus Kategori
    public void simpanKategori(String idKategori, String namaKategori) {
        try {
            String sql = "INSERT INTO kategori (id_kategori, nama_kat) VALUES (?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, idKategori);
            perintah.setString(2, namaKategori);
            perintah.executeUpdate();
            System.out.println("Data Kategori Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahKategori(String idKategori, String namaKategori) {
        try {
            String sql = "UPDATE kategori SET nama_kat = ? WHERE id_kategori = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, namaKategori);
            perintah.setString(2, idKategori);
            perintah.executeUpdate();
            System.out.println("Data Kategori Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapusKategori(String idKategori) {
        try {
            String sql = "DELETE FROM kategori WHERE id_kategori = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, idKategori);
            perintah.executeUpdate();
            System.out.println("Data Kategori Berhasil Dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}

