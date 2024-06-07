/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table_penjualan;
import java.util.Date;

/**
 *
 * @author ASUS
 */

public class pembelian {
    private int idPembelian;
    private int idSupplier;
    private String noFaktur;
    private String totalBeli;
    private String status;
    private String tanggalBeli;
    private int idUser;

    public pembelian(int idPembelian, int idSupplier, String noFaktur, String totalBeli, String status, String tanggalBeli, int idUser) {
        this.idPembelian = idPembelian;
        this.idSupplier = idSupplier;
        this.noFaktur = noFaktur;
        this.totalBeli = totalBeli;
        this.status = status;
        this.tanggalBeli = tanggalBeli;
        this.idUser = idUser;
    }

    public int getIdPembelian() {
        return idPembelian;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public String getNoFaktur() {
        return noFaktur;
    }

    public String getTotalBeli() {
        return totalBeli;
    }

    public String getStatus() {
        return status;
    }

    public String getTanggalBeli() {
        return tanggalBeli;
    }

    public int getIdUser() {
        return idUser;
    }
}
