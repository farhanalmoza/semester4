/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.construct;

/**
 *
 * @author farhan
 */
public class Tabung {
    // definisi atribut
    public int radius, tinggi;
    public float volume;

    // construct
    public Tabung(int r, int t) {
        radius = r;
        tinggi = t;
    }

    public Tabung() {
        radius = 5;
        tinggi = 5;
    }

    // definisi methode
    public float GetVolume() {
        volume = 3.14f * (radius*radius) * tinggi;
        System.out.println("Volume Tabung = " + volume);
        return volume;
    }

    public static void main (String[] args) {
        Tabung t1 = new Tabung(4, 3);
        t1.GetVolume();
        System.out.println("\n");

        Tabung t2 = new Tabung(5, 3);
        t2.GetVolume();
        System.out.println("\n");

        Tabung t3 = new Tabung();
        t3.GetVolume();
        System.out.println("\n");
    }
}
