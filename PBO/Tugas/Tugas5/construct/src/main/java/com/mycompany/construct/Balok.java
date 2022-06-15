/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.construct;

/**
 *
 * @author farhan
 */
public class Balok {
    // definisi atribut
    public int panjang, lebar, tinggi, volume;

    // construct
    public Balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public Balok() {
        panjang = 3;
        lebar = 3;
        tinggi = 3;
    }

    // method
    int GetVolume() {
        volume = panjang*lebar*tinggi;
        System.out.println("Volume balok = " + volume + "\n");
        return volume;
    }

    public static void main (String[] args) {
        System.out.println ("TUGAS 5 CLASS BALOK");
        System.out.println("Balok 1");
        Balok b1 = new Balok();
        b1.GetVolume();

        System.out.println("Balok 2");
        Balok b2 = new Balok(4, 4, 4);
        b2.GetVolume();        

        System.out.println("Balok 1");
        Balok b3 = new Balok(3, 4, 3);
        b3.GetVolume();  
    }
}
