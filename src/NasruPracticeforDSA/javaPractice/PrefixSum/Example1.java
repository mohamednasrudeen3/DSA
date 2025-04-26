package NasruPracticeforDSA.javaPractice.PrefixSum;



class Example1{
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6};
        for(int x:nums){
            System.out.print(x+"  ");
        }
        int sum=0;
        int i=1;
        int j=3;
        for(int m=0;m< nums.length;m++){
            nums[m]=sum+ nums[m];
             sum =nums[m];
        }
        int ans=nums[j]-nums[i-1];

        System.out.println("\n"+ans);
    }
}