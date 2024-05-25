package Assignments;
import java.util.Scanner;
public class _5_Volume_of_Cylinder {
    public static void main(String[] args) {
        // Volume of cylinder => pi * r^2 * h
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder : ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the cylinder : ");
        double height = sc.nextDouble();

        double cylinderVolume = Math.PI * Math.pow(radius,2) * height;
        System.out.println("The volume of the cylinder is " + cylinderVolume);

    }
}
