package Switch;
import java.util.Scanner;
public class _Weekdays_Weekends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int from 1 to 7 : ");
        int day = sc.nextInt();
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Enter the Valid day");
        }
    }
}
