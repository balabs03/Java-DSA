package Assignments;
import java.util.Scanner;
public class _11_Factors_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int half  = n/2;
        for(int i = 1;i<=half;i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
        System.out.println(n);
    }
}
