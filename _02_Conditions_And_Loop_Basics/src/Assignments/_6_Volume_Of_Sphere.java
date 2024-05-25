package Assignments;
import java.util.Scanner;
public class _6_Volume_Of_Sphere {
    public static void main(String[] args) {
        // Volume of Sphere => 4/3 * pi * r^3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Sphere : ");
        double radius = sc.nextDouble();


        double sphereVolume = (4* Math.PI * Math.pow(radius,3))/3;
        System.out.println("The volume of the sphere is " + sphereVolume);
    }
}
