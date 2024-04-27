package modul1alpen;

public class Manusia {
    String Nama,Alamat;
    int Umur,Berjalan,Berlari;
    
    public void berjalan(){
        System.out.println("Object " + this.Nama + " berjalan Sejauh "+ this.Berjalan + "KM");
    }
    
    public void berlari (){
        System.out.println("Object " + this.Nama + " Sedang berlari " + this.Berlari + "KM");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("--------------------------");
        System.out.println("CONTOH OBJECT ORANG KE 1 ");
        System.out.println("--------------------------");
        
        Manusia Orang1 = new Manusia();

        Orang1.Nama = "Alven";
        Orang1.Umur = 19;
        Orang1.Alamat ="Jombang";
        Orang1.Berjalan = 2;
        Orang1.Berlari = 10;
        
        System.out.println("Perkenalkan Nama saya "+Orang1.Nama);
        System.out.println("Tahun ini saya Berumur "+Orang1.Umur + "Tahun");
        System.out.println("Saya Berasal dari Kota "+Orang1.Alamat);
        Orang1.berjalan();
        Orang1.berlari();
        
        System.out.println("--------------------------");
        System.out.println("CONTOH OBJECT ORANG KE 2 ");
        System.out.println("--------------------------");
        
        Manusia Orang2 = new Manusia();
//        Orang objek
//        nama atribut
//        fajri value

        Orang2.Nama = "Fajri";
        Orang2.Umur = 19;
        Orang2.Alamat ="Surabaya";
        Orang2.Berjalan = 21;
        Orang2.Berlari = 20;
        
        System.out.println("Perkenalkan Nama saya "+Orang2.Nama);
        System.out.println("Tahun ini saya Berumur "+Orang2.Umur + " Tahun");
        System.out.println("Saya Berasal dari Kota "+Orang2.Alamat);
        Orang2.berjalan();
        Orang2.berlari();

    }

}
