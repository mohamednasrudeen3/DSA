package NasruPracticeforDSA.TOP150;

public class Example3 {
    public static int[] Except(int[] nums){
        int n=nums.length;
        int pre=1;
        int post=1;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=pre;
            pre=nums[i]*pre;

        }
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*post;
            post=post*nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int[] result=Except(arr);
        for(int n:result){
            System.out.print(n+ " ");
        }
    }
}
