package NasruPracticeforDSA.LeetCode.Twopointer;

import java.util.Arrays;

public class ContainerHeight {

    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans =0;
         while(i<j) {
             int area= (j-i)* Math.min(height[i],height[j]);
             ans= Math.max(ans, area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }

         }
         return ans;
    }



    public static void main(String[] args) {
        int[] arr= {1,1};
        ContainerHeight obj=new ContainerHeight();
        int ans=obj.maxArea(arr);
        System.out.println(ans);
    }
}
