
class manusia{
    String nama;
    Integer umur;
    String alamat;
    void berjalan(){
        System.out.println(nama + " sedang berjalan.");
    }
    void berlari(){
        System.out.println(nama + " sedang berlari");
    }
}


public class Main {
    public static void main(String[] Args){

        manusia manusiaBiasa = new manusia();
        manusiaBiasa.nama = "Lintinggggg";
        manusiaBiasa.umur = 18;
        manusiaBiasa.alamat = "Nordik";

        System.out.println("Aku adalah " + manusiaBiasa.nama);
        System.out.println("Aku berumur " + manusiaBiasa.umur);
        System.out.println("Aku tinggal di " + manusiaBiasa.alamat);
        manusiaBiasa.berjalan();

        manusia manusiaSuper = new manusia();
        manusiaSuper.nama = "paza";
        manusiaSuper.umur = 69;
        manusiaSuper.alamat = "Olympus";

        System.out.println("Aku adalah " + manusiaSuper.nama);
        System.out.println("Aku berumur " + manusiaSuper.umur);
        System.out.println("Aku tinggal di " + manusiaSuper.alamat);
        manusiaSuper.berlari();
    }
}
