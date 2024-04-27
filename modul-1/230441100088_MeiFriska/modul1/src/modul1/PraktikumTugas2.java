/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1;

/**
 *
 * @author ASUS
 */
public class PraktikumTugas2 {
    String nama, umur, alamat ;
    
    public void Berjalan () {
        System.out.print(" aku " + nama + " umur " + umur + " alamt " + 
                alamat + " berjalan");
    }
    public void Berlari () {
        System.out.println(" karna lama berjalan jadi berlari ");
    }   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        untuk orang ke 1
        System.out.println(" ==================== ");
        System.out.println("     untuk orang 1    ");
        System.out.println(" ==================== ");
        PraktikumTugas2 orang1 = new PraktikumTugas2 ();
        orang1.nama = "priska";
        orang1.umur = "19";
        orang1.alamat = "tuban";
        System.out.println(" nama : " + orang1.nama );
        System.out.println(" umur : " + orang1.umur );
        System.out.println(" alamat : " + orang1.alamat );
        orang1.Berjalan();
        orang1.Berlari();
        
//        untuk orang ke 2 
        System.out.println(" ==================== ");
        System.out.println("     untuk orang 2    ");
        System.out.println(" ==================== ");
        PraktikumTugas2 orang2 = new PraktikumTugas2 ();
        orang2.nama = "mei";
        orang2.umur = "17";
        orang2.alamat = "sampingnya tuban";
        System.out.println(" nama : "+ orang2.nama);
        System.out.println(" umur : " + orang1.umur );
        System.out.println(" alamat : " + orang1.alamat );
        orang2.Berjalan();
        orang1.Berlari();
    }
    
   

}
