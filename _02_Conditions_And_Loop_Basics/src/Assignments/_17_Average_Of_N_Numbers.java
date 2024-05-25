package Assignments;
import java.util.Scanner;
public class _17_Average_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        while(true){
            double number = sc.nextDouble();
            if(number == -1) break;
            sum += number;
            count++;
        }
        System.out.println("The Average of N numbers is " + (sum/count));
    }
}
