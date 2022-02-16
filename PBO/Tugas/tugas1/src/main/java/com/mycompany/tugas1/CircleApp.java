/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author farhan
 */
public class CircleApp {
    public static void main (String[] args) {
        Circle circle1 = new Circle();
        circle1.jariJari = 7;
        System.out.println("Keliling 1 = " + circle1.getKeliling());
        System.out.println("Luas 1 = " + circle1.getLuas());

        Circle circle2 = new Circle();
        circle2.jariJari = 14;
        System.out.println("Keliling 1 = " + circle2.getKeliling());
        System.out.println("Luas 1 = " + circle2.getLuas());

        Circle circle3 = new Circle();
        circle3.jariJari = 21;
        System.out.println("Keliling 1 = " + circle3.getKeliling());
        System.out.println("Luas 1 = " + circle3.getLuas());
    }
}
