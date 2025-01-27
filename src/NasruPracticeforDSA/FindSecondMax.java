package NasruPracticeforDSA;

public class FindSecondMax {
    public static int findSecondMax(int[] arr) {

        int max= Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax= max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!= max){
                smax =arr[i];
            }
        }
        return smax;
    }


    public static void main(String[] args) {
     int[] arr = {3,8,4,18,10,3,4,17,21};

        System.out.println(findSecondMax(arr));

    }
}
