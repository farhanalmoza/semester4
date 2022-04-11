/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baksokangmaman;

import java.util.Scanner;

/**
 *
 * @author farhan
 */
public class Main {
    // nama : Farkhan
    // npm : 20081010060

    public static void main (String[] args) {
        // buat scanner
        Scanner scr = new Scanner(System.in);

        // inisiasi item
        Item itemUtama = new Item();
        System.out.println(itemUtama.menu());

        // inisiasi bakso halus
        BaksoHalus[] bh = new BaksoHalus[100];
        for (int i = 0; i < bh.length; i++) {
            bh[i] = new BaksoHalus();
        }
        // inisiasi bakso urat
        BaksoUrat[] bu = new BaksoUrat[100];
        for (int i = 0; i < bu.length; i++) {
            bu[i] = new BaksoUrat();
        }
        // inisiasi bakso telur puyuh
        BaksoTelurPuyuh[] btp = new BaksoTelurPuyuh[100];
        for (int i = 0; i < btp.length; i++) {
            btp[i] = new BaksoTelurPuyuh();
        }
        // inisiasi bakwan
        Bakwan[] b = new Bakwan[100];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Bakwan();
        }
        // inisiasi tahu
        Tahu[] t = new Tahu[100];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Tahu();
        }
        // inisiasi mie bihun
        MieBihun[] mb = new MieBihun[100];
        for (int i = 0; i < mb.length; i++) {
            mb[i] = new MieBihun();
        }

        int total = 0;
        String itemDibeli = "";
        String sisaItem = "";
        int untung = 0;

        int tambah;
        do {
            System.out.println("Pilih item : ");
            int item = scr.nextInt();
            System.out.println("Jumlah item : ");
            int jumlah = scr.nextInt();

            switch (item) {
                case 1:
                    total += bh[0].hargaJual(jumlah);
                    itemDibeli += bh[0].terjual(jumlah) + "\n";
                    sisaItem += bh[0].blmTerjual(jumlah) + "\n";
                    untung += bh[0].keuntungan(jumlah);
                    break;
                case 2:
                    total += bu[0].hargaJual(jumlah);
                    itemDibeli += bu[0].terjual(jumlah) + "\n";
                    sisaItem += bu[0].blmTerjual(jumlah) + "\n";
                    untung += bu[0].keuntungan(jumlah);
                    break;
                case 3:
                    total += btp[0].hargaJual(jumlah);
                    itemDibeli += btp[0].terjual(jumlah) + "\n";
                    sisaItem += btp[0].blmTerjual(jumlah) + "\n";
                    untung += btp[0].keuntungan(jumlah);
                    break;
                case 4:
                    total += b[0].hargaJual(jumlah);
                    itemDibeli += b[0].terjual(jumlah) + "\n";
                    sisaItem += b[0].blmTerjual(jumlah) + "\n";
                    untung += b[0].keuntungan(jumlah);
                    break;
                case 5:
                    total += t[0].hargaJual(jumlah);
                    itemDibeli += t[0].terjual(jumlah) + "\n";
                    sisaItem += t[0].blmTerjual(jumlah) + "\n";
                    untung += t[0].keuntungan(jumlah);
                    break;
                case 6:
                    total += mb[0].hargaJual(jumlah);
                    itemDibeli += mb[0].terjual(jumlah) + "\n";
                    sisaItem += mb[0].blmTerjual(jumlah) + "\n";
                    untung += mb[0].keuntungan(jumlah);
                    break;
                default:
                    throw new AssertionError();
            }

            System.out.println("Tambah item? [1. ya/2. tidak] : ");
            tambah = scr.nextInt();
        } while (tambah == 1);

        System.out.println("\nItem yang dibeli: \n" + itemDibeli);
        System.out.println("Jumlah harga yang harus dibayar: " + total);

        System.out.println("\nINFORMASI KEPADA KANG MAMAN");
        System.out.println("Daftar item yang telah terjual: \n" + itemDibeli);
        System.out.println("Daftar item yang belum terjual: \n" + sisaItem);
        System.out.println("Total keuntungan: \n" + untung);
    }
}
