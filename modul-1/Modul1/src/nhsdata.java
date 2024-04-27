

//mengimport scanner
import java.util.Scanner;

public class nhsdata {

       
        public static void main(String[] args){
            
            //mendeklarasikan var
            String nama,alamat,jurusan;
            long nim;
       
       
       //membuat scanner baru
       Scanner keyboard = new Scanner(System.in);
       Scanner keyboard2 = new Scanner(System.in);
       
       System.out.println("==== Masukkan Data Diri ====");
       System.out.print("Nama :");
       nama = keyboard.nextLine();
       
       System.out.print("Nim :");
       nim = keyboard2.nextLong();
       
       System.out.print("Jurusan :");
       jurusan = keyboard.nextLine();
       
       System.out.print("Alamat :");
       alamat = keyboard.nextLine();
       
       //menampilkan var yang sudah disimpan
       System.out.println("=======");
       System.out.println("Nama "+ nama);
       System.out.println("Nim "+ nim);
       System.out.println("Jurusan "+ jurusan);
       System.out.println("Alamat "+ alamat);
    }
   
}

