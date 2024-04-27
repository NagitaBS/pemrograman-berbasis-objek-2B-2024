/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasir;

import java.util.HashMap;

/**
 *
 * @author ASUS
 */

public class Kasir {
    // Tipe data berbeda
    static String pesanSelamatDatang = "Selamat datang di toko kami!";
    static double tarifDiskon = 0.1;
    static HashMap <String, Double> hargaBarang = new HashMap <>();

    String[] barang;
    int[] kuantitas;

    // Konstruktor
    public Kasir(String[] barang, int[] kuantitas) {
        this.barang = barang;
        this.kuantitas = kuantitas;
    }

    // Method untuk menambahkan harga produk ke dalam daftar
    public static void tambahHargaBarang(String namaBarang, double harga) {
        hargaBarang.put(namaBarang, harga);
    }

    // Method untuk menghitung total harga belanjaan
    public double hitungTotal() {
        double total = 0;
        for (int i = 0; i < barang.length; i++) {
            if (hargaBarang.containsKey(barang[i])) {
                total += hargaBarang.get(barang[i]) * kuantitas[i];
            }
        }
        return total;
    }

    // Method untuk menampilkan detail belanjaan
    public void tampilkanStruk() {
        System.out.println("===== Struk Belanja =====");
        for (int i = 0; i < barang.length; i++) {
            System.out.println(barang[i] + " - " + kuantitas[i] + " pcs");
        }
        System.out.println("Total harga: Rp. " + hitungTotal());
    }

    // Method untuk menghitung jumlah diskon
    public double hitungDiskon() {
        return hitungTotal() * tarifDiskon;
    }

    // Method untuk menampilkan pesan selamat datang
    public static void tampilkanPesanSelamatDatang() {
        System.out.println(pesanSelamatDatang);
    }

    public static void main(String[] args) {
        // Menggunakan konstruktor
        String[] barang = {"Beras", "Gula", "Minyak"};
        int[] kuantitas = {2, 1, 3};
        Kasir kasir = new Kasir(barang, kuantitas);

        // Menggunakan keyword static
        tambahHargaBarang("Beras", 15000);
        tambahHargaBarang("Gula", 12000);
        tambahHargaBarang("Minyak", 25000);

        tampilkanPesanSelamatDatang();

        // Menampilkan detail belanjaan
        kasir.tampilkanStruk();

        // Menghitung dan menampilkan jumlah diskon
        double jumlahDiskon = kasir.hitungDiskon();
        System.out.println("Diskon: Rp. " + jumlahDiskon);

        // Menampilkan total harga setelah diskon
        System.out.println("Total harga setelah diskon: Rp. " + (kasir.hitungTotal() - jumlahDiskon));
    }
}

    /**
     * @param args the command line arguments
     */
       

