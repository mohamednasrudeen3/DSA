package NasruPracticeforDSA.TOP150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example6 {
    public static List<List<Integer>> threeSum(int[] nums){

        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();

        for(int i=0;i<nums.length && nums[i]<=0;i++){
            if(i==0 ||nums[i]!=nums[i-1]){
                twosum(nums,i,result);
            }
        }

return result;
    }
    public static void twosum(int[] nums,int i, List<List<Integer>> result){
        int left= i+1;
        int right= nums.length-1;
        while(left<right){
            int sum=(nums[i]+nums[left]+nums[right]);
            if(sum<0){
                left++;
            }
            else if(sum>0){
                right--;
            }else{
                result.add(Arrays.asList(nums[i],nums[left++],nums[right--]));
                while(left<right && nums[left]!=nums[left-1]){
                    left++;
                }
            }


        }
    }


    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> list=threeSum(nums);
        for(List l:list){
            System.out.println(l);
        }
        int small = Math.min(1,1);
        System.out.println(small);
    }
}
