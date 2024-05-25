import java.util.Arrays;

public class _Internal_Working {
    public static void main(String[] args) {

        // Primitives
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);

        //Non primitives - String
        String name = "bala";
        changeName(name);
        System.out.println(name);

        // Non primitives - arr
        int[] aa = {1,2,3,4,5};
        change(aa);
        System.out.println(Arrays.toString(aa));


    }
    static void change(int[] nums){
        nums[0] =99;
    }
    static void changeName(String naam){
        naam = "kumaran";
    }
    static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
