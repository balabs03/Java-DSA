package Assignments;
import java.util.Scanner;
public class _16_Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power : ");
        double power = sc.nextDouble();
        System.out.println("Enter the rate : ");
        double rate = sc.nextDouble();
        System.out.println("The bill is " + power*rate);
    }
}
