/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan63.gradiengarislurus;

/**
 *
 * @author
 * NAMA             : Muhamad Syifa Amruloh
 * NIM              : 10118910
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menampilkan menghitung gradien garis lurus dengan inteface
 */
public class Koordinat implements GarisLurus {
    private int x1,x2,y1,y2;
    public Koordinat(int x1,int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }
    
    @Override
    public int hitungGradien() {
        int y = y1 - y2;
        int x = x1 - x2;
        return y / x;
    }
    
}
