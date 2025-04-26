package NasruPracticeforDSA.LeetCode.Problems;

public class RemoveDuplicates {

public static int removeDuplicates(int[] nums){
    int i=0;
    for(int n:nums){
        if(i<2 || n!=nums[i-2]){
            nums[i++]=n;
        }
    }
    return i;
}
    public static void main(String[] args) {
        int[] nums= {1,1,1,2,2,3,3,3,3,4,4};
        int count=removeDuplicates(nums);
        System.out.println(count);
    }
}
