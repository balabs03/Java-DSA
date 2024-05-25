package Assignments;
import java.util.Scanner;
public class _3_Voting_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        if(vote(age)){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
    }
    static boolean vote(int age){

            if (age >= 18) return true;

        return false;
    }
}
