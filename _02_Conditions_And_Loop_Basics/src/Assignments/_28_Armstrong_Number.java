package Assignments;
import java.util.Scanner;
public class _28_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while(temp > 0){
            count++;
            temp /= 10;
        }
        temp = num;
        int sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit,count);
            temp /= 10;
        }
        if(sum == num){
            System.out.println(num + " is a Armstrong Number.");
        }else{
            System.out.println(num + " is not a Armstrong Number.");
        }

    }
}
