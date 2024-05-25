package Assignments;
import java.util.Scanner;
public class _9_ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        int count = 0;
        int temp = number;
        while(temp>0){
            count++;
            temp = temp/10;
        }

        int sum = 0;
        temp = number;
        while(temp>0){
            int digit = temp % 10;
            sum += (int)Math.pow(digit,count);
            temp = temp /10;
        }

        if(number == sum){
            System.out.println("The given is an Armstrong number");
        }
        else{
            System.out.println("The given is not an Armstrong number");
        }
    }
}
