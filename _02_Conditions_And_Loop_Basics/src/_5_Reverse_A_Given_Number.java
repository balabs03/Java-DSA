import java.util.Scanner;

public class _5_Reverse_A_Given_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int ans = 0;
        while(n > 0){
            int rem = n%10;
            ans = (ans*10) +rem;
            n/=10;
        }
        System.out.println(ans);
    }
}
