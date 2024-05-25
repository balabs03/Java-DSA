import java.util.*;
public class Type_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float floatVF = sc.nextFloat();
        System.out.println(floatVF);

        float floatVI = sc.nextInt();
        System.out.println(floatVI);

        int a = (int)67.67f;
        System.out.println(a);

        int aa = 257;
        byte b = (byte)aa;
        System.out.println(b);

        byte aaa = 40;
        byte bbb = 50;
        byte ccc = 100;
        int ans = (aaa*bbb)/ccc;
        System.out.println(ans);

        byte q = 50;
        q = (byte)(q*2);
        System.out.println(q);

        byte p = 42;
        char o = 'p';
        short i = 1024;
        int u = 50000;
        float y = 5.675f;
        double t = 0.1234;
        double result = (y*p) +(u/o) -(t*i);
        System.out.println(result);
    }
}
