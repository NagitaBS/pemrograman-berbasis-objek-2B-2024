package modul.pkg2.pbo;

public class Hal1 {
    protected String nim;
    protected String nama;
    protected String alamat;
    protected int jurusan;
    
    public Hal1(String nim, String nama, String alamat, int jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;}
    
    public String getNama() {
        return nama;}
    
    public String getAlamat() {
        return alamat;}
    public void setAlamat(String alamat) {
        this.alamat = alamat;}
    
    public int getJurusan() {
        return jurusan;}
}
