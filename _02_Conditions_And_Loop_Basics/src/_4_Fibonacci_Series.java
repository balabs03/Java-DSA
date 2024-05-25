import java.util.Scanner;
public class _4_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        int ans = 0;
        while(count <= n){
            ans = a+b;
            a = b;
            b = ans;
            count++;
        }
        System.out.println(ans);
    }
}
