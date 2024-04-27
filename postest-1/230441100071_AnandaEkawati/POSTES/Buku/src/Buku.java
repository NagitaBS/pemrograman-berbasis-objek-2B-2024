class Buku {
    private static int jumlahBuku = 0;
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        jumlahBuku++;
    }
    public static int getJumlahBuku() {
        return jumlahBuku;
    }
    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
    public static void main(String[] args) {
        Buku buku1 = new Buku("Ilmu Pengetahuan Alam", "J.K. Rowling", 1997);
        Buku buku2 = new Buku("Ilmu Pengetahuan Sosial", "Arthur Conan Doyle", 1887);

        buku1.displayInfo();
        buku2.displayInfo();

        System.out.println("Jumlah buku: " + Buku.getJumlahBuku());
    }
}