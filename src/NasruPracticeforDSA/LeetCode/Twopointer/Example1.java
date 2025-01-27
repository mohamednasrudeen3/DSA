package NasruPracticeforDSA.LeetCode.Twopointer;

public class Example1 {
    public static void main(String[] args) {
        Example1 obj=new Example1();
        int[] arr={2,7,11,15};
        int t=9;
        int[] sol=obj.findTwoSum(arr,t);
        for(int x:sol){
            System.out.println(x+" ");
        }
    }

    private int[] findTwoSum(int arr[],int t) {
        int left=0;
        int right=arr.length-1;
        int n=arr.length;


       for(int i=1;i<n;i++){
           if(arr[left]+arr[right]==t){
               int[] sol={left,right};
               return sol;
           } else if(arr[left]+arr[right]>t) {
               right--;
           }else{
               left++;
           }
       }
        int[] a= {-1,-1};
return a;
    }
}
