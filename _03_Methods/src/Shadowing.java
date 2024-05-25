public class Shadowing {
    static int x = 99;
    static int y = 90;
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
        int x = 30;
        y = 80;
        System.out.println(x);
        System.out.println(y);
        fun();
    }
    static void fun(){
        System.out.println(x);
        System.out.println(y);
    }
}
