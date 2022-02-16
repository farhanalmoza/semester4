/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author farhan
 */
public class Rectangle {
    // definisi atribut
    public int panjang;
    public int lebar;

    // definisi method
    int getKeliling() {
        int keliling = 2 * (panjang + lebar);
        return keliling;
    }

    int getLuas() {
        int luas = panjang * lebar;
        return luas;
    }
}
