package Assignments;
import java.util.Scanner;
public class _35_Vowel_Or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to be checked : ");
        char ch = sc.next().trim().charAt(0);
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'A') {
                System.out.println(ch + " is a vowel");
            }else if(ch == 'e' || ch == 'E'){
                System.out.println(ch + " is a vowel");
            }else if(ch == 'i' || ch == 'I'){
                System.out.println(ch + " is a vowel");
            }else if(ch == 'o' || ch == 'O'){
                System.out.println(ch + " is a vowel");
            }
            else if(ch == 'u' || ch == 'U'){
                System.out.println(ch + " is a vowel");
            }
            else{
                System.out.println(ch + " is a consonantx");
            }
        }
        else{
            System.out.println("Invalid input !");
        }
    }
}
