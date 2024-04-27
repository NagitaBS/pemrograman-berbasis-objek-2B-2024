public class Mahasiswa {
    protected String nama;
    protected String nim;
    protected String alamat;
    protected String jurusan;

    public Mahasiswa(String nama, String nim, String alamat, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public void infoMahasiswa(){
        System.out.println("Nama \t\t: " + nama);
        System.out.println("NIM \t\t: " + nim);
        System.out.println("Alamat \t\t: " + alamat);
        System.out.println("Jurusan \t: " + jurusan);
    }
}
