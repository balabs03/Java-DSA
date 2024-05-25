package Assignments;
import java.util.Scanner;
public class _13_Sum_Of_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers to print its sum : ");
        int num = sc.nextInt();
        System.out.println("The sum of " + num + " numbers is " + sum(num));
    }
    static int sum(int num){
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum += i;
        }
        return sum;
    }
}
