/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasposttest;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class Product {

    private String productName;
    private double price;
    private int stock;

    
    public Product(String name, double price, int stock) {
        this.productName = name;
        this.price = price;
        this.stock = stock;
    }

    
    public void displayInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
    }

    
    public boolean isInStock() {
        return stock > 0;
    }

 
    public void updateStock(int quantity) {
        stock += quantity;
    }

   
    public double totalValue() {
        return price * stock;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        Product laptop = new Product("Laptop", 1200.00, 10);
        Product smartphone = new Product("Smartphone", 800.00, 15);

       
        System.out.println("Product Information:");
        laptop.displayInfo();
        System.out.println("\nIs laptop in stock? " + laptop.isInStock());

        System.out.println("\nSmartphone Information:");
        smartphone.displayInfo();
        System.out.println("\nIs smartphone in stock? " + smartphone.isInStock());

        
        System.out.print("\nEnter additional stock for smartphone: ");
        int additionalStock = scanner.nextInt();
        smartphone.updateStock(additionalStock);

        
        System.out.println("\nUpdated Smartphone Information:");
        smartphone.displayInfo();

        
        System.out.println("\nTotal value of available stock: $" + (laptop.totalValue() + smartphone.totalValue()));

        scanner.close();
    }
}
