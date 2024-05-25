package Assignments;
import java.util.Scanner;
public class _25_Compound_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount : ");
        double principle = sc.nextDouble();
        System.out.println("Enter the annual interest rate (as a decimal): ");
        double rate = sc.nextDouble();
        System.out.println("Enter the number of times interest is compounded per year: ");
        int n = sc.nextInt();
        System.out.println("Enter the time the money is invested or borrowed for (in years): ");
        double time = sc.nextDouble();

        double CI = principle*Math.pow(1+(rate/n),n*time) - principle;
        System.out.println("The Compound Interest is " + CI);

    }
}
