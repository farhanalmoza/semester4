/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas2;

/**
 *
 * @author farhan
 */
public class Balok {
    // definisi atribut
    public int panjang, lebar, tinggi, volume;

    // method
    int SetPanjang(int p) {
        panjang = p;
        return panjang;
    }

    int SetLebar(int l) {
        lebar = l;
        return lebar;
    }
    int SetTinggi(int t) {
        tinggi = t;
        return tinggi;
    }

    int ComputeAndSetVolume() {
        volume = panjang*lebar*tinggi;
        return volume;
    }

    int GetVolume() {
        System.out.println("Volume balok = " + ComputeAndSetVolume() + "\n");
        return 0;
    }
}
