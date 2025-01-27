package NasruPracticeforDSA.javaPractice.SearchingTechniques;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={6,3,1,2,7,5,4};

        sort(arr);
        for(int x:arr){
            System.out.print(x +" ");
        }
    }
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
