package Assignments;
import java.util.Scanner;
public class _24_CGPA_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of subjects : ");
        int n = sc.nextInt();
        double num = 0;
        double den = 0;
        for(int i = 1;i<=n;i++){
            System.out.println("Enter the credit : ");
            double credit = sc.nextDouble();
            System.out.println("Enter the grade : ");
            double grade = sc.nextDouble();

            num += credit*grade;
            den += credit;
        }
        double cgpa = num/den;
        System.out.println("The CGPA is " + cgpa);
    }
}
