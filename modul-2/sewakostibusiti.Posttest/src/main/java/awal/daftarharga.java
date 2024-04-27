package awal;

interface daftar{
    public void daftar();
}
public class daftarharga implements daftar{

    @Override
    public void daftar() {
        System.out.println("----------Daftar Fasilitas Kamar dan Harganya----------");
        System.out.println("1. AC + Kamar Mandi Dalam\t Rp 1.300.000,-\t perbulan");
        System.out.println("2. AC + Kamar Mandi Luar\t Rp 1.000.000,-\t perbulan");
        System.out.println("3. Non AC + Kamar Mandi Dalam\t Rp 600.000,-\t perbulan");
        System.out.println("4. Non AC + Kamar Mandi Luar\t Rp 450.000,-\t perbulan");
        System.out.println("------------------------------------------------------");

        
    }
    
}