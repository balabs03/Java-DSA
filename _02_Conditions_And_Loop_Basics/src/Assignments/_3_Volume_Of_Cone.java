package Assignments;
import java.util.Scanner;
public class _3_Volume_Of_Cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // volume of cone => 1/3 * pi * r^2 * h
        System.out.println("Enter the radius of the cone : ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the cone : ");
        double height = sc.nextDouble();
        double coneVolume = (Math.PI * radius * radius * height)/3;
        System.out.println("The volume of the cone is " + coneVolume);
    }
}
