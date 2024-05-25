package Assignments;

import java.util.Scanner;

public class _7_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));

    }
    static boolean isPrime(int n){
        int c = 2;
        while(c <= Math.sqrt(n)){
            if(n % c == 0) return false;
            c++;
        }
        return true;
    }
}
