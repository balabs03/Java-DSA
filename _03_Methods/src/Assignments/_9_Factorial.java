package Assignments;

import java.util.Scanner;

public class _9_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("The Factorial of the number is " + factorial(num));
    }
    static int factorial(int num){
        int ans = 1;
        for(int i = num;i>0;i--){
            ans *= i;
        }
        return ans;
    }
}
