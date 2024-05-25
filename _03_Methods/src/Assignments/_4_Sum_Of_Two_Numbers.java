package Assignments;
import java.util.Scanner;
public class _4_Sum_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number : ");
        int b = sc.nextInt();
        System.out.println("The sum of 2 Numbers is " + sum(a,b) );
    }
    static int sum(int a ,int b){
        return a+b;
    }
}
