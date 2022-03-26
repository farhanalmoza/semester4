/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayofobject;

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

    // method
    void ComputeAndSetVolume() {
        volume = panjang*lebar*tinggi;
    }

    int GetVolume() {
        ComputeAndSetVolume ();
        System.out.println("Volume balok = " + volume + "\n");
        return volume;
    }

    public static void main (String[] args) {
        Balok[] b = new Balok[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Balok(i+3, i+4, i+1);
        }

        for (int i = 0; i < b.length; i++) {
            b[i].GetVolume();
        }
    }
}
