/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baksokangmaman;

/**
 *
 * @author farhan
 */
public class BaksoTelurPuyuh extends Item {
    // nama : Farkhan
    // npm : 20081010060

    public BaksoTelurPuyuh() {
        super("Bakso Telur Puyuh", 2000, 4000);
    }
    public BaksoTelurPuyuh(int harga) {
        super("Bakso Telur Puyuh", harga, 4000);
    }
    public BaksoTelurPuyuh(int harga, int hargaJual) {
        super("Bakso Telur Puyuh", harga, hargaJual);
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
