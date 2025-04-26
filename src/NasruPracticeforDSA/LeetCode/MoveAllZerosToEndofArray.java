package NasruPracticeforDSA.LeetCode;

public class MoveAllZerosToEndofArray {


    public static int[] moveZero(int[] arr) {
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0 && arr[j]==0){
            int temp;
            temp= arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
        }
        if(arr[j]!=0){
            j++;
        }
    }
    return arr;
    }

    public static void main(String[] args) {
        int[] arr= {4,0,9,0,5,0,7,0,9};


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
