import java.util.Scanner;

class Mahasiswa1 {
    private String nama;
    private Long nim;
    private String prodi;
    private String alamat;

    public Mahasiswa1(String nama, Long nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    public void tampilkanInfo() {
        System.out.println("Informasi Mahasiswa");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Prodi   : " + prodi);
        System.out.println("Alamat  : " + alamat);
    }
}

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = scanner.next().trim();

        System.out.println("Masukkan NIM Mahasiswa : ");
        Long nim = scanner.nextLong();

        System.out.println("Masukkan Prodi Mahasiswa : ");
        String prodi = scanner.next().trim();

        System.out.println("Masukkan Alamat Mahasiswa : ");
        String alamat = scanner.next().trim();

        Mahasiswa1 mahasiswa = new Mahasiswa1(nama, nim, prodi, alamat);
        mahasiswa.tampilkanInfo();

        scanner.close();
    }
}