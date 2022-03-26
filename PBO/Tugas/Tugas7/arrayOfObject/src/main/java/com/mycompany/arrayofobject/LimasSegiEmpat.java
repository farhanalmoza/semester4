/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayofobject;

/**
 *
 * @author farhan
 */
public class LimasSegiEmpat {
    // definisi atribut
    public int sisi, tinggi;
    public float volume;

    // construct
    public LimasSegiEmpat(int s, int t) {
        sisi = s;
        tinggi = t;
    }

    // definisi method
    void ComputeAndSetVolume() {
        volume = (float) 1/3 * (sisi*sisi) * tinggi;
    }

    public float GetVolume() {
        ComputeAndSetVolume();
        System.out.println("Volume Limas Segi Empat = " + volume);
        return volume;
    }

    public static void main (String[] args) {
        LimasSegiEmpat[] lse = new LimasSegiEmpat[5];
        for (int i = 0; i < lse.length; i++) {
            lse[i] = new LimasSegiEmpat(i+3, i+3);
        }

        for (int i = 0; i < lse.length; i++) {
            lse[i].GetVolume();
        }
    }
}
