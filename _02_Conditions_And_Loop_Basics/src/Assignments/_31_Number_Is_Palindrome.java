package Assignments;
import java.util.Scanner;
public class _31_Number_Is_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(temp > 0){
            rev = (rev*10) + (temp%10);
            temp /= 10;
        }
        if(n == rev){
            System.out.println(n + " is a Palindrome");
        }
        else{
            System.out.println(n + " is not a Palindrome");
        }


    }
}
