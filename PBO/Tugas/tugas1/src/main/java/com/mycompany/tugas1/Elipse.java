/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author farhan
 */
public class Elipse {
    // definisi atribut
    public int minor;
    public int mayor;

    // definisi method
    float getKeliling() {
        float keliling = (float) (2 * 3.14f * Math.sqrt((mayor*mayor + minor*minor)/2));
        return keliling;
    }

    float getLuas() {
        float luas = 3.14f * mayor * minor;
        return luas;
    }
}
