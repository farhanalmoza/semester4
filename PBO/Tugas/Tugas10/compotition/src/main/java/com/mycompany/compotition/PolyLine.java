/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compotition;

import java.util.Arrays;

/**
 *
 * @author farhan
 */
public class PolyLine {
    private Point[] points;
    private int jumlahPoint;

    public PolyLine(int size){
        jumlahPoint = size;
        this.points = new Point[size];
    }

    public void appendPoint(Point[] p) {
        for (int i = 0; i < jumlahPoint; i++)
            this.points[i] = new Point (p[i].getX(), p[i].getY());
    }

    public void cetak() {
        for (int i=0; i < jumlahPoint; i++){
            System.out.print("(" + points[i].getX() + "," + points[i].getY() + "), ");
        }
    }

    public static void main (String[] args) {
        Point[] points = new Point[] {
            new Point(4, 2),
            new Point(8, 5),
            new Point(1, 7)
        };
        points[1].cetak();

        PolyLine pl1 = new PolyLine (3);
        pl1.appendPoint(points);
        pl1.cetak ();
    }
}
