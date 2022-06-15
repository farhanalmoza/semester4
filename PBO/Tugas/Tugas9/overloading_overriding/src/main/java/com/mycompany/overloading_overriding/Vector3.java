/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.overloading_overriding;

/**
 *
 * @author farhan
 */
public class Vector3 {
    int node[] = new int[3];
    int hasilps[] = new int[3];

    public Vector3(int x, int y, int z) {
        node[0] = x;
        node[1] = y;
        node[2] = z;
    }

    public int[] perkalian(int skalar) {
        hasilps[0] = node[0] * skalar;
        hasilps[1] = node[1] * skalar;
        hasilps[2] = node[2] * skalar;
        return hasilps;
    }

    public int perkalian(int x, int y, int z) {
        int hasilcp = node[0] * x + node[1] * y + node[2] * z;
        return hasilcp;
    }
}
