/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author WAHYU ALIF AJIR N
 */
class Manusia {
    String nama;
    int umur;
    String alamat;
    String kabupaten;
    
    public void berjalan(){
        System.out.println("Object " + this.nama + " berjalan");
    }
    
    void berlari () {
        System.out.println("Object " + this.nama + "sedang berlari" );
    }
    void sprinter() {
        System.out.println("object" + this.nama + "sedang sprinter ");
    }
    

}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MENAMBAHKAN OBJEK 2 MANUSIA 
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama = "Wahyu";
        orang1.umur = 20;
        orang1.alamat="montong";
        orang1.kabupaten="tuban";
        System.out.println("nama object 1 adalah : " + orang1.nama);
        System.out.println("umur object 1 adalah : " + orang1.umur + "tahun");
        System.out.println("alamat anda adalah   : " + orang1.alamat);
        System.out.println("alamat anda adalah   : " + orang1.kabupaten);
        orang1.berjalan();
        orang1.berlari();
        orang1.sprinter();
        
        orang2.nama = "Angga";
        orang2.umur = 19;
        orang2.alamat="semarang";
        orang2.kabupaten="jawatengah";
        System.out.println("nama anda adalah   : " + orang2.nama);
        System.out.println("umur anda adalah   : " + orang2.umur + "Tahun");
        System.out.println("alamat adalah      : " + orang2.alamat);
        System.out.println("alamat anda adalah : " + orang2.kabupaten);
        orang2.berjalan();
        orang2.berlari();
        orang2.sprinter();
        
    }
    
}