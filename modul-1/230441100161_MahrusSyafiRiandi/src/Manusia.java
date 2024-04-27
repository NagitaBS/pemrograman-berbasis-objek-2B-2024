public class Manusia {
    // Atribut
    private String nama;
    private int umur;
    private String alamat;
    
    // Constructor
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    // Method berjalan
    public void berjalan() {
        System.out.println(nama + " Sedang Berjalan");
    }
    
    // Method berlari
    public void berlari() {
        System.out.println(nama + " Sedang Berlari");
    }
    
    // Method untuk menampilkan informasi manusia
    public void tampilkanInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Alamat : " + alamat);
    }
    
    // Main method untuk membuat objek manusia
    public static void main(String[] args) {
        Manusia andi = new Manusia("Andi", 18, "Surabaya");
        andi.tampilkanInfo();
        andi.berjalan();
        
        System.out.println();
        
        Manusia budi = new Manusia("Budi", 20, "Jakarta");
        budi.tampilkanInfo();
        budi.berlari();
    }
}