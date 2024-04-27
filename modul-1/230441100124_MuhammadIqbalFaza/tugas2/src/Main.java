import java.util.Scanner;

class mahasiswa {
    String nama;
    String nim;
    String prodi;
    String alamat;

    void infoMahasiswa(){
        Scanner inputan =new Scanner(System.in);
        // Input informasi
        System.out.println("Masukkan nama mahasiswa : "); nama = inputan.nextLine();

        System.out.println("Masukkan NIM mahasiswa : "); nim = inputan.nextLine();

        System.out.println("Masukkan prodi mahasiswa : "); prodi = inputan.nextLine();

        System.out.println("Masukkan Alamat mahasiswa : "); alamat = inputan.nextLine();

        // output informasi
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Alamat : " + alamat);
    }
}

public class Main {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.infoMahasiswa();
    }
}



    