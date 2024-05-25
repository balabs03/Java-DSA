package Assignments;
import java.util.Scanner;
public class _12_Prime_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        primeNumber(a,b);
    }
    static void primeNumber(int a,int b){
        for (int num = a; num <= b ; num++) {
            if(isPrime(num)){
                System.out.println(num);
            }
        }
    }
    static boolean isPrime(int num){
        int c = 2;
        while(c <= Math.sqrt(num)){
            if(num % c == 0) return false;
            c++;
        }
        return true;
    }
}
