/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas345;

/**
 *
 * @author farhan
 */
public class Bola {
    // definisi atribut
    public int radius;
    public float volume;

    // definisi method
    public int SetRadius(int r) {
        radius = r;
        return radius;
    }

    public float ComputeAndSetVolume() {
        volume = (float) 4/3 * 3.14f * (radius*radius);
        return volume;
    }

    public float GetVolume() {
        System.out.println("Volume Bola = " + ComputeAndSetVolume());
        return 0;
    }
}
