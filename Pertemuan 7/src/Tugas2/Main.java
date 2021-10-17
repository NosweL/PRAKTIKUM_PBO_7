/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author welso
 */
public class Main {

    public static void main(String[] args) {
        
        
        System.out.println("===== MANUSIA =====");
        Manusia m1 = new Manusia();
        m1.bernafas();
        m1.makan();

        
        System.out.println("===== DOSEN =====");
        Manusia md1 = new Dosen();
        Dosen dosen = new Dosen();
        dosen.bernafas();
        md1.makan();
        dosen.lembur();

        
        System.out.println("===== MAHASISWA =====");
        Manusia mm1 = new Mahasiswa();
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.bernafas();
        mm1.makan();
        mhs1.tidur();
    }
}
