package Assignments;
import java.util.Scanner;
public class _1_Area_Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Area of Circle => pie*radius^2
            System.out.println("Enter the radius of circle : ");
            double radius = sc.nextDouble();
            double areaOfCircle = Math.PI * radius * radius;
            System.out.println("Area of Circle : " + areaOfCircle);

        // Area of Triangle => 1/2 * base * height
            System.out.println("Enter the base of Triangle : ");
            double base = sc.nextDouble();
            System.out.println("Enter the height of Triangle : ");
            double height = sc.nextDouble();
            double areaOfTriangle = 0.5 * base * height;
            System.out.println("Area of Triangle : " + areaOfTriangle);

        // Area of Rectangle => length*width
            System.out.println("Enter the length of the Rectangle : ");
            double length = sc.nextDouble();
            System.out.println("Enter the width of the Rectangle : ");
            double width = sc.nextDouble();
            double areaOfRectangle = length * width;
            System.out.println("Area of Rectangle : " + areaOfRectangle);

        // Area of Isosceles Triangle => 1/2 * base * height
            System.out.println("Enter the base of the Isosceles triangle : ");
            double iBase = sc.nextDouble();
            System.out.println("Enter the height of the Isosceles triangle : ");
            double iHeight = sc.nextDouble();
            double areaOfIsoscelesTriangle = 0.5 * iBase * iHeight;
            System.out.println("Area of Isosceles Triangle : " + areaOfIsoscelesTriangle);

        // Area of Parallelogram =>  base * height
            System.out.println("Enter the base of parallelogram : ");
            double pBase = sc.nextDouble();
            System.out.println("Enter the height of parallelogram : ");
            double pHeight = sc.nextDouble();
            double areaOfParallelogram = pBase * pHeight;
            System.out.println("Area of Parallelogram : " + areaOfParallelogram);

        // Area of rhombus =>  base * height
            System.out.println("Enter the base of rhombus : ");
            double rBase = sc.nextDouble();
            System.out.println("Enter the height of Rhombus : ");
            double rHeight = sc.nextDouble();
            double areaOfRhombus = rBase * rHeight;
            System.out.println("Area of Parallelogram : " + areaOfRhombus);

        // Area of Equilateral Triangle  => sqr(3)/4 * side*side
            System.out.println("Enter the side of Equilateral Triangle : ");
            double eSide = sc.nextDouble();
            double areaOfEquilateralTriangle = (Math.sqrt(3)/4) * eSide;
            System.out.println("Area of Parallelogram : " + areaOfEquilateralTriangle);
    }
}
