/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baksokangmaman;

/**
 *
 * @author farhan
 */
public class BaksoHalus extends Item {
    // nama : Farkhan
    // npm : 20081010060

    public BaksoHalus() {
        super("Bakso Halus", 2000, 3000);
    }
    public BaksoHalus(int harga) {
        super("Bakso Halus", harga, 3000);
    }
    public BaksoHalus(int harga, int hargaJual) {
        super("Bakso Halus", harga, hargaJual);
    }

    public String terjual(int jumlah){
        return jumlah + " " + super.getNama();
    }

    public String blmTerjual(int jumlah) {
        int sisa = 100 - jumlah;
        return sisa + " " + super.getNama();
    }

    public int hargaJual(int jumlah) {
        return jumlah * super.getHargaJual();
    }

    public int keuntungan(int jumlah) {
        return jumlah * (super.getHargaJual() - super.getHarga());
    }
}
