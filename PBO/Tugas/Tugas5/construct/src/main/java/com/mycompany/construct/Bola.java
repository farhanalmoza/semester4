/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.construct;

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

    public Bola() {
        radius = 5;
    }

    // definisi method
    public float GetVolume() {
        volume = (float) 4/3 * 3.14f * (radius*radius);
        System.out.println("Volume Bola = " + volume);
        return volume;
    }

    // main program
    public static void main (String[] args) {
        Bola b1 = new Bola(4);
        b1.GetVolume();
        System.out.println("\n");
        
        Bola b2 = new Bola();
        b2.GetVolume();
        System.out.println("\n");

        Bola b3 = new Bola(6);
        b3.GetVolume();
    }
}
