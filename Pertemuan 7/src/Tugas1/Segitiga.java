/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author welso
 */
public class Segitiga {

    public int sudut;
    public int keliling;
    public double keliling2;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        System.out.println("Sudut Total : " + sudut);
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        System.out.println("Sudut Total : " + sudut);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        keliling = sisiA + sisiB + sisiC;
        System.out.println("Keliling Total : " + keliling);
        return keliling;
    }

    public double keliling(int sisiA, int sisiB) {
        keliling2 = (sisiA * sisiA) + (sisiB * sisiB);
        System.out.println("Keliling : " + keliling2);
        return keliling2;
    }
}
