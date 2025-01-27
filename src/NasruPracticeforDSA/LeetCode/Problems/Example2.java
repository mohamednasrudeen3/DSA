package NasruPracticeforDSA.LeetCode.Problems;
//121. Best Time to Buy and Sell Stock
public class Example2 {

    public  int maxProfit(int[] prices) {
        int n = prices.length;
        boolean dec = decOrder(prices);
        int maxp=0;
        if (!dec) {
            for(int i=0;i<n-1;i++){
                int bp=prices[i];
                int profit=0;
                for(int j=i+1;j<n;j++){
                    profit=bp-prices[j];
                    maxp=Math.max(profit,maxp);
                }
            }
        }
return maxp;
    }

    public  boolean decOrder(int[] prices) {
        boolean dec = false;
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                dec = true;
            }
        }
        return dec;
    }

    public static void main(String[] args) {
        Example2 obj= new Example2();
        int[] arr= {7,5,4,8,1};
        int sol=obj.maxProfit(arr);
        System.out.println(sol);
    }
}
