/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;
import java.util.Scanner;
/**
 *
 * @author HP VICTUS
 */
public class modul2ril {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ulang = "Y";
        while (ulang.equals("Y")){
            Scanner input = new Scanner(System.in);
            System.out.println("|===============================|");
            System.out.println("|    MASUKKAN DATA MAHASISWA    |");
            System.out.println("|===============================|");
            
            System.out.print("Masukkan Universitas : ");
            datanya.Universitas = input.nextLine();
             System.out.print("Masukkan NIM : ");
            datanya.NIM = input.nextLine();
             System.out.print("Masukkan Nama : ");
            datanya.Nama = input.nextLine();
             System.out.print("Masukkan Alamat : ");
            datanya.Alamat = input.nextLine();
            
            System.out.println("==========================");
            System.out.println(" | DAFTAR KODE JURUSAN | ");
            System.out.println("Teknik Informatika  [41]");
            System.out.println("Teknik Industri     [42]");
            System.out.println("Teknik Elektro      [43]");
            System.out.println("Sistem Informasi    [44]");
            System.out.println("Teknik Mesin        [45]");
            System.out.println("Teknik Mekatronika  [46]");
            System.out.println("==========================");
            System.out.printf("Masukkan Kode Jurusan : ");
            datanya.Jurusan = input.nextLine();
        
        datanya.getJurusan();
            System.out.println("apakah Ingin memasukkan data kembali ?");
            System.out.println("1.Y\n2.T");
            ulang = input.nextLine();
                if (ulang.startsWith("y")){
                    ulang = "Y";
                }
                else {
                    System.out.println("TERIMA KASIH");
               
                }
        }
    }
// TODO code application logic here
    }
    
