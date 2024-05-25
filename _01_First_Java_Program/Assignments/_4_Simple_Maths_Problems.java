package Assignments;
import java.util.Scanner;
public class _4_Simple_Maths_Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        double a = sc.nextDouble();
        System.out.println("Enter the Second Number : ");
        double b = sc.nextDouble();
        System.out.println("Enter the Operator : ");
        char ch = sc.next().charAt(0);

        double result = 0;
        if(ch == '+'){
            result = a+b;
        }else if(ch == '-'){
            result = a-b;
        }else if(ch == '*'){
            result = a*b;
        }else if(ch == '/'){
            if(b != 0){
                result = a/b;
            }
            else{
                System.out.println("Error: Division by zero is undefined.");
                return;
            }
        }
        else{
            System.out.println("Error: Invalid operator.");
            return;
        }
        System.out.println("The " + ch + " for the given inputs is : " + result);
    }
}
