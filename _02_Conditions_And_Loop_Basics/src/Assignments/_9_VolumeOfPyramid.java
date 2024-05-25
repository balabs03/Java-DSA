package Assignments;

import java.util.Scanner;

public class _9_VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base length and width
        System.out.println("Enter the length of the base of the pyramid: ");
        double baseLength = sc.nextDouble();

        System.out.println("Enter the width of the base of the pyramid: ");
        double baseWidth = sc.nextDouble();

        // Input the height of the pyramid
        System.out.println("Enter the height of the pyramid: ");
        double height = sc.nextDouble();

        // Calculate the volume of the pyramid
        double baseArea = baseLength * baseWidth;
        double pyramidVolume = (1.0 / 3.0) * baseArea * height;

        // Display the result
        System.out.println("The volume of the pyramid is: " + pyramidVolume);
    }
}
