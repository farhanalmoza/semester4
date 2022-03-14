/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas345;

/**
 *
 * @author farhan
 */
public class Tabung {
    // definisi atribut
    public int radius, tinggi;
    public float volume;

    public int SetRadius(int r) {
        radius = r;
        return radius;
    }

    public int SetTinggi(int t) {
        tinggi = t;
        return tinggi;
    }

    public float ComputeAndSetVolume() {
        volume = 3.14f * (radius*radius) * tinggi;
        return volume;
    }

    public float GetVolume() {
        System.out.println("Volume Tabung = " + ComputeAndSetVolume());
        return 0;
    }
}
