/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.overloading_overriding;

import java.util.Arrays;

/**
 *
 * @author farhan
 */
public class Main {
    public static void main (String[] args) {
        Vector3 v1 = new Vector3(3, 1, 5);
        int skalar = 7;
        System.out.println("Perkalian vektor dengan skalar");
        System.out.print(Arrays.toString(v1.node) + " * " + skalar + " = ");
        System.out.println(Arrays.toString(v1.perkalian(skalar)) + "\n");

        System.out.println("Perkalian vektor dengen vektor");
        System.out.print(Arrays.toString(v1.node) + " * [3, 7, 1] = ");
        System.out.println(v1.perkalian(3, 7, 1));

        System.out.println("-----------------------------\n");

        Hewan ular = new Hewan();
        ular.makan();
        System.out.println("-----------------------------\n");

        Kucing k1 = new Kucing(4);
        k1.toString();
        k1.makan();
        k1.makan("daging");
        System.out.println("-----------------------------\n");

        Jenis anggora = new Jenis("anggora", "subtropis", 4);
        anggora.toString();
        anggora.makan("daging ikan", 2);
        System.out.println("-----------------------------\n");
    }
}
