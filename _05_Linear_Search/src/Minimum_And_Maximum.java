public class Minimum_And_Maximum {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println("The minimum element is " + minimum(arr));
        System.out.println("The maximum element is " + maximum(arr));
    }
    static int minimum(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int maximum(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
