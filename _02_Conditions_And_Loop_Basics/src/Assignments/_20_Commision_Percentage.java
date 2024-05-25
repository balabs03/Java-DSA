package Assignments;
import java.util.Scanner;
public class _20_Commision_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total selling price : ");
        double sellingPrice = sc.nextDouble();
        System.out.println("Enter the amount that is the commission : ");
        double commission = sc.nextDouble();
        double percent = commission/sellingPrice;
        System.out.println("The commission percentage is " + percent);
    }
}
