import java.util.Scanner;

public class Persegi {
        static int jumlahPersegi = 0;
        
        private int sisi;
        private final String nama;
        private boolean sudahDihitung;
        
        public Persegi(int sisi, String nama) {
            this.sisi = sisi;
            this.nama = nama;
            this.sudahDihitung = false;
            hitungLuas();
            jumlahPersegi++;
        }
        
        private void hitungLuas(){
            if (!sudahDihitung){
               
            int luas = sisi * sisi;
            System.out.println("Luas " + nama + ": " + luas);
            sudahDihitung = true;
        } else {
            System.out.println("Luas " + nama + " sudah dihitung sebelumnya.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Persegi " + nama);
        System.out.println("Sisi: " + sisi);
    }

    public void ubahSisi(int sisiBaru) {
        this.sisi = sisiBaru;
        sudahDihitung = false;
    }

    public static int hitungKeliling(int sisi) {
        return 4 * sisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi persegi 1: ");
        int sisi1 = scanner.nextInt();
        Persegi persegi1 = new Persegi(sisi1, "A");
        
        System.out.print("Masukkan panjang sisi persegi 2: ");
        int sisi2 = scanner.nextInt();
        Persegi persegi2 = new Persegi(sisi2, "B");

        System.out.println("\nInformasi Persegi:");
        persegi1.tampilkanInfo();
        persegi2.tampilkanInfo();

        System.out.println("\nJumlah persegi: " + Persegi.jumlahPersegi);
        
        System.out.println("\nKeliling Persegi 1: " + Persegi.hitungKeliling(sisi1));
        System.out.println("Keliling Persegi 2: " + Persegi.hitungKeliling(sisi2));

        scanner.close();
    }
}
            
            
        
        
    
