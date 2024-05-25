package Assignments;
import java.util.Scanner;
public class _23_Batting_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total runs scored by the Batsman : ");
        double runs = sc.nextInt();
        System.out.println("Enter the Number of times he has been dismissed : ");
        double dismissed = sc.nextInt();
        double avg = runs/dismissed;
        System.out.println("The batting average of the batsman is " + avg);
    }
}
