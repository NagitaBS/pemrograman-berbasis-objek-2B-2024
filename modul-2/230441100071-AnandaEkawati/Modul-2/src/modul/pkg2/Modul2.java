package modul.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nimm;
    String namaa;
    String alamatt;
    String jurusann;

    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        nimm = nim;
        namaa = nama;
        alamatt = alamat;
        jurusann = jurusan;
    }

    public String getNim() {
        return nimm;
    }

    public String getNama() {
        return namaa;
    }

    public String getAlamat() {
        return alamatt;
    }

    public String getJurusan() {
        return jurusann;
    }
}

class InputMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();//u/ meyimpan banyk data

        String inputLagi;
        do {
            System.out.print("\nMasukkan NIM: ");
            String nim = input.next();
            input.nextLine(); 

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Alamat: ");
            String alamat = input.nextLine();

            System.out.println("Pilihan Jurusan:");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Masukkan Kode Jurusan: ");
            String kodeJurusan = input.next();
            String jurusan;
            switch (kodeJurusan) {
                case "41":
                    jurusan = "TEKNIK INFORMATIKA";
                    break;
                case "42":
                    jurusan = "TEKNIK INDUSTRI";
                    break;
                case "43":
                    jurusan = "TEKNIK ELEKTRO";
                    break;
                case "44":
                    jurusan = "SISTEM INFORMASI";
                    break;
                case "48":
                    jurusan = "TEKNIK MESIN";
                    break;
                case "49":
                    jurusan = "TEKNIK MEKATRONIKA";
                    break;
                default:
                    jurusan = "Unknown";
                    break;
            }

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
            inputLagi = input.next();
        } while (inputLagi.equalsIgnoreCase("Y"));

        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("Jurusan: " + mahasiswa.getJurusan());
            System.out.println();
        }
    }
}

class TampilMahasiswa {
    public static void main(String[] args) {
        // Menampilkan daftar mahasiswa
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        // Tambahkan data mahasiswa ke daftarMahasiswa
        daftarMahasiswa.add(new Mahasiswa("123456", "John Doe", "Jalan Contoh No. 123", "Teknik Informatika"));
        daftarMahasiswa.add(new Mahasiswa("789012", "Jane Smith", "Jalan Lain No. 456", "Sistem Informasi"));

        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("Jurusan: " + mahasiswa.getJurusan());
            System.out.println();
        }
    }
}

//karna tiap class, punya main metodnya sendiri