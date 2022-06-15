/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.overloading_overriding;

/**
 *
 * @author farhan
 */
public class Hewan {
    int kaki;

    public Hewan() {
        System.out.println("Aku hewan tak berkaki");
    }

    public Hewan(int k) {
        kaki = k;
    }

    public void makan(){
        System.out.println("Hewan sedang makan...");
    }

    @Override
    public String toString(){
        return "Aku adalah hewan yang memiliki " + kaki + " kaki";
    }
}
