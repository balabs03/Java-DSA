package Assignments;

import java.util.Scanner;
public class _11_Pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();
        if(isTriplet(a,b,c)){
            System.out.println("The given is a pythagorean Triplet");
        }else{
            System.out.println("The given is not a pythagorean Triplet");
        }
    }
    static boolean isTriplet(int a,int b,int c){
        int x = a*a;
        int y = b*b;
        int z = c*c;
        if(x == y+z || y == x+z || z == x+y) return true;
        return false;
    }
}
