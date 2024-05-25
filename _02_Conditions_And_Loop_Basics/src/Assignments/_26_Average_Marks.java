package Assignments;
import java.util.Scanner;
public class _26_Average_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of subjects : ");
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 1;i<=n;i++){
            System.out.println("Enter the mark : ");
            sum += sc.nextDouble();
        }
        System.out.println("the Average of marks is " + (sum/n) );
    }
}
