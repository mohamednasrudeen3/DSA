package NasruPracticeforDSA.LeetCode.Problems;


public class Example1 {
    //    26. Remove Duplicates from Sorted Array
    public int removeDuplicates(int[] nums){
        int uniqueCount=0;
        for(int currentElement:nums){
            if(uniqueCount==0||currentElement!=nums[uniqueCount-1]){
                nums[uniqueCount++]=currentElement;
            }

        }
        return uniqueCount;
    }
    public static void main(String[] args) {
        Example1 obj= new Example1();
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int sol=obj.removeDuplicates(arr);
        System.out.println(sol);
    }
}
