package modul1alpen;
import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
        String Nama,Jurusan,Alamat;
        Long Nim;
        
        System.out.print("Masukkan Nama Anda Disini = ");
        Nama=input.nextLine();
        
        System.out.print("Masukkan Nim Anda Disini = ");
        Nim=input.nextLong();
        input.nextLine();
        
        System.out.print("Masukkan Jurusan Anda Disini = ");
        Jurusan=input.nextLine();
        
        System.out.print("Masukkan Alamat Anda Disini = ");
        Alamat=input.nextLine();
        
        System.out.println("------------------------------");
        System.out.println("Nama kamu adalah " + Nama);
        System.out.println("Nim kamu adalah " + Nim);
        System.out.println("Jurusan kamu adalah " + Jurusan);
        System.out.println("Alamat kamu adalah " + Alamat);
        System.out.println("------------------------------");
    }
    
}
