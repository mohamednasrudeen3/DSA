package NasruPracticeforDSA.javaPractice.SearchingTechniques;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={65,12,45,39,98,76,41};
        int[] sortArr=merge(arr);
        for(int num:sortArr){
            System.out.print(num+" ");
        }

    }
    public static int[] merge(int arr[]) {

        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left = merge(Arrays.copyOfRange(arr,0,mid));
        int[] right=merge(Arrays.copyOfRange(arr,mid,arr.length));
        return merging(left, right);


    }
    public static int[] merging(int[] first,int[] second){
        int i=0,j=0,k=0;
        int[] joined=new int[first.length+second.length];
        while(i<first.length&& j<second.length)
        if(first[i]<second[j]){
            joined[k++]=first[i++];
        } else{
            joined[k++]=second[j++];
        }

            while(i<first.length){
                joined[k++]=first[i++];
            } while(j<second.length) {
                joined[k++]=second[j++];
            }

        return joined;
    }
}
