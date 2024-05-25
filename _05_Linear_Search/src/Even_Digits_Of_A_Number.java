public class Even_Digits_Of_A_Number {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(evenDigitCount(nums));

    }
    static int evenDigitCount(int[] nums){
        int count = 0;
        for(int a : nums) {
            if(digit(a) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    /* static int digit(int a){
        int ans = 0;
        if(a < 0){
            a = a * -1;
        }
        if(a == 0){
            return 1;
        }
        while(a > 0){
            ans++;
            a /= 10;
        }
        return ans;
    } */
//    static int digit(int a){
//       String ans = a+"";
//        return ans.length();
//    }

    static int digit(int a){
        if(a < 0){
            a = a * -1;
        }
        return (int)(Math.log10(a)+1);
    }

}
