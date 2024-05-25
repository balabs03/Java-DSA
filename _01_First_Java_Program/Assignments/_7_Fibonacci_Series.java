package Assignments;
import java.util.Scanner;
public class _7_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms : ");
        int number = sc.nextInt();
        if(number <= 0){
            System.out.println("Error! Invalid input");
        }
        int a1 = 0;
        int a2 = 1;
        System.out.print(a1+" ");
            if(number == 1){
                return;
            }
        System.out.print(a2+" ");
            if(number == 2){
                return;
            }

        for(int i = 2;i<number;i++){
           int a3 = a1+a2;
            System.out.print(a3+" ");
           a1 = a2;
           a2 = a3;
        }
    }
}
