import java.util.ArrayList;
import java.util.Scanner;

// Parent class
class Person {
    protected String nama;
    protected String alamat;

    // Constructor
    public Person(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter dan setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

// Child class
class Mahasiswa extends Person {
    private String nim;
    private final int jurusanKode;

    // Constructor
    public Mahasiswa(String nama, String alamat, String nim, int jurusanKode) {
        super(nama, alamat);
        this.nim = nim;
        this.jurusanKode = jurusanKode;
    }

    // Getter dan setter untuk NIM
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Method untuk mendapatkan nama jurusan berdasarkan kode jurusan
    public String getNamaJurusan() {
        return switch (jurusanKode) {
            case 41 -> "Teknik Informatika";
            case 42 -> "Teknik Industri";
            case 43 -> "Teknik Elektro";
            case 44 -> "Sistem Informasi";
            case 48 -> "Teknik Mesin";
            case 49 -> "Teknik Mekatronika";
            default -> "Jurusan tidak valid";
        };
    }
}

// Main class
public class coba {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Masukkan data mahasiswa:");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Kode Jurusan: ");
            int jurusanKode = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            // Membuat objek mahasiswa
            Mahasiswa mahasiswa = new Mahasiswa(nama, alamat, nim, jurusanKode);
            daftarMahasiswa.add(mahasiswa);

            System.out.println("Data mahasiswa berhasil dimasukkan.");

            System.out.print("Masukkan data mahasiswa lagi? (Y/T): ");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("Y"));

        // Menampilkan daftar mahasiswa
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Jurusan: " + mahasiswa.getNamaJurusan());
            System.out.println();
        }
    }
}