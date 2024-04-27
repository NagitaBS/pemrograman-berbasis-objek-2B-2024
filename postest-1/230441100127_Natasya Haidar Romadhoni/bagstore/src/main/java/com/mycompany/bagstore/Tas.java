/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bagstore;

/**
 *
 * @author natas
 */
class Tas {
    private String jenis;
    private int jumlah;
    private double price;
    
    // Atribut static
    private static int totalTas = 0;
    
    public Tas(String jenis, int jumlah, double price) {
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.price = price;
        totalTas++; // Menambah jumlah total tas setiap kali tas dibuat
    }


 public void displayInfo() {
        System.out.println("Judul Tas: " + jenis + ",Jumlah Tas: " + jumlah + ", Harga: Rp" + price);
    }

    public static int getTotalTas() {
        return totalTas;
    }

    public void updatePrice(double newPrice) {
         price = newPrice;
    }
    
    // Method untuk mendapatkan judul buku
    public String getJenis() {
        return jenis;
    }
    
    // Method untuk mendapatkan jumlah halaman
    public int getJumlah() {
        return jumlah;
    }
    
        public double getPrice() {
        return price;
    }
}
    
