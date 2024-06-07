/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import CRUD.database;
import java.util.Date;
/**
 *
 * @author ASUS
 */
public class penjualan_main {
    public static void main(String [] args){
        database dbConnect = new database();
        
//        dbConnect.simpanKonsumen(1, "191919", "angga", "081818182718", "Teluk Dalam");
//        dbConnect.ubahKonsumen(1, "191919", "anggariau", "081818182718", "Teluk Dalam");
//          dbConnect.hapusKonsumen(1);
          
//        dbConnect.simpanPembayaran(1, 1, 100000, new Date(System.currentTimeMillis()), 1);
//        dbConnect.ubahPembayaran(1, 1, 120000, new Date(System.currentTimeMillis()), 1);
//        dbConnect.hapusPembayaran(1);

//        dbConnect.simpanPembelian(1, 1, "INV001", "500000", "Lunas", "7 Februari 2024", 1);
//        dbConnect.ubahPembelian(1, 1, "INV001", "550000", "Belum Lunas", "* Februari 2024", 1);
        dbConnect.hapusPembelian(1);

//        dbConnect.simpanKategori(1, "Elektronik");
//        dbConnect.ubahKategori(1, "Alat Elektronik");
//        dbConnect.hapusKategori(1);

    }
}
