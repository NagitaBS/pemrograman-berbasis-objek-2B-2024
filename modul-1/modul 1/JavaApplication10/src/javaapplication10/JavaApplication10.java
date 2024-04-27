/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;
import java.util.Scanner;

/**
 *
 * @author giska
 */

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;

    // Constructor
    public Mahasiswa() {}

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;}
    public void setNIM(String nim) {
        this.nim = nim;}
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;}
    public void setAlamat(String alamat) {
        this.alamat = alamat;}
    public String getNama() {
        return nama;}
    public String getNIM()
        {return nim;}
    public String getJurusan() {
        return jurusan;}
    public String getAlamat() {
        return alamat;}
}

public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.print("Masukkan Nama: ");
        mahasiswa.setNama(scanner.nextLine());
        System.out.print("Masukkan NIM : ");
        mahasiswa.setNIM(scanner.nextLine());
        System.out.print("Masukkan Jurusan : ");
        mahasiswa.setJurusan(scanner.nextLine());
        System.out.print("Masukkan Alamat: ");
        mahasiswa.setAlamat(scanner.nextLine());
        
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNIM());
        System.out.println("Jurusan/Prodi: " + mahasiswa.getJurusan());
        System.out.println("Alamat: " + mahasiswa.getAlamat());

        scanner.close();
    }
}