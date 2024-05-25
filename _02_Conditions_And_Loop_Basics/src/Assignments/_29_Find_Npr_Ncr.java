package Assignments;
import java.util.Scanner;

public class _29_Find_Npr_Ncr {
    static int fact(int n){
        int ans = 1;
        for(int i = n;i>=1;i--){
            ans *= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value : ");
        int N = sc.nextInt();
        System.out.println("Enter the R value : ");
        int R = sc.nextInt();

        double nCr = (double) fact(N) /(fact(R) * fact(N-R));
        System.out.println("nCr value is " + nCr);
        double nPr  = (double) fact(N) / fact(N-R);
        System.out.println("nPr value is " + nPr);


    }
}
