/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitas;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */

public class AplikasiDataMahasiswa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String jawab;
        
        System.out.println("Masukkan Nama Universitas:");
        String namaUniversitas = scan.nextLine();
        Universitas.setUniv(namaUniversitas);
        
        do {
            System.out.println("Silahkan Input");
            System.out.println("Nama :");
            String nama = scan.nextLine();
            System.out.println("NIM :");
            String nim = scan.nextLine();
            System.out.println("Alamat :");
            String alamat = scan.nextLine();
            

            System.out.println("Jurusan");
            System.out.println("41=TEKNIK INFORMATIKA");
            System.out.println("42=TEKNIK INDUSTRI");
            System.out.println("43=TEKNIK ELEKTRO");
            System.out.println("44=SISTEM INFORMASI");
            System.out.println("48=TEKNIK MESIN");
            System.out.println("49=TEKNIK MEKATRONIKA");
            System.out.println("Pilih Kode Jurusan :");
            String kodeJurusan = scan.nextLine();
            String jurusan = "";
            System.out.println(" ");
            

            jurusan = switch (kodeJurusan) {
                 case "41" -> "TEKNIK INFORMATIKA";
                 case "42" -> "TEKNIK INDUSTRI";
                 case "43" -> "TEKNIK ELEKTRO";
                 case "44" -> "SISTEM INFORMASI";
                 case "48" -> "TEKNIK MESIN";
                 case "49" -> "TEKNIK MEKATRONIKA";
                 default -> "Tidak Tersedia";
             };

            Mahasiswa mhs1 = new Mahasiswa(nama, nim, alamat, jurusan);
            System.out.println("Nama :" + mhs1.nama);
            System.out.println("NIM :" + mhs1.nim);
            System.out.println("Alamat :" + mhs1.alamat);
            System.out.println("Jurusan :" + mhs1.jurusan);

            System.out.print("APAKAH ANDA INGIN MEMASUKKAN DATA LAGI ? Y/T:");
            jawab = scan.nextLine();
        } while (jawab.equalsIgnoreCase("Y"));
    }
}

