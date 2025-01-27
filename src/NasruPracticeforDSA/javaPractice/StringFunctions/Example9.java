package NasruPracticeforDSA.javaPractice.StringFunctions;


import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        int n=sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter "+n+" Elements");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    sortArray(arr);
    for(int num:arr){
        System.out.print(num+" ");
    }
    }
    public static void sortArray(int a[]){
        int low=0,mid=0,high=a.length-1;
        while (mid<=high){
            switch(a[mid]){
                case 0:
                    swap(a,low,mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(a,mid,high);
                    high--;
                    break;
            }
        }
    }
    public static void swap(int a[],int b, int c){
        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }


}