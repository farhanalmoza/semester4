/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.overloading_overriding;

/**
 *
 * @author farhan
 */
public class Kucing extends Hewan {
    public Kucing(int k) {
        super(k);
        System.out.println("Aku kucing");
    }

    public void makan() { // overriding
        System.out.println("Kucing sedang makan...");
    }

    public void makan(String makanan) { // overloading
        System.out.println("Kucing sedang makan " + makanan);
    }
}
