package postes1;


/**
 *
 * @author mahrus
 */

import java.util.Scanner;

public class Calculator {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }


    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }


    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }


    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: angka tidak boleh kosong");
            return Double.NaN; 
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("masukan angka pertama: ");
            double num1 = scanner.nextDouble();

            System.out.print("masukan angka kedua: ");
            double num2 = scanner.nextDouble();

            System.out.println("Pilih Oprasi:");
            System.out.println("1. Tambah (+)");
            System.out.println("2. Kurang (-)");
            System.out.println("3. Kali (*)");
            System.out.println("4. Bagi (/)");
            System.out.print("input pilihan anda: ");
            int choice = scanner.nextInt();

            double result = 0;

            switch (choice) {
                case 1 -> {
                    result = add(num1, num2);
                    System.out.println("Hasil: " + result);
                }
                case 2 -> {
                    result = subtract(num1, num2);
                    System.out.println("Hasil: " + result);
                }
                case 3 -> {
                    result = multiply(num1, num2);
                    System.out.println("Hasil: " + result);
                }
                case 4 -> {
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Hasil: " + result);
                    }
                }
                default -> System.out.println("Pilihan Tidak valid");
            }
        }
    }
}