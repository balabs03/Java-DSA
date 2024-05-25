package Assignments;
import java.util.Scanner;
public class _8_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = sc.next();
        String temp = "";
        for(int i = input.length()-1;i>=0;i--){
            temp += input.charAt(i);
        }
        if(input.equals(temp)){
            System.out.println("The given String is Palindrome");
        }else{
            System.out.println("The given String is not Palindrome");
        }
    }
}
