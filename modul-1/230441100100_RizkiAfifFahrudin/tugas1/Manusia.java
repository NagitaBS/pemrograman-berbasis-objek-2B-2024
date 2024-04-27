package Praktikum1;
public class Manusia {
    // Atribut
    String nama;
    String alamat;
    
    // Constructor
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    // Method berjalan
    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }
    
    // Method berlari
    public void berlari() {
        System.out.println(nama + " sedang berlari dengan cepat.");
    }
}

