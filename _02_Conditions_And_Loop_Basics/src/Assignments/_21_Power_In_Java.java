package Assignments;
import java.util.Scanner;
public class _21_Power_In_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double exponent = sc.nextDouble();
        double ans = Math.pow(base,exponent);
        System.out.println("The power of " + base + " to the power " + exponent +  " is " + ans);
    }
}
