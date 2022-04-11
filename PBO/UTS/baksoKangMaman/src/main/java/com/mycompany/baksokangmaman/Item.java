/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baksokangmaman;

/**
 *
 * @author farhan
 */
public class Item {
    // nama : Farkhan
    // npm : 20081010060

    private String nama;
    private int harga, hargaJual;

    // construct
    public Item() {
        this.nama = "Nama Item";
        this.harga = 1000;
        this.hargaJual = 2000;
    }
    public Item(String nama, int harga, int hargaJual) {
        this.nama = nama;
        this.harga = harga;
        this.hargaJual = hargaJual;
    }
    public Item(String nama) {
        this.nama = nama;
        this.harga = 1000;
        this.hargaJual = 2000;
    }

    // method setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    // method get
    public String getNama() {
        return this.nama;
    }
    public int getHarga() {
        return this.harga;
    }
    public int getHargaJual() {
        return this.hargaJual;
    }

    public String menu() {
        return "Daftar menu\n" +
               "1. Bakso Halus\t\t 3000\n" +
               "2. Bakso Urat\t\t 3500\n" +
               "3. Bakso Telur Puyuh\t 4000\n" +
               "4. Bakwan\t\t 2000\n" +
               "5. Tahu\t\t\t 1000\n" +
               "6. Mie Bihun\t\t 1000\n";
    }
}
