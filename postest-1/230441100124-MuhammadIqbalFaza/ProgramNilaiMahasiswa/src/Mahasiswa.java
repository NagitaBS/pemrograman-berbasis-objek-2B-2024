import java.util.Scanner;
public class Mahasiswa {
    String nama;
    Integer quiz;
    double nilaiUts;
    double nilaiUas;

    Mahasiswa(String nama, Integer quiz, double nilaiUts, double nilaiUas){
        this.nama = nama;
        this.quiz = quiz;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    static Mahasiswa inputDataMahasiswa(){
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = inputan.nextLine();
        System.out.print("Masukkan Nilai Quiz : ");
        int quiz = inputan.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        double nilaiUts = inputan.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        double nilaiUas = inputan.nextDouble();
        return new Mahasiswa(nama,quiz,nilaiUts,nilaiUas);
    }

    double HitungNilaiAkhir(){
        return (quiz*0.2)+(nilaiUts*0.3)+(nilaiUas*0.5);
    }

    void ShowDataMahasiswa(){
        System.out.println("Nama \t\t= "+nama);
        System.out.println("Nilai Quiz \t= "+quiz);
        System.out.println("Nilai UTS \t= "+ nilaiUts);
        System.out.println("Nilai UAS \t= " + nilaiUas);
        System.out.println("Nilai Akhir \t= "+ (HitungNilaiAkhir()));
        System.out.println("Grade Nilai Akhir \t= "+ GradeNilai());
    }

    char GradeNilai(){
        double nilaiAkhir = HitungNilaiAkhir();
        if (nilaiAkhir >=80){
            return 'A';
        } else if (nilaiAkhir >=70) {
            return 'B';
        } else if (nilaiAkhir >=60) {
            return 'C';
        } else if (nilaiAkhir >=50) {
            return 'D';
        }else {
            return 'E';
        }
    }
}
