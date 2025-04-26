package NasruPracticeforDSA.LeetCode;


class NumArray {
    int[] prefixSum=null;
    public NumArray(int[] nums) {
        prefixSum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
         prefixSum[i+1]=prefixSum[i]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right+1]-prefixSum[left];
    }

}

