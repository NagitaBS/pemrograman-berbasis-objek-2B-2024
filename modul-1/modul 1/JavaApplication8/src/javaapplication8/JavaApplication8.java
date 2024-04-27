/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author giska
 */
class manusia {
    String nama;
    int umur;
    
    public void berlari() {
        System.out.println("Objek ini " + this.nama + " berlari");
    }
        
    void berjalan () {
        System.out.println("objek ini " + this.nama + " berjalan");
    }

        
}
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia orang1 = new manusia ();
        manusia orang2 = new manusia();
        
        orang1.nama = "Giska";
        orang1.umur = 19;
        System.out.println("Nama Objek 1 adalah " + orang1.nama);
        System.out.println("umur Objek 1 adalah " + orang1.umur + " Tahun");
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih"); 
        
        orang2.nama = "Gusti";
        orang2.umur = 20;
        System.out.println("Nama Objek 2 adalah " + orang2.nama);
        System.out.println("Umur Objek 2 adalah " + orang2.umur + "Tahun");
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
    
}


