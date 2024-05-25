package Assignments;
import java.util.Scanner;
public class _40_Months_In_August {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Assuming August has 31 days
        int daysInAugust = 31;
        int evenDaysCount = 0;

        // Loop through the days of August
        for (int day = 1; day <= daysInAugust; day++) {
            // Check if the day is even
            if (day % 2 == 0) {
                evenDaysCount++;
            }
        }

        System.out.println("Number of days Kunal can go out in August: " + evenDaysCount);

    }
}
