/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas2;

/**
 *
 * @author farhan
 */
public class MainApp {
    public static void main (String[] args) {
        System.out.println ("TUGAS 1 CLASS KUBUS");
        System.out.println("Kubus 1");
        Kubus k1 = new Kubus();
        System.out.println("sisi kubus = " + k1.SetSisi(5));
        k1.GetVolume();

        System.out.println("Kubus 2");
        Kubus k2 = new Kubus();
        System.out.println("sisi kubus = " + k2.SetSisi(6));
        k2.GetVolume();

        System.out.println("Kubus 3");
        Kubus k3 = new Kubus();
        System.out.println("sisi kubus = " + k3.SetSisi(7));
        k3.GetVolume();

        System.out.println ("TUGAS 2 CLASS BALOK");
        System.out.println("Balok 1");
        Balok b1 = new Balok();
        System.out.println("panjang balok = " + b1.SetPanjang(3));
        System.out.println("lebar balok = " + b1.SetLebar(4));
        System.out.println("tinggi balok = " + b1.SetTinggi(5));
        b1.GetVolume();

        System.out.println("Balok 2");
        Balok b2 = new Balok();
        System.out.println("panjang balok = " + b2.SetPanjang(7));
        System.out.println("lebar balok = " + b2.SetLebar(8));
        System.out.println("tinggi balok = " + b2.SetTinggi(9));
        b2.GetVolume();

        System.out.println("Balok 3");
        Balok b3 = new Balok();
        System.out.println("panjang balok = " + b3.SetPanjang(9));
        System.out.println("lebar balok = " + b3.SetLebar(7));
        System.out.println("tinggi balok = " + b3.SetTinggi(5));
        b3.GetVolume();
    }
}
