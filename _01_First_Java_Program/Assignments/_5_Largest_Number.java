package Assignments;
import java.util.Scanner;
public class _5_Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        double a = sc.nextDouble();
        System.out.println("Enter the second Number : ");
        double b = sc.nextDouble();

        if(a>b){
            System.out.println(a + " is greater than " + b + " .");
        }else if( a== b){
            System.out.println("Both are equal.");
        }else{
            System.out.println(b + " is greater than " + a + " .");
        }
    }
}
