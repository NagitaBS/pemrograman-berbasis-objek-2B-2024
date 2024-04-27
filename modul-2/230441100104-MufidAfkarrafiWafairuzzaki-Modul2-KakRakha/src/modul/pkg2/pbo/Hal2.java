package modul.pkg2.pbo;

public class Hal2 extends Hal1{
    protected static String namaUniversitas;

    public static String getNamaUniversitas() {
        return namaUniversitas;
    }
    public static void setNamaUniversitas(String namaUniversitas) {
        Hal2.namaUniversitas = namaUniversitas;
    }

    public Hal2(String nim, String nama, String alamat, int jurusan) {
        super(nim, nama, alamat, jurusan);
    }
}
