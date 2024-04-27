import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        ArrayList<DataMahasiswa> DaftarMahasiswa = new ArrayList<>();
//UNIV
        System.out.print("Masukkan nama universitas : ");
        String namaUniversitas = inputan.nextLine();
        Universitas.setNamaUniversitas(namaUniversitas);

        char input;
        do {
            //MAHASISWA
            System.out.println("Masukkan data mahasiswa");
            System.out.print("Masukkan Nama \t\t; ");
            String nama = inputan.nextLine();
            System.out.print("Masukkan NIM \t\t; ");
            String nim = inputan.nextLine();
            System.out.print("Masukkan Alamat \t; ");
            String alamat = inputan.nextLine();
            System.out.println("Pilihan Jurusan \t:");
            System.out.println("41. Teknik informatika");
            System.out.println("42. Teknik Industri");
            System.out.println("43. Teknik Elektro");
            System.out.println("44. Sistem informasi");
            System.out.println("45. Teknik Mesin");
            System.out.println("46. Teknik Mekatronika");

            System.out.print("Masukkan Jurusan \t; ");
            int pilihanJurusan = inputan.nextInt();
            inputan.nextLine();

            String jurusan;
            switch (pilihanJurusan){
                case 41:
                    jurusan = "Teknik Informatika";
                    break;
                case 42:
                    jurusan = "Teknik Industri";
                    break;
                case 43:
                    jurusan = "Teknik Elektro";
                    break;
                case 44:
                    jurusan = "Sistem Informasi";
                    break;
                case 45:
                    jurusan = "Teknik Mesin";
                    break;
                case 46:
                    jurusan = "Teknik Mekatronika";
                    break;
                default:
                    jurusan = "Jurusan tidak diketahui";
                    break;
            }
            DaftarMahasiswa.add(new DataMahasiswa(nama,nim,alamat,jurusan));
            System.out.println("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            input = inputan.next().charAt(0);
            inputan.nextLine();
        } while (Character.toUpperCase(input) == 'Y');

        System.out.println("==========");
        System.out.println("Daftar Mahasiswa di = " + Universitas.getNamaUniversitas());
        for (DataMahasiswa mahasiswa : DaftarMahasiswa){
            mahasiswa.infoMahasiswa();
            System.out.println("==========");
        }
    }
}