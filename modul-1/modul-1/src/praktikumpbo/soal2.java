/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo;
import java.util.Scanner;

public class soal2 {
    
    public static void main(String[] args) {
       java.util.Scanner input = new java.util.Scanner (System.in);
        
        String Nama;
        Long NIM;
        String Prodi;
        String Alamat;
        
        System.out.print ("Input Nama =   "); 
        Nama = input.nextLine ();
        System.out.print ("Input NIM = ");
        NIM = input.nextLong ();
        input.nextLine ();
        System.out.print ("Input Prodi = ");
        Prodi = input.nextLine ();
        System.out.print ("Input Alamat = ");
        Alamat = input.nextLine ();
        
        System.out.println("...........................");
        System.out.println("Nama saya = " + Nama);
        System.out.println("NIM saya = " + NIM);
        System.out.println("Prodi saya = " + Prodi);
        System.out.println("Alamat saya = " + Alamat);
    }
    }
    
    

