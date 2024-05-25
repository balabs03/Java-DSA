package Assignments;
import java.util.Scanner;
public class _10_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        System.out.print(a + " ");
        if(n == 1) return;
        int b = 1;
        System.out.print(b + " ");
        if(n == 2) return;
        for(int i = 3;i<=n;i++){
            int ans = a+b;
            System.out.print(ans + " ");
            a = b;
            b = ans;
        }
    }
}
