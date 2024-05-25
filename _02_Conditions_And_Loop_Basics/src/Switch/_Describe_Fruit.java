package Switch;
import java.util.Scanner;
public class _Describe_Fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Valid fruit : ");
        String fruit = sc.next();
        switch(fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("A round Fruit");
                break;
            case "Grapes":
                System.out.println("A small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }
    }
}
