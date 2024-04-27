package projectmodul1;
public class Manusia1 {
   //Atribut
    String nama;
    int umur;
    String alamat;
    
   //constructor
    public Manusia1 (String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
   //Method
    public void berjalan() {
        System.out.println(nama + " Sedang Berjalan");
    }
    public void berlari() {
        System.out.println(nama + " Berlari ke Toilet");
    }
    
public class Manusia {
    public static void main(String[] args) {
        Manusia1 Aini = new Manusia1 ("Aini",19,"Sampang");
        Manusia1 Yeni = new Manusia1 ("Yeni",20,"Sumenep");
        
        System.out.println("Nama : " + Aini.nama);
        System.out.println("Umur : " + Aini.umur);
        System.out.println("Alamat :" + Aini.alamat);
        Aini.berjalan();
        
        System.out.println();
        
        System.out.println("Nama : " + Yeni.nama);
        System.out.println("Umur : " + Yeni.umur);
        System.out.println("Alamat : " + Yeni.alamat);
        Yeni.berlari();
    }
  }
}
