/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author farhan
 */
public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.panjang = 4;
        rectangle1.lebar = 3;
        System.out.println("keliling 1 = " + rectangle1.getKeliling());
        System.out.println("luas 1 = " + rectangle1.getLuas());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.panjang = 5;
        rectangle2.lebar = 4;
        System.out.println("keliling 2 = " + rectangle2.getKeliling());
        System.out.println("luas 2 = " + rectangle2.getLuas());

        Rectangle rectangle3 = new Rectangle();
        rectangle3.panjang = 6;
        rectangle3.lebar = 3;
        System.out.println("keliling 3 = " + rectangle3.getKeliling());
        System.out.println("luas 3 = " + rectangle3.getLuas());
    }
}
