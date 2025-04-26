package NasruPracticeforDSA.LeetCode;

public class stock {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int maxP=prices[0];
        for (int price:prices) {
            maxP = Math.max(maxP, maxP - price);
            profit=Math.min(price,maxP);
        }
        return maxP;
    }

    public static void main(String[] args) {
        int[] prices= {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
}
