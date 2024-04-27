package modul.pkg1;

class orang {
    String nama;
    int umur;
    String alamat;
    
    public void berjalan(String berjalan){
        System.out.println(nama + " Sedang berjalan" + berjalan);}
    public void berlari(String berlari){
        System.out.println(nama + " Sedang berlari" + berlari);}
}
public class Manusia {
    public static void main(String[] args) {
        orang orang1 = new orang();
        orang1.nama="Zaki";
        orang1.umur=19;
        orang1.alamat="Tuban";
        System.out.println("nama : "+ orang1.nama);
        System.out.println("umur : "+ orang1.umur);
        System.out.println("alamat : "+ orang1.alamat);
        orang1.berjalan(" menuju bulan");
        orang1.berlari(" menuju matahari");
    }
}
