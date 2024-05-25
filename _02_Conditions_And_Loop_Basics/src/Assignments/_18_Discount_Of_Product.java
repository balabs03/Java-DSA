package Assignments;

import java.util.Scanner;
public class _18_Discount_Of_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the product : ");
        double price = sc.nextDouble();
        System.out.println("Enter the Percentage of Discount to be done : ");
        double percentage = sc.nextDouble();

        double calculation = price - (price * percentage)/100;
        System.out.println("The price of the product after discount is " + calculation);
    }
}
