/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.construct;

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

    public LimasSegiEmpat() {
        sisi = 5;
        tinggi = 5;
    }

    // definisi method
    public float GetVolume() {
        volume = (float) 1/3 * (sisi*sisi) * tinggi;
        System.out.println("Volume Limas Segi Empat = " + volume);
        return volume;
    }

    public static void main (String[] args) {
        LimasSegiEmpat lse1 = new LimasSegiEmpat(4, 3);
        lse1.GetVolume();
        System.out.println("\n");

        LimasSegiEmpat lse2 = new LimasSegiEmpat(5, 3);
        lse2.GetVolume();
        System.out.println("\n");

        LimasSegiEmpat lse3 = new LimasSegiEmpat();
        lse3.GetVolume();
        System.out.println("\n");
    }
}
