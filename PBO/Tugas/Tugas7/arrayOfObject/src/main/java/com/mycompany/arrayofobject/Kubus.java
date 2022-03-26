/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayofobject;

/**
 *
 * @author farhan
 */
public class Kubus {
    // definisi atribut
    public int sisi, volume;

    // constructor
    public Kubus(int s) {
        sisi = s;
    }

    // method
    void ComputeAndSetVolume() {
        volume = sisi*sisi*sisi;
    }

    int GetVolume() {
        ComputeAndSetVolume();
        System.out.println("Volume kubus = " + volume + "\n");
        return volume;
    }

    public static void main (String[] args) {
        // inisiasi objek
        Kubus[] k = new Kubus[5];
        for (int i = 0; i < k.length; i++) {
            k[i] = new Kubus(i+3);
        }

        // print hasil
        for (int i = 0; i < k.length; i++) {
            k[i].GetVolume();
        }
    }
}
