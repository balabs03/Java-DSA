public class _Linear_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 7;
        int ans = linearSearch2(arr,target);
        System.out.println(ans);
        ans = linearSearch(arr,target);
        System.out.println(ans);
        System.out.println(linearSearch3(arr,target));
    }

    // Return index
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        // This line executes when none of return statements above has been executed
        // The target is not present in array
        return -1;
    }

    // Return element itself

    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // For boolean result
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int i = 0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
