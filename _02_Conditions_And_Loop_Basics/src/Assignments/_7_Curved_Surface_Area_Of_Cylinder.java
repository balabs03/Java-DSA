package Assignments;
import java.util.Scanner;
public class _7_Curved_Surface_Area_Of_Cylinder {
    public static void main(String[] args) {
        //Curved_Surface_Area_Of_Cylinder => 2 * pi * r *h
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Cylinder : ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the Cylinder : ");
        double height = sc.nextDouble();

        double csCylinder = 2 * Math.PI *  radius * height;
        System.out.println("The curved surface area of cylinder is " + csCylinder);
    }
}
