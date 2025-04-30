package NasruPracticeforDSA.TopInterviewQuestions.SlidingWindow;

public class Leetcode209 {
    public static int minSubArrayLen(int target, int[] nums) {
     int minSize=Integer.MAX_VALUE;
     int n=nums.length;
     for(int i=0;i<n;i++){
         int sum=0;
         for(int j=i;j<n;j++){
             sum+=nums[j];
             if(sum==target){
                 int res=j-i+1;
                 minSize=Math.min(minSize,res);
             }
         }
     }
     return minSize;
    }
    public static int slidingWin(int target,int[] nums){
        int minSize=Integer.MAX_VALUE;
        int start=0,sum=0;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            while(sum>=target){

                minSize=Math.min(minSize,end-start+1);
                sum-=nums[start++];
            }
        }
        return minSize==Integer.MAX_VALUE?0:minSize;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target,arr));
        System.out.println(slidingWin(target,arr));

    }
}
