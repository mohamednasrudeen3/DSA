package NasruPracticeforDSA;

import java.util.Arrays;

public class BubbleSort {

public static int[] sort(int[] arr){
    int n= arr.length;
    for (int i=0;i<n;i++){
        for (int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
    }
    return arr;
}

    public static void main(String[] args) {
        int[] arr= {22,10,14,30,6,17};
        System.out.print(Arrays.toString(sort(arr)));

    }
}
