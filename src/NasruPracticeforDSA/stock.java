package NasruPracticeforDSA;

public class stock {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++)
            profit += prices[i] > prices[i-1] ? prices[i]-prices[i-1] : 0;
        return profit;
    }

    public static void main(String[] args) {
        int[] prices= {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
}
