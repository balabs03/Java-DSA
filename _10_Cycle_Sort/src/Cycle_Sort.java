import java.util.Arrays;

public class Cycle_Sort {
    public static void main(String[] args) {
        int[] arr = {10,7,8,9,4,5,2,1,3,6};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while(i < arr.length-1) {
            int correct = arr[i] - 1;
            if(arr[i] == arr[correct]) {
                i++;
            }else{
                swap(arr, i, correct);
            }
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
