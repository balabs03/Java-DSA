package Switch;

import java.util.Scanner;
import java.util.Scanner;
public class _Nested_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID : ");
        int id = sc.nextInt();
        String dept = sc.next();
        switch (id) {
            case 1, 2 -> {
                System.out.println(id);
                switch (dept) {
                    case "CSE" -> System.out.println("CSE");
                    case "ECE" -> System.out.println("ECE");
                    default -> System.out.println("No");
                }
            }
            default -> System.out.println("Invalid");
        }
        }
    }

