package Assignments;
import java.util.Scanner;
public class _2_Perimeter_Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Perimeter of Circle => 2 * pie * r
            System.out.println("Enter the radius of Circle : ");
            double cRadius = sc.nextDouble();
            double circlePerimeter = 2 * Math.PI * cRadius;
            System.out.println("The perimeter of the circle is " + circlePerimeter);

        //Perimeter of Equilateral Triangle => 3 * a
            System.out.println("Enter the side of Equilateral Triangle : ");
            double eSide = sc.nextDouble();
            double equilateralTrianglePerimeter = 3 * eSide;
            System.out.println("The Perimeter of the Equilateral Triangle is " + equilateralTrianglePerimeter);

        //Perimeter of Parallelogram => 2 * (base + side)
            System.out.println("Enter the base of the Parallelogram : ");
            double pBase = sc.nextDouble();
            System.out.println("Enter the side of the parallelogram : ");
            double pSide = sc.nextDouble();
            double parallelogramPerimeter = 2 * (pBase + pSide);
            System.out.println("The perimeter of parallelogram is " + parallelogramPerimeter);

        //Perimeter of Rectangle => 2 * (length + breadth)
            System.out.println("Enter the length of the Rectangle : ");
            double rLength = sc.nextDouble();
            System.out.println("Enter the Breadth of the parallelogram : ");
            double rBreadth = sc.nextDouble();
            double rectanglePerimeter = 2 * (rLength + rBreadth);
            System.out.println("The perimeter of Rectangle is " + rectanglePerimeter);

        //Perimeter of Square => 4 * side
            System.out.println("Enter the side of the Square : ");
            double sSide = sc.nextDouble();
            double squarePerimeter = 4 * sSide;
            System.out.println("The Perimeter of the square is " + squarePerimeter);

          // Perimeter of Rhombus => 4 * side
            System.out.println("Enter the side of the Rhombus : ");
            double rSide = sc.nextDouble();
            double rhombusPerimeter = 4 * rSide;
            System.out.println("The Perimeter of the Rhombus is " + rhombusPerimeter);
    }
}
