package Assignments;
import java.util.Scanner;
public class _6_INR_To_USD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Indian Rupees : ");
        double inr = sc.nextDouble();

        double usd = inr*0.012; ;
        System.out.println("The US dollars for the given INR is " + usd);
    }
}
