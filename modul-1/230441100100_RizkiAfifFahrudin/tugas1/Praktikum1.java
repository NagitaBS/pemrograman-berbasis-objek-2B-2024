/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

public class Praktikum1 {

    public static void main(String[] args) {
        Manusia Manusia1 = new Manusia();
        Manusia Manusia2 = new Manusia();
        
        Manusia1.nama="Rizki";
        Manusia1.umur=20;
        Manusia1.alamat="Midgard";
        
        Manusia2.nama="Udin";
        Manusia2.umur=25;
        Manusia2.alamat="Asgard";
        
        System.out.println("Nama : " + Manusia1.nama);
        System.out.println("Umur : " + Manusia1.umur);
        System.out.println("Alamat : " + Manusia1.alamat);
        Manusia1.Berlari();
        
        System.out.println("Nama : " + Manusia2.nama);
        System.out.println("Umur : " + Manusia2.umur);
        System.out.println("Alamat : " + Manusia2.alamat);
        Manusia2.berjalan();
    }
    
}
