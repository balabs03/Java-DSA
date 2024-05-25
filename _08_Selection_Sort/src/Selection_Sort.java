import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index, int end) {
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;
    }
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int end = arr.length - 1 - i;
            int index = maxIndex(arr, end);
            System.out.println(index);
            swap(arr,index,end);
        }
    }
    static int maxIndex(int[] arr,int end) {
        int maxElement = arr[0];
        int index = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                index = i;
            }
        }
        return index;
    }
}
