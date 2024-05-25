import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        /*
        syntax for FOR loop
        for(initialisation;conditions;incremental/decremental){
             //body
        }
         */

        // print from 1 to 5
        for (int num = 1; num <= 5 ; num++) {
            System.out.print(num +" ");
        }
        System.out.println();
        // print from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which it is to be printed");
        int n = sc.nextInt();
        for (int num = 1; num <= n ; num++) {
            System.out.print(num + " ");
        }
        System.out.println();

        /*
        syntax for while loop
        initialisation;
        while(condition){
            //body
            incremental/decremental
        }
         */

        // print from 1 to 5
        int num = 1;
        while (num <= 5) {
            System.out.print(num +" ");
            num++;
        }
        System.out.println();

        /*
        syntax for do while loop
        initialisation;
        do{
            //body
            incremental/decremental
        }while(condition);
         */

        int a = 1;
        do{
            System.out.println(a);
        }while(a != 1);

    }
}
