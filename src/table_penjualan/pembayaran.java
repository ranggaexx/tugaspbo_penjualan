/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table_penjualan;

/**
 *
 * @author ASUS
 */
import java.util.Date;

public class pembayaran {
    private int idPembayaran;
    private int idKonsumen;
    private int jumlahBayar;
    private Date tanggalBayar;
    private int idUser;

    public pembayaran(int idPembayaran, int idKonsumen, int jumlahBayar, Date tanggalBayar, int idUser) {
        this.idPembayaran = idPembayaran;
        this.idKonsumen = idKonsumen;
        this.jumlahBayar = jumlahBayar;
        this.tanggalBayar = tanggalBayar;
        this.idUser = idUser;
    }

    public int getIdPembayaran() {
        return idPembayaran;
    }

    public int getIdKonsumen() {
        return idKonsumen;
    }

    public int getJumlahBayar() {
        return jumlahBayar;
    }

    public Date getTanggalBayar() {
        return tanggalBayar;
    }

    public int getIdUser() {
        return idUser;
    }
}
