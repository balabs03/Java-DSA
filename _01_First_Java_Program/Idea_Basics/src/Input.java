import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Integer input
        System.out.println("Enter an Integer value : ");
        int intV = sc.nextInt();
        System.out.println("The Integer value is : " + intV);

        //String input
        sc.nextLine();
        System.out.println("Enter a String : ");
        String strV = sc.nextLine();
        System.out.println("The entered string is " + strV);
        System.out.println("Enter a String : ");
        String strV1 = sc.next();
        System.out.println("The entered string is " + strV1);

        //Float input
        System.out.println("Enter a float value : ");
        float floatV = sc.nextFloat();
        System.out.println("The float number is : "+floatV);

    }
}