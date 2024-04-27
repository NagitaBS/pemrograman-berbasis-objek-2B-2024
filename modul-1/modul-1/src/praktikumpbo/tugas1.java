/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo;

class Manusia {
    String Nama ;
    int Umur ;
    String Alamat ;
    
    void berjalan (){
        System.out.println(Nama + "sedang berjalan");
    }
    void berlari (){
        System.out.println (Nama + "sedang berlari");
    }
}
public class tugas1 {
        
     public static void main(String[] args) {
         Manusia orang1 = new Manusia ();
         Manusia orang2 = new Manusia ();
         Manusia orang3 = new Manusia ();
         
         orang1.Nama = "Budi";
         orang2.Nama = "Fizi";
         orang3.Nama = "Siti";
         
         orang1.Umur = 13;
         orang2.Umur = 14;
         orang3.Umur = 15;
         
         orang1.Alamat = "Indonesia";
         orang2.Alamat = "Malaysia";
         orang3.Alamat = "Singapura";
         
         System.out.println ("             ORANG PERTAMA           ");
         System.out.println("Nama     : "+orang1.Nama);
         System.out.println("Umur     : "+orang2.Umur);
         System.out.println("Alamat   : "+orang3.Alamat);
         orang1.berjalan();
         orang1.berlari();
         System.out.println(".................................");
         
         System.out.println();
         System.out.println ("             ORANG KEDUA           ");
         System.out.println("Nama     : "+orang1.Nama);
         System.out.println("Umur     : "+orang2.Umur);
         System.out.println("Alamat   : "+orang3.Alamat);
         orang2.berjalan();
         orang2.berlari();
         System.out.println(".................................");
     
         System.out.println();
         System.out.println ("             ORANG KETIGA           ");
         System.out.println("Nama     : "+orang1.Nama);
         System.out.println("Umur     : "+orang2.Umur);
         System.out.println("Alamat   : "+orang3.Alamat);
         orang3.berjalan();
         orang3.berlari();
         System.out.println(".................................");
     }
}
