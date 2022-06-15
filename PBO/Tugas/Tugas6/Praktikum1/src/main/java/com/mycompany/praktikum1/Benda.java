/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum1;

/**
 *
 * @author farhan
 */
public class Benda {
    // definisi atribut
    String nama;
    int sudut;

    //construct
    public Benda() {
        this.nama = "benda";
        this.sudut = 0;
    }

    public Benda(String n, int s) {
        this.nama = n;
        this.sudut = s;
    }

    // methode
    public String getResult() {
        String result = "Nama benda adalah " + nama + " dengan jumlah sudut sebanyak " + sudut;
        return result;
    }

    //main
    public static void main (String[] args) {
        Benda benda1 = new Benda();
        System.out.println(benda1.getResult()+"\n");

        Benda benda2 = new Benda("segi empat", 4);
        System.out.println(benda2.getResult()+"\n");
    }
}
