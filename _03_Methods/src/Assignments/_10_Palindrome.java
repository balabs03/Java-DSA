package Assignments;
import java.util.Scanner;
public class _10_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int num = sc.nextInt();
        palindrome(num);
    }
    static void palindrome(int num){
        int temp = num;
        int rev = 0;
        while(temp>0){
            int digit = temp % 10;
            rev = (rev * 10)+digit;
            temp /= 10;
        }
        if(rev == num){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
