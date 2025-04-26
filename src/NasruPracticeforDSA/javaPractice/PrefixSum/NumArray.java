package NasruPracticeforDSA.javaPractice.PrefixSum;



class NumArray {
private int[] sumArray;

    public NumArray(int[] nums) {
        int n = nums.length;
        sumArray = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sumArray[i + 1] = sumArray[i] + nums[i];
        }

    }

    public int sumRange(int left, int right) {
        return sumArray[right + 1] - sumArray[left];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        NumArray obj = new NumArray(nums);
        int left=2,right=5;
        int param_1 = obj.sumRange(left,right);
        System.out.println(param_1);
    }
}

