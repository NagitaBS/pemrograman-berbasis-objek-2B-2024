import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String Alamat;

    public Mahasiswa(String nama, String nim, String prodi, String Alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.Alamat = Alamat;
    }
    
    public void Informasi(){
       System.out.println("Nama: " + nama);
       System.out.println("nim: " + nim);
       System.out.println("prodi: " + prodi);
       System.out.println("Alamat: " + Alamat);
    }   
    
}

public class Modul1_namadinamis{
    public static void main(String[] args){
        
    Scanner Keyboard = new Scanner(System.in);
    
    System.out.println("Masukkan Nama Mahasiswa: ");
    String nama = Keyboard.nextLine();
    
    System.out.println("Masukkan Nim Mahasiswa: ");
    String nim = Keyboard.nextLine();
    
    System.out.println("Masukkan Prodi Mahasiswa: ");
    String prodi = Keyboard.nextLine();
    
    System.out.println("Masukkan Alamat Mahasiswa: ");
    String Alamat = Keyboard.nextLine();
    
    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, prodi, Alamat);
    
    System.out.println("Nama Mahasiswa: " + nama);
    System.out.println("Nim Mahasiswa: " + nim);
    System.out.println("Prodi Mahasiswa: " + prodi);
    System.out.println("Alamat Mahasiswa: " + Alamat);
    
    Keyboard.close();
    
    }
}
