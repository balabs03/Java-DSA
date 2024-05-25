import java.util.Arrays;

public class Var_Args {
    public static void main(String[] args) {
        demo(1,2);
    }
    static void demo(int a, int b,int ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
