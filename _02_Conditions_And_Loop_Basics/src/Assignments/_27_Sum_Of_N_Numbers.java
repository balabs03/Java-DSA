package Assignments;
import java.util.Scanner;
public class _27_Sum_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        while(true){
            double a = sc.nextDouble();
            if(a == -1) break;
            sum += a;
        }
        System.out.println("The sum of N numbers is " + sum);
    }
}
