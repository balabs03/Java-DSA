import java.util.Arrays;

public class Method_Overloading {
    public static void main(String[] args) {
        sum(1,2);
        sum(1,2,3);
        sum("bala","kumaran");
        sum("bala","kumaran","G");
        sum("bala");

    }
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void sum(String a,String b){
        System.out.println(a);
        System.out.println(b);
    }
    static void sum(String a,String b,String c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static void sum(String a,String ...v){
        System.out.println(a);
        System.out.println(Arrays.toString(v));
    }



}
