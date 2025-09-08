package NasruPracticeforDSA.TOP150;

public class Example15 {
    public static int findMin(int[] nums){
       int left=0;
       int right=nums.length-1;
       int ans=nums[0];
       while(left<=right){
           if(nums[left]<nums[right]){
               return Math.min(ans,nums[left]);
           }
           int mid= (left+right)/2;
           if(nums[left]<=nums[mid]){
               left=mid+1;
           }else{
               right=mid-1;
           }
       }
       return ans;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,8,0,1};
        System.out.println(findMin(arr));
    }
}
