package Assignments;
import java.util.Scanner;
public class _1_Maximum_And_Minimum_Of_2_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third Number : ");
        int c = sc.nextInt();
        maximum(a,b,c);
        minimum(a,b,c);
    }
    static void maximum(int a,int b,int c){
        if(a>=b && a>=c){
            System.out.println(a + " is the maximum Number");
        }else if(b>=a && b>=c){
            System.out.println(b + " is the maximum Number");
        }else{
            System.out.println(c + " is the maximum Number");
        }
    }

    static void minimum(int a,int b,int c){
        if(a<=b && a<=c){
            System.out.println(a + " is the minimum Number");
        }else if(b<=a && b<=c){
            System.out.println(b + " is the minimum Number");
        }else{
            System.out.println(c + " is the minimum Number");
        }
    }
}
