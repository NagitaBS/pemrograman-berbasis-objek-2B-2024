package projectmodul1;

public class Mahasiswa {
    public static void main (String[] args) {
      
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        String Nama, Nim, Prodi, Alamat;
        
        System.out.print("Masukkan Nama : ");
        Nama = input.nextLine();
        System.out.print("Masukkan Nim : ");
        Nim = input.nextLine();
        System.out.print("Masukkan Prodi : ");
        Prodi = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        Alamat = input.nextLine();
        
        System.out.println("=====================================");
        System.out.println("Nama : " + Nama);
        System.out.println("Nim : " + Nim);
        System.out.println("Prodi : " + Prodi);
        System.out.println("Alamat : " + Alamat);
        System.out.println("=====================================");
  }
}
