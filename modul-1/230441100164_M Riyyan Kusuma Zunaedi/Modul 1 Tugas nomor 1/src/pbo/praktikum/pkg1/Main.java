/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.praktikum.pkg1;

/**
 *
 * @author Admin
 */

class Manusia {
    String nama;
    int umur;
    String alamat;
    
    public void berjalan(){
        System.out.println("Object " + this.nama + " berjalan");
    }
    
    void berlari () {
        System.out.println("Object " + this.nama + "sedang berlari" );
    }
    

}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama = "Riyyan";
        orang1.umur = 19; 
        orang2.alamat = "Tuban";
        System.out.println("nama object 1 adalah : " + orang1.nama);
        System.out.println("umur object 1 adalah : " + orang1.umur + "tahun");
        System.out.println("alamat object 1 adalah : " + orang1.alamat);
        orang1.berjalan();
        orang1.berlari();
        
        orang2.nama = "Anggoy";
        orang2.umur = 19;
        orang2.alamat = "Tuban";
        System.out.println("nama adalah : " + orang2.nama);
        System.out.println("umur adalah : " + orang2.umur + "Tahun"); 
        System.out.println("nama adalah : " + orang2.alamat);
        orang2.berjalan();
        orang2.berlari();
        
    }
    
}