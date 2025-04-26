package NasruPracticeforDSA.LeetCode.SlidingWindow;

public class Leetcode2461 {
    public static long maximumSubarraySum(int[] nums, int k) {
        long re= 0;
        int n=nums.length;
        for(int i=0;i<n-k;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=nums[j]+nums[j+1]+nums[j+2];
            }
           re= Math.max(sum,re);
        }


        return re;
    }
    public static void main(String[] args) {
        int[] arr= {1,5,4,2,9,9,9};
        int k=3;
        Leetcode2461.maximumSubarraySum(arr,k);
    }
}
