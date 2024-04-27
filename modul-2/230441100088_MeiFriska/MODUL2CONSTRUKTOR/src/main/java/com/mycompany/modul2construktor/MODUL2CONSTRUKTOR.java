/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.modul2construktor;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MODUL2CONSTRUKTOR {

    public static void main(String[] args) {
        String Mengulang = "Y";
        
        while (Mengulang.equals("Y")) {
            Scanner input = new Scanner(System.in); 
            System.out.println("=============================");
            System.out.println("    Masukkan Data Mahasiswa  ");
            System.out.println("=============================");
            System.out.print("Universitas : "); 
            String universitas = input.nextLine();
            System.out.print("NIM : "); 
            String nim = input.nextLine();
            System.out.print("Nama : "); 
            String nama = input.nextLine();
            System.out.print("Alamat : "); 
            String alamat = input.nextLine();
            
            System.out.println("=====DAFTAR JURUSAN=====");
            System.out.println("41. TEKNIK INFORMATIKA");
            System.out.println("42. TEKNIK INDUSTRI");
            System.out.println("43. TEKNIK ELEKTRO");
            System.out.println("44. SISTEM INFORMASI");
            System.out.println("48. TEKNIK MESIN");
            System.out.println("49. TEKNIK MEKATRONIKA");
            System.out.print("Isi sesuai kode jurusan : ");
            String jurusan = input.nextLine();
            System.out.println(" ");  
            
            DATA1 mhs = new DATA1(universitas, nim, nama, alamat, jurusan);
            mhs.printData();
            
            System.out.println("Mengulang lagi? (Y untuk ya dan T untuk tidak)");
            System.out.print("Masukkan pilihan : ");
            Mengulang = input.nextLine();
        }
        System.out.println("===========================");
        System.out.println(" Terimakasih ");
        System.out.println("===========================");
 
    }
}


