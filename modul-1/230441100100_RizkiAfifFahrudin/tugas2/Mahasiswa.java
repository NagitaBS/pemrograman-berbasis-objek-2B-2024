/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

import java.util.Scanner;
        
public class Mahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Informasi Mahasiswa");
        
        System.out.println("Nama : ");
        String nama = scanner.nextLine();
        
        System.out.println("NIM : ");
        String nim = scanner.nextLine();
        
        System.out.println("Prodi/Jurusan : ");
        String prodi = scanner.nextLine();
        
        System.out.println("Alamat : ");
        String alamat = scanner.nextLine();
        
        System.out.println("Informasi Mahasiswa ");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi/Jurusan : " + prodi);
        System.out.println("Alamat : " + alamat);
        
        scanner.close();
    }
    
}
