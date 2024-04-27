/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1.soal2;

import java.util.Scanner;

class mahasiswautm {
    String nama;
    long nim;
    String jurusan;
    String prodi;
    String alamat;
    
    public void tampilkanData(){
       System.out.println("=======DATA MAHASISWA=====");
       System.out.println("Nama Mahasiswa :"+ nama);
       System.out.println("NIM :"+ nim);
       System.out.println("jurusan " + jurusan);
       System.out.println("Prodi :"+ prodi);
       System.out.println("Alamat :"+ alamat);
    }
}

public class Mahasiswa{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mahasiswautm utm = new mahasiswautm();
        
        System.out.print("Masukkan Nama Mahasiswa :");
        utm.nama = input.nextLine();
        
        System.out.print("Masukkan NIM Mahasiswa :");
        utm.nim = input.nextLong();
        input.nextLine();
        
        System.out.print("Masukan Jurusan Mahasiswa :");
        utm.jurusan = input.nextLine();
        
        System.out.print("Masukkan Prodi Mahasiswa :");
        utm.prodi = input.nextLine();
        
        System.out.print("Masukkan Alamat Mahasiswa :");
        utm.alamat = input.nextLine();
        
        System.out.println("\nData Mahasiswa UTM");
        utm.tampilkanData();
    }
}