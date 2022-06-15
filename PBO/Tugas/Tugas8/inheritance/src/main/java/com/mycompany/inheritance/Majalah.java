/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author farhan
 */
public class Majalah extends Koleksi {
    private String Edisi;
    
    public Majalah(String judul, String Edisi, String penerbit, int tahun) {
        super (judul, penerbit, tahun);
        this.Edisi = Edisi;
    }
 
    public String toString() {
        return "Judul Majalah: " + judul + "\n" +
               "Edisi: " + Edisi + "\n" +
               "Penerbit: " + penerbit + "\n" +
               "Tahun Terbit: " + tahun;
    } 
}
