import java.util.Scanner;
public class PrimeNumber_ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isPrime());
        System.out.println(isArmStrong());
    }
    static boolean isPrime(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 2;
        while(c <= Math.sqrt(n)){
            if(n % c == 0) return false;
            c++;
        }
        return true;
    }

    static boolean isArmStrong(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if(sum == n) return true;
        return false;
    }
}
