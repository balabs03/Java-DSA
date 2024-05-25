import java.util.Scanner;
public class _Example_With_Return_Statement {
    public static void main(String[] args) {
        int sum = sum();
        String message = greet();
        System.out.println("The sum is " + sum);
        System.out.println("The message is " + message);
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        return sum;
    }
    static String greet(){
        String greet = "How are you ? ";
        return greet;
    }
}
