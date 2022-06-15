/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author farhan
 */
public class Skripsi extends Buku {
    private String NPM;

    public Skripsi(String NPM, String judul, String penerbit, int tahun) {
        super(judul, penerbit, penerbit, tahun);
        this.NPM = NPM;
    }
 
    public String toString() {
        return "Nama Mahasiswa: " + penerbit + "\n" +
               "NPM: " + NPM + "\n" +
               "Judul Skripsi: " + judul + "\n" +
               "Tahun: " + tahun;
    }
}
