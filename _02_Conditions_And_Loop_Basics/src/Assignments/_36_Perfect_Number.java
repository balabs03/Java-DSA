package Assignments;
import java.util.Scanner;
public class _36_Perfect_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n/2;i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(n == sum){
            System.out.println("It is a Perfect Number");
        }else{
            System.out.println("It is not a Perfect Number");
        }

    }
}
