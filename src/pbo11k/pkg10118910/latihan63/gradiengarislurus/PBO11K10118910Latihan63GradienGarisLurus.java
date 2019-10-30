/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan63.gradiengarislurus;
/**
 * @author
 * NAMA             : Muhamad Syifa Amruloh
 * NIM              : 10118910
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menampilkan menghitung gradien garis lurus dengan inteface
 * 
 */
public class PBO11K10118910Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat koor1,koor2;
        koor1 = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+koor1.getX1()+","+koor1.getY1()+") dan ("+koor1.getX2()+","+koor1.getY2()+")");
        System.out.println("Memiliki gradien sebesar "+koor1.hitungGradien());
        koor2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+koor2.getX1()+","+koor2.getY1()+") dan ("+koor2.getX2()+","+koor2.getY2()+")");
        System.out.println("Memiliki gradien sebesar "+koor2.hitungGradien());
    }
    
}
