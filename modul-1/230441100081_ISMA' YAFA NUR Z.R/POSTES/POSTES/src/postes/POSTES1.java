/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postes;
import java.util.Scanner;
/**
 *
 * @author HP VICTUS
 */
public class POSTES1 {
String brand;
String nama;
static int tahun = 0;
long harga;


public POSTES1(String brand, String nama, int tahun, long harga) {
    this.nama = nama;
    this.brand = brand;
    POSTES1.tahun = tahun;
    this.harga = harga;
}


public void displayInfo() {
        System.out.println("Nama Pemilik: " + nama);
        System.out.println("Brand: " + brand);
        System.out.println("Tahun: " + tahun);
        System.out.println("Harga: " + harga);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner jual = new Scanner(System.in);
        System.out.println("=== TOKO JUAL MOBIL ===");
        // Input data mobil pertama
        System.out.println("\n Masukkan Detail Mobil Anda :");
        System.out.print("Enter nama: ");
        String nama1 = jual.nextLine();
        System.out.print("Enter brand: ");
        String brand1 = jual.nextLine();
        System.out.print("Enter tahun: ");
        int tahun1 = jual.nextInt();
        System.out.print("Enter harga: ");
        long harga1 = jual.nextLong();
        POSTES1 mobil1 = new POSTES1 (brand1,nama1,tahun1,harga1);
        System.out.println("\nDetails of Car:");
        mobil1.displayInfo();
    }
    }


        
        
        
 
    
