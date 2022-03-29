/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author farhan
 */
public class Buku extends Koleksi {
    private String penulis;

    public Buku(String judul, String penulis, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }

    public String toString() {
        return "Judul Buku: " + judul + "\n" +
               "Nama Penulis: " + penulis + "\n" +
               "Penerbit: " + penerbit + "\n" +
               "Tahun Terbit: " + tahun;
    }
}
