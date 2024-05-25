public class Search_In_Range {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 3;
        System.out.println(searchInRange(arr,target,1,4));
    }
    static int searchInRange(int[] arr, int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = start; index <= end; index++) {
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
