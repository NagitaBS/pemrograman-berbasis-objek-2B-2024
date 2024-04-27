/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postest1;

import java.util.Scanner;

public class Calculator {
    private double num1;
    private int num2;
    private char operator;

    public Calculator(double num1, char operator, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double calculate() {
        double hasil = 0;
        switch (operator) {
            case '+':
                hasil = tambah();
                break;
            case '-':
                hasil = kurang();
                break;
            case '*':
                hasil = kali();
                break;
            case '/':
                if (num2 != 0) {
                    hasil = bagi();
                } else {
                    System.out.println("Tidak dapat melakukan pembagian dengan nol.");
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }
        return hasil;
    }

    public double tambah() {
        return num1 + num2;
    }

    public double kurang() {
        return num1 - num2;
    }

    public double kali() {
        return num1 * num2;
    }

    public double bagi() {
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        int num2 = scanner.nextInt();

        Calculator kalkulator = new Calculator(num1, operator, num2);
        
        double hasilnya = kalkulator.calculate();
        
        System.out.println("Hasil: " + hasilnya);

        scanner.close();
    }
}