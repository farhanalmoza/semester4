/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.construct;

/**
 *
 * @author farhan
 */
public class Kubus {
    // definisi atribut
    public int sisi, volume;

    // method
    public Kubus(int s) {
        sisi = s;
    }

    public Kubus() {
        sisi = 5;
    }

    // method
    int GetVolume() {
        int volume = sisi*sisi*sisi;
        System.out.println("Volume kubus = " + volume + "\n");
        return volume;
    }

    public static void main (String[] args) {
        System.out.println ("TUGAS 5 CLASS KUBUS");
        System.out.println("Kubus 1");
        Kubus k1 = new Kubus(3);
        k1.GetVolume();

        System.out.println("Kubus 2");
        Kubus k2 = new Kubus(4);
        k2.GetVolume();

        System.out.println("Kubus 3");
        Kubus k3 = new Kubus();
        k3.GetVolume();
    }
}
