/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.overloading_overriding;

/**
 *
 * @author farhan
 */
public class Jenis extends Kucing {
    String ras;
    String habitat;

    public Jenis(String r, String h, int kaki) {
        super(kaki);
        ras = r;
        habitat = h;
    }

    @Override
    public String toString() {
        return "Kucing ras : " + ras + ", habitat : " + habitat;
    }

    public void makan(String makanan, int jumlah){
        System.out.println("Kucing " + ras + " sedang makan " + jumlah + " " + makanan);
    }
}
