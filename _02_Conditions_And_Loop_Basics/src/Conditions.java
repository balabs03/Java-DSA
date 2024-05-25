import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        /*
            ***syntax for if statements***
            if(boolean){
                //code
            }else{
                //code
            }
         */
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if(salary > 10000) {
            salary += 2000;
        }
        else{
            salary += 1000;
        }
        System.out.println(salary);

        int a = 3;
        if(a == 1){
            System.out.println("1");
        }else if(a == 3){
            System.out.println("3");
        }else{
            System.out.println("something");
        }
    }
}