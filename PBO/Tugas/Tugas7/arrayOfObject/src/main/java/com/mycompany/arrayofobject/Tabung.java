/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayofobject;

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

    // definisi methode
    void ComputeAndSetVolume() {
        volume = (float) 4/3 * 3.14f * (radius*radius);
    }

    public float GetVolume() {
        ComputeAndSetVolume();
        System.out.println("Volume Tabung = " + volume);
        return volume;
    }

    public static void main (String[] args) {
        Tabung[] t = new Tabung[5];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Tabung(i+1, i+3);
        }

        for (int i = 0; i < t.length; i++) {
            t[i].GetVolume();
        }

        int i = 0;
        float jv = 0;
        for (Tabung vt : t) {
            i++;
            jv += vt.volume;
            if (i == t.length) {
                float rerata = jv / t.length;
                System.out.println("\nRata-rata dari volume tabung dalam array adalah " + rerata);
            }
        }
    }
}
