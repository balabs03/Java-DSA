package Assignments;
import java.util.Scanner;
public class _34_LCM_Of_2_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the big number for A");
        int a = sc.nextInt();
        System.out.println("Enter the small number for B");
        int b = sc.nextInt();
        int gcd = gcd(a,b);
        int lcm = (a*b)/gcd;
        System.out.println("The LCM of 2 numbers is " + lcm);
    }
    static int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a  = temp;
        }
        return a;
    }
}
