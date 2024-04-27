package modul1tugas2;
import java.util.Scanner;

class mahasiswautm {
    String nama;
    int nim;
    String prodi;
    String alamat;
    
    public void tampilkandata(){
        System.out.println("Nama Mahasiswa : "+ nama);
        System.out.println("NIM Mahasiswa : "+ nim);
        System.out.println("Prodi Mahasiswa : "+ prodi);
        System.out.println("Alamat Mahasiswa : "+ alamat);
    }
}

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mahasiswautm utm = new mahasiswautm();

        System.out.print("Masukkan Nama Mahasiswa :");
        utm.nama = input.nextLine();
        
        System.out.print("Masukkan NIM Mahasiswa :");
        utm.nim = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Prodi Mahasiswa :");
        utm.prodi = input.nextLine();
        
        System.out.print("Masukkan Alamat Mahasiswa :");
        utm.alamat = input.nextLine();
        
        System.out.println("\nData Mahasiswa UTM");
        utm.tampilkandata();
    }
}
