/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum1;

/**
 *
 * @author farhan
 */
public class Bus {
    // definisi atribut
    String nama, jurusan, plat;
    String fasilitas[];
    int harga, kursiTerisi, jmlKursi;
    final String merkMesin, rangka;

    // construct
    public Bus(String p, String r, String mm, int jk) {
        plat = p;
        rangka = r;
        merkMesin = mm;
        jmlKursi = jk;
    }

    public Bus(String p, String r) {
        plat = p;
        rangka = r;
        merkMesin = "Merek Mesin 1";
        jmlKursi = 60;
    }

    // methode
    public void forOwner() {
        System.out.println("Data ini hanya bisa dilihat oleh pemilik bus");
        System.out.println("Data bus " + nama + " ialah sebagai berikut:");
        System.out.println("Plat Nomor : " + plat);
        System.out.println("Nomor Rangka : " + rangka);
        System.out.println("Merk Mesin : " + merkMesin);
        System.out.println("Jumlah Kursi : " + jmlKursi);
    }

    public void forPassanger() {
        System.out.println("Data bus " + nama + " ialah sebagai berikut:");
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Harga Tiket : " + harga + " ribu rupiah");
        System.out.print("Fasilitas : ");
        for (int i = 0; i < fasilitas.length; i++) {
            if (i != fasilitas.length-1) {
                System.out.print(fasilitas[i] + ", ");
            } else {
                System.out.print(fasilitas[i]);
            }
        }
        System.out.println();
        System.out.println("Jumlah Kursi Terisi : " + kursiTerisi + " kursi terisi");
    }

    public void getIncome() {
        System.out.println("Jumlah dana yang didapatkan bus " + nama + " ialah sebanyak " + kursiTerisi*harga + " ribu rupiah");
    }

    // main
    public static void main (String[] args) {
        System.out.println("Daftar Bus Informatika Jaya");
        Bus sriwijaya = new Bus("L 1234 ZK", "123FGH890");
        sriwijaya.nama = "Sriwijaya";
        sriwijaya.jurusan = "Blitar - Surabaya";
        sriwijaya.harga = 60;
        sriwijaya.fasilitas = new String[]{"AC", "Wifi"};
        sriwijaya.kursiTerisi = 31;
        sriwijaya.forPassanger();
        System.out.println();
        sriwijaya.forOwner();
        System.out.println();
        sriwijaya.getIncome();
    }
}
