package Assignments;
import java.util.Scanner;
public class _2_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an numer : ");
        int a = sc.nextInt();
        check(a);
    }
    static void check(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is an even number.");
        } else {
            System.out.println(a + " is an odd number.");
        }
    }
}
