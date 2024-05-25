package Assignments;
import java.util.Scanner;
public class _33_HCF_Of_2_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the big number for A");
        int a = sc.nextInt();
        System.out.println("Enter the small number for B");
        int b = sc.nextInt();

        while(b != 0){
            int temp = b;
            b = a % b;
            a  = temp;
        }
        System.out.println("The HCF of two numbers is " + a);
    }
}
