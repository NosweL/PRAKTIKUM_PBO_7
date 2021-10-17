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
public class Mahasiswa extends Manusia {

    @Override
    public void makan() {
        System.out.println("Mahasiswa Diharuskan Makan");
    }

    public void tidur() {
        System.out.println("Mahasiswa memiliki banyak waktu untuk tidur");
        System.out.println();
    }
}
