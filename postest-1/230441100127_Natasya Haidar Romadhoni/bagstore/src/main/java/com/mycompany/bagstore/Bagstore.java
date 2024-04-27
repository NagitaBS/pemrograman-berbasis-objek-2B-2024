/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bagstore;

/**
 *
 * @author natas
 */
public class Bagstore {

    public static void main(String[] args) {
        // Membuat objek tas
        Tas tas1 = new Tas(" Shoulderbag", 10, 75000.0);
        Tas tas2 = new Tas("bagpack", 8, 65000.0);
        
        // Menampilkan info tas
        tas1.displayInfo();
        tas2.displayInfo();
        
        // Menampilkan total tas
        System.out.println("Total Tas di Toko: " + Tas.getTotalTas());
        
        // Mengupdate harga tas
        tas1.updatePrice(70000.0);
        tas1.displayInfo();
    }
}

