/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas345;

/**
 *
 * @author farhan
 */
public class LimasSegiEmpat {
    // definisi atribut
    public int sisi, tinggi;
    public float volume;

    // definisi method
    public int SetSisi(int s) {
        sisi = s;
        return sisi;
    }

    public int SetTinggi(int t) {
        tinggi = t;
        return tinggi;
    }

    public float ComputeAndSetVolume() {
        volume = (float) 1/3 * (sisi*sisi) * tinggi;
        return volume;
    }

    public float GetVolume() {
        System.out.println("Volume Limas Segi Empat = " + ComputeAndSetVolume());
        return 0;
    }
}
