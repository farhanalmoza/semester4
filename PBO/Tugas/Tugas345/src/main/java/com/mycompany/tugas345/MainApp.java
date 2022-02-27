/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas345;

/**
 *
 * @author farhan
 */
public class MainApp {
    public static void main (String[] args) {
        // Tugas 3 Tabung
        System.out.println("Tabung 1");
        Tabung t1 = new Tabung();
        t1.SetRadius(7);
        t1.SetTinggi(21);
        t1.GetVolume();

        System.out.println("Tabung 2");
        Tabung t2 = new Tabung();
        t2.SetRadius(4);
        t2.SetTinggi(7);
        t2.GetVolume();

        System.out.println("Tabung 3");
        Tabung t3 = new Tabung();
        t3.SetRadius(5);
        t3.SetTinggi(8);
        t3.GetVolume();

        // Tugas 4 Limas Segi Empat
        System.out.println("\nLimas Segi Empat 1");
        LimasSegiEmpat lse1 = new LimasSegiEmpat();
        lse1.SetSisi(6);
        lse1.SetTinggi(5);
        lse1.GetVolume();

        System.out.println("Limas Segi Empat 2");
        LimasSegiEmpat lse2 = new LimasSegiEmpat();
        lse1.SetSisi(4);
        lse1.SetTinggi(3);
        lse1.GetVolume();

        System.out.println("Limas Segi Empat 3");
        LimasSegiEmpat lse3 = new LimasSegiEmpat();
        lse3.SetSisi(4);
        lse3.SetTinggi(6);
        lse3.GetVolume();
        lse3.ComputeAndSetVolume();

        // Tugas 5 Bola
        System.out.println("\nBola 1");
        Bola b1 = new Bola();
        b1.SetRadius(7);
        b1.GetVolume();

        System.out.println("Bola 2");
        Bola b2 = new Bola();
        b2.SetRadius(3);
        b2.GetVolume();

        System.out.println("Bola 3");
        Bola b3 = new Bola();
        b3.SetRadius(4);
        b3.GetVolume();
    }
}
