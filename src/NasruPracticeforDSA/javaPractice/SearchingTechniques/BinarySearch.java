package NasruPracticeforDSA.javaPractice.SearchingTechniques;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {8,7,5,3,2,1};

//        sort(arr);
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }


        int pos=search(arr, 5);

        System.out.println("\n"+"The element at "+ pos +" position");
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1, mid;
        boolean asc=false;
        if(arr[start]<arr[end]){
            asc=true;
        }
   if(asc) {
       while (start <= end) {
           mid = (start + end) / 2;
           if (target > arr[mid]) {
               start = mid + 1;
           } else if (target < arr[mid]) {
               end = mid - 1;
           } else {
               return mid;
           }
       }
   }else{
       while (start <= end) {
           mid = (start + end) / 2;
           if (target > arr[mid]) {
               end = mid - 1;
           } else if (target < arr[mid]) {
               start = mid + 1;
           } else {
               return mid;
           }
       }
   }
        return -1;
    }

}
