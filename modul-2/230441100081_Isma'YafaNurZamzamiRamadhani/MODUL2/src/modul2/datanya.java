/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;
import java.util.Scanner;
/**
 *
 * @author HP VICTUS
 */
public class datanya extends setget {
    static String Alamat;
    static String Jurusan;
    
    public static String getAlamat(){
        return Alamat;
    }
    
    public static void setAlamat(String alamat){
        datanya.Alamat = alamat;
    }                                                    
    
    public static String getJurusan(){
        Scanner input = new Scanner(System.in);
        switch(Jurusan){
            case "41" -> { 
                System.out.println("|===================|");
                System.out.println("|  DATA MAHASISWA   |");
                System.out.println("|===================|\n");
                System.out.println("Universitas : " + getUniversitas());
                System.out.println("NIM         : " + setget.getNim());
                System.out.println("Nama        : " + setget.getNama());
                System.out.println("Alamat      : " + getAlamat());
                System.out.println("Jurusan   : Teknik Informatika");
            }
            case "42" -> { 
                System.out.println("|===================|");
                System.out.println("|  DATA MAHASISWA   |");
                System.out.println("|===================|\n");
                System.out.println("Universitas : " + getUniversitas());
                System.out.println("NIM         : " + setget.getNim());
                System.out.println("Nama        : " + setget.getNama());
                System.out.println("Alamat      : " + getAlamat());
                System.out.println("Jurusan   : Teknik Industri");
            }
            case "43" -> { 
                System.out.println("|===================|");
                System.out.println("|  DATA MAHASISWA   |");
                System.out.println("|===================|\n");
                System.out.println("Universitas : " + getUniversitas());
                System.out.println("NIM         : " + setget.getNim());
                System.out.println("Nama        : " + setget.getNama());
                System.out.println("Alamat      : " + getAlamat());
                System.out.println("Jurusan   : Teknik Elektro");
            }
            case "44" -> { 
                System.out.println("|===================|");
                System.out.println("|  DATA MAHASISWA   |");
                System.out.println("|===================|\n");
                System.out.println("Universitas : " + getUniversitas());
                System.out.println("NIM         : " + setget.getNim());
                System.out.println("Nama        : " + setget.getNama());
                System.out.println("Alamat      : " + getAlamat());
                System.out.println("Jurusan   : Sistem Informasi");
            }
            case "45" -> { 
                System.out.println("|===================|");
                System.out.println("|  DATA MAHASISWA   |");
                System.out.println("|===================|\n");
                System.out.println("Universitas : " + getUniversitas());
                System.out.println("NIM         : " + setget.getNim());
                System.out.println("Nama        : " + setget.getNama());
                System.out.println("Alamat      : " + getAlamat());
                System.out.println("Jurusan   : Teknik Mesin");
            }
            case "46" -> { 
                System.out.println("|===================|");
                System.out.println("|  DATA MAHASISWA   |");
                System.out.println("|===================|\n");
                System.out.println("Universitas : " + getUniversitas());
                System.out.println("NIM         : " + setget.getNim());
                System.out.println("Nama        : " + setget.getNama());
                System.out.println("Alamat      : " + getAlamat());
                System.out.println("Jurusan    : Teknik Mekatronika");
            }
            default -> { 
                System.out.println("KODE JURUSAN TIDAK ADA");
                System.out.print("Masukkan Kode Jurusan Anda Lagi :");
                Jurusan = input.nextLine();
                
            }   
        }
        return Jurusan;
        
    }
    public static void setJurusan(String jurusan){
        datanya.Jurusan = jurusan;
    }
    
}
