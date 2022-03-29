/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author farhan
 */
public class Koleksi {
    protected String judul;
    protected String penerbit;
    protected int tahun;

    public Koleksi(String judul, String penerbit, int tahun) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public String toString() {
        return "Judul Koleksi: " + judul + "\n" +
               "Penerbit: " + penerbit + "\n" +
               "Tahun Terbit: " + tahun;
    }
}
