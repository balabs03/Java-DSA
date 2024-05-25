import java.util.Scanner;
public class _1_Largest_Among_Three_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Method - 1
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);

        // Method -2
        max = 0;
        if(a>b){
            max = a;
        }else{
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);

        //Method - 3
        max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
