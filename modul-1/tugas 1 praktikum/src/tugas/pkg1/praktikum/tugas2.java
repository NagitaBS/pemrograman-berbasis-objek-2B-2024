/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1.praktikum;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class tugas2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Mahasiswa : ");
        String namainput = input.nextLine();
        
        System.out.println("Masukkan NIM Mahasiswa :");
        String niminput =input.nextLine();
        
        System.out.println("Masukkan Prodi Atau Jurusan Anda :");
        String jurusaninput = input.nextLine();
        
        System.out.println("Masukkan Alamat Mahasiswa :");
        String alamatinput = input.nextLine();
        
        System.out.println("Nama : " + namainput );
        System.out.println("NIM : " + niminput );
        System.out.println("Prodi : " + jurusaninput );
        System.out.println("Alamat :" +alamatinput);
    }
}
