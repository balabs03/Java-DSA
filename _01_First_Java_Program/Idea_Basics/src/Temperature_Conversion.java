import java.util.*;
public class Temperature_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius : ");
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit : " + tempF);
    }
}
