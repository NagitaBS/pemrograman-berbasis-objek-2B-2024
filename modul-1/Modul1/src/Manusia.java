

public class Manusia {

    //konstruktor
    public Manusia (String Nama){
      System.out.println("Nama saya :" + Nama);
        
    }  
        
    public static void umur (int umur){
      System.out.println("Umur saya :" + umur + "tahun");
         
    }   
        
    public static void alamat(String alamat){
      System.out.println("Alamat saya :" + alamat);
          
    }  
     
   public static void kemampuan(String kemampuan){
     System.out.println("Saya bisa :" + kemampuan);
     
    }
      
    public static void main(String[] args) {
      Manusia profil = new Manusia("Annisa Putri");
      
      profil.umur(19);
      profil.alamat("Gili Barat Kamal");
      profil.kemampuan("Berjalan dan berlari");
    }
      
}