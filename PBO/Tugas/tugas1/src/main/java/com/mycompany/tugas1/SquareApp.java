/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author farhan
 */
public class SquareApp {
    public static void main(String[] args) {
        Square square1 = new Square();
        square1.sisi = 4;
        System.out.println("keliling 1 = " + square1.getKeliling());
        System.out.println("luas 1 = " + square1.getLuas());

        Square square2 = new Square();
        square2.sisi = 5;
        System.out.println("keliling 2 = " + square2.getKeliling());
        System.out.println("luas 2 = " + square2.getLuas());

        Square square3 = new Square();
        square3.sisi = 6;
        System.out.println("keliling 3 = " + square3.getKeliling());
        System.out.println("luas 3 = " + square3.getLuas());
    }
}
