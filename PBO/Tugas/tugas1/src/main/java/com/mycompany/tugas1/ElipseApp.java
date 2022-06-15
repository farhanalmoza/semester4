/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author farhan
 */
public class ElipseApp {
    public static void main (String[] args) {
        Elipse elipse1 = new Elipse();
        elipse1.mayor = 7;
        elipse1.minor = 5;
        System.out.println("Keliling 1 = " + elipse1.getKeliling());
        System.out.println("Luas 1 = " + elipse1.getLuas());

        Elipse elipse2 = new Elipse();
        elipse2.mayor = 10;
        elipse2.minor = 8;
        System.out.println("Keliling 1 = " + elipse2.getKeliling());
        System.out.println("Luas 1 = " + elipse2.getLuas());

        Elipse elipse3 = new Elipse();
        elipse3.mayor = 10;
        elipse3.minor = 7;
        System.out.println("Keliling 1 = " + elipse3.getKeliling());
        System.out.println("Luas 1 = " + elipse3.getLuas());
    }
}
