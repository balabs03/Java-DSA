public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,55,65};
        int target = 1;
        System.out.println(search(arr,target,0,6));
    }
    static int search(int[] arr, int target,int s, int e) {
        while(s <= e) {
            int mid = (s + e) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] > target) {
                return search(arr,target,s,mid-1);
            }
            if(arr[mid] < target) {
                return search(arr,target,mid+1,e);
            }
        }
        return -1;
    }
}
