/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayofobject;

/**
 *
 * @author farhan
 */
public class Bola {
    // definisi atribut
    public int radius;
    public float volume;

    // construct
    public Bola(int r) {
        radius = r;
    }

    // definisi method
    void ComputeAndSetVolume() {
        volume = (float) 4/3 * 3.14f * (radius*radius);
    }

    public float GetVolume() {
        ComputeAndSetVolume();
        System.out.println("Volume Bola = " + volume);
        return volume;
    }

    // main program
    public static void main (String[] args) {
        Bola[] bl = new Bola[5];
        for (int i = 0; i < bl.length; i++) {
            bl[i] = new Bola(i+2);
        }

        for (int i = 0; i < bl.length; i++) {
            bl[i].GetVolume();
        }

        int i = 0;
        float jv = 0;
        for (Bola vbl : bl) {
            i++;
            jv += vbl.volume;
            if (i == bl.length) {
                float rerata = jv / bl.length;
                System.out.println("\nRata-rata dari volume bola dalam array adalah " + rerata);
            }
        }
    }
}
