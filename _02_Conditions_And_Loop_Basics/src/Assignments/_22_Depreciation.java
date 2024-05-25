package Assignments;
import java.util.Scanner;
public class _22_Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the purchase price : ");
        double purchasePrice = sc.nextDouble();
        System.out.println("Enter the estimated cost : ");
        double estimatedPrice = sc.nextDouble();
        System.out.println("Enter the useful life : ");
        double life = sc.nextDouble();
        double depreciation = (purchasePrice - estimatedPrice)/life;
        System.out.println("The Depreciation value is " + depreciation);
    }
}
