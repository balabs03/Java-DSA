package Assignments;
import java.util.Scanner;
public class _1_Odd_Or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is a even number.");
        }else{
            System.out.println(number +" is a odd number.");
        }
    }
}
