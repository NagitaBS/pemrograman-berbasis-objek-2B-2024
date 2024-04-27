// Program: PersonalInformation.java
package post.test;

public class PostTest {
    private String kelas;
    private int kursi;
    private int meja;
    private char ukuran;

    
    public PostTest(String kelas, int kursi, int meja, char ukuran) {
        this.kelas = kelas;
        this.kursi = kursi;
        this.meja = meja;
        this.ukuran = ukuran;
    }
    
    public String getKelas() {
        return kelas;}
    public void setKelas(String kelas) {
        this.kelas = kelas;}
    
    public int getKursi() {
        return kursi;}
    public void setKursi(int nim) {
        this.kursi = kursi;}
    
    public int getMeja() {
        return meja;}
    public void setMeja(int nama) {
        this.meja = meja;}
    
    public char getUkuran() {
        return ukuran;}
    public void setUkuran(char ukuran) {
        this.ukuran = ukuran;}
    
}
