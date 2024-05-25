public class Block_Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "bala";
        {
            a = 100;
            System.out.println(a);
            int c = 99;
            name = "kumaran";
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
    }
}
