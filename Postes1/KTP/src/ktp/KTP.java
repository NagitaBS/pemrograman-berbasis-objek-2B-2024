/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ktp;

/**
 *
 * @author TOSHIBA
 */
public class KTP {
    // Variabel-variabel instance
    private String nomorInduk;
    private String nama;
    private String tempatLahir;
    private String tanggalLahir;
    private String alamat;
    private String agama;
    private String status;
    private String kewarganegaraan;
    private static int counter = 1000; // Variabel static untuk nomor KTP

    // Konstruktor untuk inisialisasi data KTP
    public KTP(String nomorInduk, String nama, String tempatLahir, String tanggalLahir, String alamat, String agama, String status, String kewarganegaraan) {
        this.nomorInduk = nomorInduk;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.agama = agama;
        this.status = status;
        this.kewarganegaraan = kewarganegaraan;
    }

    // Metode untuk menampilkan informasi KTP
    public void displayInfo() {
        System.out.println("===== KTP =====");
        System.out.println("Nomor KTP: " + generateNomorKTP());
        System.out.println("Nomor Induk: " + nomorInduk);
        System.out.println("Nama: " + nama);
        System.out.println("Tempat/Tanggal Lahir: " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Alamat: " + alamat);
        System.out.println("Agama: " + agama);
        System.out.println("Status Perkawinan: " + status);
        System.out.println("Kewarganegaraan: " + kewarganegaraan);
        System.out.println("================");
    }

    // Metode static untuk menghasilkan nomor KTP unik
    private static String generateNomorKTP() {
        return "KTP-" + counter++;
    }
}


    
