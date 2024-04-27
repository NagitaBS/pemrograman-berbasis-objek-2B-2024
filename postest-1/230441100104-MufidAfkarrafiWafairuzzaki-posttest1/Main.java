package post.test;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pemasokan kursi dan meja baru");
        System.out.println("\nMasukkan nama kelas: ");
        String kelas = scanner.nextLine();

        System.out.println("Masukkan jumlah kursi saat ini: ");
        int kursi = scanner.nextInt();

        System.out.println("Masukkan jumlah meja saat ini: ");
        int meja = scanner.nextInt();

        System.out.println("Masukkan jumlah kursi yang akan ditambahkan: ");
        int tambahKursi = scanner.nextInt();
        kursi += tambahKursi;
        
        System.out.println("Masukkan jumlah meja yang akan ditambahkan: ");
        int tambahMeja = scanner.nextInt();
        meja += tambahMeja;

        System.out.println("Masukkan ukuran (S/M/L): ");
        char ukuran = scanner.next().charAt(0);

        PostTest post = new PostTest(kelas, kursi, meja, ukuran);

        System.out.println("\nInformasi Masukan total Meja dan Kursi Baru:");
        System.out.println("Kelas: " + post.getKelas());
        System.out.println("Jumlah kursi: " + post.getKursi());
        System.out.println("Jumlah meja: " + post.getMeja());
        System.out.println("Ukuran: " + post.getUkuran());


    }
}
