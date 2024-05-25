import java.util.Scanner;
public class _Example_With_Parameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num 2 : ");
        int num2 = sc.nextInt();
        int sumOfTwo = sum(num1,num2);
        System.out.println("The sum is " + sumOfTwo);

        System.out.println("Enter your name : ");
        sc.nextLine();
        String name = sc.nextLine();
        String personalised = greet(name);
        System.out.println(personalised);

    }
    static int sum(int a,int b){
        return a+b;
    }
    static String greet(String h){
        String ans = "Hello " + h;
        return ans;
    }

}
