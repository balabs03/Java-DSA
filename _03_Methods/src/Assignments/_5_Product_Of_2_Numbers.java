package Assignments;

import java.util.Scanner;

public class _5_Product_Of_2_Numbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first Number : ");
            int a = sc.nextInt();
            System.out.println("Enter the second Number : ");
            int b = sc.nextInt();
            System.out.println("The sum of 2 Numbers is " + product(a,b) );
        }
        static int product(int a ,int b){
            return a*b;
        }
    }

