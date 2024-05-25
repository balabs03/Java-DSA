import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println(list.contains(4));
        list.set(0,99);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);


        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            l.add(sc.nextInt());
        }

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
        System.out.println();


    }
}
