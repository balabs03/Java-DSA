    package Assignments;
    import java.util.Scanner;
    public class _4_Volume_Of_prism {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //volume of prism => Base area(length * breadth) * height
            System.out.println("Enter the length of the prism : ");
            double length = sc.nextDouble();
            System.out.println("Enter the breadth of the prism : ");
            double breadth = sc.nextDouble();
            System.out.println("Enter the height of the prism : ");
            double height = sc.nextDouble();

            double prismVolume = length * breadth * height;
            System.out.println("The volume of the prism : " + prismVolume);



        }
    }
