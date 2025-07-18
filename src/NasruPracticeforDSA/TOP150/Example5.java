package NasruPracticeforDSA.TOP150;

import java.util.Arrays;
import java.util.HashSet;

public class Example5 {
    public static int longest(int[] nums){
        int lcs=1;

        HashSet<Integer> set= new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)) {
                continue;
            }else{
                int currentSub=1;
                int currentNum=nums[i];
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentSub++;
                }
                lcs= Math.max(lcs,currentSub);

            }
        }
        return lcs;
    }

    public static void main(String[] args) {
        int[] nums={-1,-1,0,5,200,7,0,2,3,4};
        System.out.println(longest(nums));
    }
}
