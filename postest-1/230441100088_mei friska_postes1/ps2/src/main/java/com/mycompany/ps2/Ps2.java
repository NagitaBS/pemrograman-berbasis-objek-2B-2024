/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ps2;
import java.util.Scanner;
class Pelanggan {
    String nama;
    int meja;
    double menuMakanan;

    public Pelanggan(String nama, int meja, double menuMakanan) {
        this.nama = nama;
        this.meja = meja;
        this.menuMakanan = menuMakanan;
    }


    Pelanggan(String nama, int meja, String menuMakanan) {
        this.nama = nama;
        this.meja = meja;
        this.menuMakanan = Double.parseDouble(menuMakanan);
    }

    public String getNama() {
        return nama;
    }

    public int getMeja() {
        return meja;
    }

    public double getMenuMakanan() {
        return menuMakanan;
    }
}

class Pesanan {
    int harga;

    public Pesanan(String menuMakanan, int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
}

/**
 *
 * @author ASUS
 */
public class Ps2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mengulang = "ya";

        while (mengulang.equalsIgnoreCase("ya")) {
            System.out.println("=============================");
            System.out.println("       SETRUK PEMBELIAN      ");
            System.out.println("=============================");
            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("Meja : ");
            int meja = Integer.parseInt(input.nextLine());

            System.out.println("=====DAFTAR MENU=====");
            System.out.println("1. Ayam Geprek + Esteh - Rp. 20.000");
            System.out.println("2. Ayam Geprek + Es Jeruk - Rp. 22.000");
            System.out.println("3. Ayam Penyet + Esteh - Rp. 18.000");
            System.out.println("4. Ayam Penyet + Es Jeruk - Rp. 20.000");
            System.out.print("Pilih menu makanan (1/2/3/4): ");
            String menuMakanan = input.nextLine();

            Pesanan[] daftarPesanan = {
                new Pesanan("Ayam Geprek + Esteh", 20000),
                new Pesanan("Ayam Geprek + Es Jeruk", 22000),
                new Pesanan("Ayam Penyet + Esteh", 18000),
                new Pesanan("Ayam Penyet + Es Jeruk", 20000)
            };

            int hargaTotal = 0;
            switch (menuMakanan) {
                case "1" -> hargaTotal += daftarPesanan[0].getHarga();
                case "2" -> hargaTotal += daftarPesanan[1].getHarga();
                case "3" -> hargaTotal += daftarPesanan[2].getHarga();
                case "4" -> hargaTotal += daftarPesanan[3].getHarga();
                default -> System.out.println("Menu tidak valid");
            }

            Pelanggan pelanggan = new Pelanggan(nama, meja, menuMakanan);

            System.out.println(" ");
            System.out.println("==========Data Pelanggan==========");
            System.out.println("Nama : " + pelanggan.getNama());
            System.out.println("Meja : " + pelanggan.getMeja());
            System.out.println("Menu Makanan : " + pelanggan.getMenuMakanan());
            System.out.println("Total Harga: Rp. " + hargaTotal);
            System.out.println("==================================");

            System.out.println("Apakah ingin memesan lagi? (ya/tidak)");
            System.out.print("Masukkan pilihan : ");
            mengulang = input.nextLine();
        }
    
    }
}
