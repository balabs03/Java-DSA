package Assignments;
import java.util.Scanner;
public class _8_Total_Surface_Area_Of_Cube {
    public static void main(String[] args) {
        // Total_Surface_Area_Of_Cube => 6 * a^2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the cube : ");
        double a = sc.nextDouble();
        double Cube = 6 * Math.pow(a,2);
        System.out.println("Total_Surface_Area_Of_Cube is " + Cube);
    }
}
