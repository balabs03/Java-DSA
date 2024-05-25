package Assignments;
import java.util.Scanner;
public class _38_Sum_Of_Digits_Of_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("The sum of the digits is " + sum);
    }
}
