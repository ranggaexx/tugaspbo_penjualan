/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table_penjualan;
//
///**
// *
// * @author ASUS
// */
public class konsumen {
    private int id_konsumen;
    private String no_ktp;
    private String nama_kon;
    private String hp_kon;
    private String alamat_kon;

    public konsumen(int idKonsumen, String noKTP, String namaKonsumen, String hpKonsumen, String alamatKonsumen) {
        this.id_konsumen = idKonsumen;
        this.no_ktp = noKTP;
        this.nama_kon = namaKonsumen;
        this.hp_kon = hpKonsumen;
        this.alamat_kon = alamatKonsumen;
    }

    public int getIdKonsumen() {
        return id_konsumen;
    }

    public String getNoKTP() {
        return no_ktp;
    }

    public String getNamaKonsumen() {
        return nama_kon;
    }

    public String getHpKonsumen() {
        return hp_kon;
    }

    public String getAlamatKonsumen() {
        return alamat_kon;
    }
}
