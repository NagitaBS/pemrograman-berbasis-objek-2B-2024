/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Universitas {
    static String namaUniversitas = "";

    static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    static String getNamaUniversitas() {
        return namaUniversitas;
    }
}

class Mahasiswa extends Universitas {
    String nim;
    String nama;
    String alamat;
    String jurusan;

    Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    void displayInfo() {
        HashMap<String, String> jurusanMap = new HashMap<>();
        jurusanMap.put("41", "TEKNIK INFORMATIKA");
        jurusanMap.put("42", "TEKNIK INDUSTRI");
        jurusanMap.put("43", "TEKNIK ELEKTRO");
        jurusanMap.put("44", "SISTEM INFORMASI");
        jurusanMap.put("48", "TEKNIK MESIN");
        jurusanMap.put("49", "TEKNIK MEKATRONIKA");

        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        
        System.out.println("Jurusan: " + jurusanMap.getOrDefault(jurusan, "kode tidak valid!"));
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        Universitas.setNamaUniversitas("Universitas Tetap Menyala");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMasukkan data mahasiswa:");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Kode Jarusan\n");
            System.out.print("41 TEKNIK INFORMATIKA\n");
            System.out.print("42 TEKNIK INDUSTRI\n"); 
            System.out.print("43 TEKNIK ELEKTRO\n"); 
            System.out.print("44 SISTEM INFORMASI\n"); 
            System.out.print("48 TEKNIK MESIN\n"); 
            System.out.print("49 TEKNIK MEKATRONIKA\n");
            System.out.print("Masukkan Kode Jurusan: ");
            String jurusan = scanner.nextLine();
          
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            String lagi = scanner.nextLine();
            if (!lagi.equalsIgnoreCase("Y")) {
                break;
            }
        }

        System.out.println("\nDaftar Mahasiswa di " + Universitas.getNamaUniversitas());
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.displayInfo();
        }
    }
}
