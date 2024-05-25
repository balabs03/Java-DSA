package Assignments;
import java.util.Scanner;
public class _6_Area_And_Circumference_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double radius = sc.nextDouble();
        System.out.println("The Circumference of the circle is " + circumference(radius));
        System.out.println("The Area of the circle is " + area(radius));
    }
    static double circumference(double radius){
        return 2*Math.PI*radius;
    }
    static double area(double radius){
        return Math.PI*radius*radius;
    }

}
