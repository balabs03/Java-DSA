public class Function_Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + " " +b);
    }
    static void sum(int q){
        System.out.println(q);

    }
}
