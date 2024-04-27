
package modul_1nama;
    class Manusia{
        String nama,alamat,kelas;
        int umur;
    
        void berjalan (){
            System.out.println("berjalan");
        }
        void berlari (){
            System.out.println("berlari");
        }
        
    }
    
public class Modul_1nama{
    
    public static void main(String[] args) {
    Manusia keteranggan = new Manusia();
    keteranggan.nama = "surya baiahaqi";
    keteranggan.umur = 19;
    keteranggan.alamat = " Nganjuk";
    
    /*Manusia biodata = new Manusia();
    biodata.kelas = "a";*/
    
    System.out.println("nama saya adalah"+ keteranggan. nama);
    System.out.println("umur saya ;"+ keteranggan. umur);
    System.out.println("alamat saya "+ keteranggan. alamat);
    keteranggan.berjalan();
    
      
    }  
}
