/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author farhan
 */
public class Main {
    public static void main (String[] args) {
        Koleksi k1 = new Koleksi("Seni Untuk Berdiam Diri", "Pikiran Pustaka Jaya", 2020);
        System.out.println(k1.toString());
        System.out.println();

        Buku b1 = new Buku("Anda Saja Aku Tak Berandai-andai", "Farkhan", "Terbit Abadi", 2020);
        System.out.println(b1.toString());
        System.out.println();

        Majalah m1 = new Majalah("Kabar Terbaru dari Semalam", "IV", "Sinar Tenggelam", 2021);
        System.out.println(m1.toString());
        System.out.println();

        Skripsi sk1 = new Skripsi("20081010060", "Analisis Mining Kebahagiaan Dengan Metode Typing Alay", "Jurnal Onlen", 2022);
        System.out.println(sk1.toString());
    }
}
