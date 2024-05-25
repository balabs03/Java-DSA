package Assignments;
import java.util.Scanner;
public class _2_Greeting_Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = sc.nextLine();
        System.out.println("Good Morning! " + name);
    }
}
