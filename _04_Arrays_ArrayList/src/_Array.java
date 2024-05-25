import java.sql.SQLOutput;
import java.util.*;
public class _Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Syntax ==> datatype[] variable_name = new datatype[size];
        int[] arr = new int[5];
        int[] arr2 = {1,2,3,4,5};

        int[] arr3; // declaration
        arr3 = new int[5]; // initialisation
        System.out.println(Arrays.toString(arr3));

        System.out.println(arr2[3]);
        System.out.println(arr2[1]);

        System.out.println(Arrays.toString(arr2));
        arr2[0] = 99;
        System.out.println(Arrays.toString(arr2));

        String[] ans;
        ans = new String[5];
        System.out.println(Arrays.toString(ans));

        // int q = null; -- This is wrong
        String e = null;

        // null a = null; this is also wrong

        System.out.println("Input ++++++++++++++++++ Input ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        for(int num : arr){
            System.out.print(num +" ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));

        }

    }

