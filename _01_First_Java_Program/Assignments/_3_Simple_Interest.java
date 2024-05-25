package Assignments;
import java.util.Scanner;
public class _3_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount : ");
        double principle = sc.nextDouble();
        System.out.println("Enter the time : ");
        double time = sc.nextDouble();
        System.out.println("Enter the rate of Interest : ");
        double rate = sc.nextDouble();

        double SI = (principle * time * rate)/100;
        System.out.println("The Simple Interest is " + SI);

    }
}
