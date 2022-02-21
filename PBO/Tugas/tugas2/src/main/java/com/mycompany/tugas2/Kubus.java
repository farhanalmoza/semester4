/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas2;

/**
 *
 * @author farhan
 */
public class Kubus {
    // definisi atribut
    public int sisi, volume;

    // method
    int SetSisi(int SisiBaru) {
        sisi = SisiBaru;
        return sisi;
    }

    int ComputeAndSetVolume() {
        int volume = sisi*sisi*sisi;
        return volume;
    }

    int GetVolume() {
        System.out.println("Volume kubus = " + ComputeAndSetVolume() + "\n");
        return 0;
    }
}
