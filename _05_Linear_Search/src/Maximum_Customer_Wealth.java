public class Maximum_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));

    }
    static int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int bank = 0; bank < accounts[person].length; bank++) {
                sum += accounts[person][bank];
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}
