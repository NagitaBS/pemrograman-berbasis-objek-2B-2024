/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package modul1;
import java.util. Scanner;
/**
 *
 * @author ASUS
 */
public class Modul1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama, nim, ttl, alamat;

        
        System.out.print("nama :");
        nama = input.nextLine();
        System.out.print("nim :");
        nim = input.nextLine();
        System.out.print("ttl :");
        ttl = input.nextLine();
        System.out.print("alamat :");
        alamat = input.nextLine(); 
       
        System.out.println("================================");
        System.out.println("SELAMAT DATANG DI DATA DIRI SAYA");
        System.out.println("================================");
        System.out.println("nama    :" + nama);
        System.out.println("nim     :" + nim);
        System.out.println("ttl     :" + ttl);
        System.out.println("alamat  :"+ alamat);
        System.out.println("================================");
        System.out.println("  CUKUP SEKIAN DATA DIRI SAYA   ");
        System.out.println("================================");
      
                
    }
}
