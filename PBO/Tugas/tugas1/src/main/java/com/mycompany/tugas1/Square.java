/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author farhan
 */
public class Square {
    // definisi atribut
    public int sisi;

    // definisi method
    int getKeliling() {
        int keliling = sisi * 4;
        return keliling;
    }

    int getLuas() {
        int luas = sisi * sisi;
        return luas;
    }
}
