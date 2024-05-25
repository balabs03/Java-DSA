import java.util.Scanner;
public class _6_Simple_Calculator_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while(true) {
            System.out.println("Enter the operator : ");
            char ch = sc.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("Enter the inputs");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(ch == '+'){
                    result = num1 + num2;
                }
                if(ch == '-'){
                    result = num1 - num2;
                }
                if(ch == '*'){
                    result = num1 * num2;
                }
                if(ch == '/'){
                    if(num2 > 0) {
                        result = num1 / num2;
                    }else{
                        System.out.println("Invalid format for division...");
                    }
                }
                if(ch == '%'){
                    if(num2 > 0) {
                        result = num1 % num2;
                    }else{
                        System.out.println("Invalid format for Modulo...");
                    }
                }
            }
            else if(ch == 'x' || ch == 'X'){
                System.out.println("Terminate!!!");
                break;
            }else {
                System.out.println("Invalid operator .. Enter the correct operator");
            }
            System.out.println(result);
        }



    }

}
