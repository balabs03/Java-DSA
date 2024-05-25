import java.util.ArrayList;
import java.util.Arrays;

public class Strings_Basics {
    public static void main(String[] args) {
        String name = "Balakumaran";
        System.out.println(name);

        String a = "Swetha";
        String b = "Swetha";
        System.out.println(a == b);

        String aa = new String("Swetha");
        String bb = new String("Swetha");
        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));

        System.out.println(aa.charAt(0));

        //PrintStream class
        System.out.println(56);
        System.out.println("Bala");
        System.out.println(new int[]{2,3,4,5,6});
        System.out.println(Arrays.toString(new int[]{2,3,4,5,6}));

        // wrapper class
        Integer num = new Integer(56);
        System.out.println(num);


        //Pretty printing
        float q = 1234.5678f;
        System.out.printf("Formatted number is %.2f ",q);

        System.out.printf("PIE : %.3f " , Math.PI);

        System.out.println();

        System.out.printf("Hello my name is %s and i am an %s","bala","student");

        System.out.println();

        // Operators
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 'a');
        System.out.println("a" + 1);
        System.out.println("bala"+ new ArrayList<>());
        System.out.println("bala" + new Integer(56));
        System.out.println(new Integer(5) + "" + new ArrayList<>());

        //StringBuilder
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<26;i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);

        //String Methods
        String na = "Balakumaran";
        System.out.println(na);

        char[] arr = na.toCharArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(na.toLowerCase());
        System.out.println(na.toUpperCase());

        System.out.println(na);

        System.out.println(na.indexOf('n'));

        System.out.println("                      b            a l       a".strip());

        System.out.println(Arrays.toString("bala kumaran hello bala how are you bala ".split(" ")));
    }
}
