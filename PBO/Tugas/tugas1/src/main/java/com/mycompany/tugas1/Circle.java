/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author farhan
 */
public class Circle {
    // definisi atribut
    public int jariJari;

    // definisi method
    float getKeliling() {
        float keliling = 2 * 3.14f * jariJari;
        return keliling;
    }

    float getLuas() {
        float luas = 3.14f * jariJari * jariJari;
        return luas;
    }
}
