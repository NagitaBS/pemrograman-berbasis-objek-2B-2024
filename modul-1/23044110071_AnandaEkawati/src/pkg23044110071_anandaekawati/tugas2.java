package pkg23044110071_anandaekawati;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan NIM mahasiswa: ");
            String nim = scanner.nextLine();
            
            System.out.print("Masukkan jurusan mahasiswa: ");
            String jurusan = scanner.nextLine();
            System.out.print("Masukkan alamat mahasiswa: ");
            String alamat = scanner.nextLine();
            
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Jurusan: " + jurusan);
            System.out.println("Alamat: " + alamat);
        }
    }

//menampilkan <-