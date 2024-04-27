/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktp;
import java.util.Scanner;
/**
 *
 * @author TOSHIBA
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.println("Masukkan data untuk pembuatan KTP:");
        System.out.print("Nomor Induk: ");
        String nomorInduk = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();
        System.out.print("Tanggal Lahir (format: DD/MM/YYYY): ");
        String tanggalLahir = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Agama: ");
        String agama = scanner.nextLine();
        System.out.print("Status Perkawinan: ");
        String status = scanner.nextLine();
        System.out.print("Kewarganegaraan: ");
        String kewarganegaraan = scanner.nextLine();

        // Membuat objek KTP
        KTP ktp = new KTP(nomorInduk, nama, tempatLahir, tanggalLahir, alamat, agama, status, kewarganegaraan);
        // Menampilkan informasi KTP
        ktp.displayInfo();

        scanner.close();
    }
}