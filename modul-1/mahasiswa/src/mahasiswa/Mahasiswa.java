/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
import java.util.Scanner;
/**
 *
 * @author natas
 */
public class Mahasiswa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nama,nim,prodi,alamat;
        
        System.out.print("Masukan Nama : ");
        nama= sc.nextLine();
        System.out.print("Masukan Nim : ");
        nim= sc.nextLine();
        System.out.print("Masukan Prodi : ");
        prodi= sc.nextLine();
        System.out.print("Masukan Alamat : ");
        alamat= sc.nextLine();
        
        
        System.out.println("");
        System.out.println("====================");
        System.out.println("   Data Mahasiswa   ");
        System.out.println("====================");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Prodi   : " + prodi);
        System.out.println("Alamat  : " + alamat);
    }
    }
