package terakhir;
import awal.*;
import kedua.*;

public class main {
    public static void main(String[] args) throws Exception {
        daftarharga list = new daftarharga();
        Data data = new Data();
        System.out.println("+------------------------------------------------------+");
        System.out.println("I                   SEWA KOS IBU SITI                  ");
        System.out.println("I                  TELANG INDAH GANG 1                 ");
        System.out.println("+------------------------------------------------------+");
        list.daftar();
        data.data();
        data.output();
        System.out.println("--------------------------------------------------------");
        System.out.println("                TERIMA KASIH TELAH MEMESAN                ");
        System.out.println("--------------------------------------------------------");
    }
}