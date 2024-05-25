package Assignments;
import java.util.Scanner;
public class _39_Sum_Of_All_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter a Number & Enter 0 to submit");
            int a = sc.nextInt();
            if(a == 0) break;
            sum += a;
        }
        System.out.println(sum);
    }
}
