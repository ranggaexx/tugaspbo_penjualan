/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table_penjualan;

/**
 *
 * @author ASUS
 */
public class supplier {
    private int idSupplier;
    private String namaSupplier;
    private String alamatSupplier;
    private String noHpSupplier;

    public supplier(int idSupplier, String namaSupplier, String alamatSupplier, String noHpSupplier) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.alamatSupplier = alamatSupplier;
        this.noHpSupplier = noHpSupplier;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public String getAlamatSupplier() {
        return alamatSupplier;
    }

    public String getNoHpSupplier() {
        return noHpSupplier;
    }
}