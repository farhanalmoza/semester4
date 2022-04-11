/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baksokangmaman;

/**
 *
 * @author farhan
 */
public class BaksoUrat extends Item {
    // nama : Farkhan
    // npm : 20081010060

    public BaksoUrat() {
        super("Bakso Urat", 2000, 3500);
    }
    public BaksoUrat(int harga) {
        super("Bakso Urat", harga, 3500);
    }
    public BaksoUrat(int harga, int hargaJual) {
        super("Bakso Urat", harga, hargaJual);
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
