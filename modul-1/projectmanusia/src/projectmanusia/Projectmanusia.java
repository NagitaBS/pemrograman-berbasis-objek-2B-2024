
package projectmanusia;

class Manusia {
    //atribut
    String Nama ;
    int Umur ;
    String Alamat ;
    
    /// Method 
    void berjalan (){
        System.out.println(Nama  +  " sedang  berjalan");
    }
    void berlari (){
        System.out.println(Nama  +  " sedang  berlari");
    }
}
public class Projectmanusia{
    public static void main(String[] args) {
        // Penggunaan kelas Manusia untuk membuat objek a dan b
        Manusia a = new Manusia();
        Manusia b = new Manusia();
        
        // Mengatur nilai atribut untuk setiap objek
        a.Nama = "Lidia";
        b.Nama = "Evi";
        
        a.Umur = 20;
        b.Umur = 19;
        
        a.Alamat = "Raya";
        b.Alamat= "Samosir";
        
        // Menampilkan informasi dan memanggil metode pada objek 
        System.out.println("Nama    :"+a.Nama);
        System.out.println("Umur    :"+a.Umur);
        System.out.println("Alamat  :"+a.Alamat);
        a. berjalan();
        a. berlari();
        
        
        System.out.println("Nama    :"+b.Nama);
        System.out.println("Umur    :"+b.Umur);
        System.out.println("Alamat  :"+b.Alamat);
        b. berjalan();
        b. berlari();
     
    }
}