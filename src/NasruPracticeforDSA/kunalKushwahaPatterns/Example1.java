package NasruPracticeforDSA.kunalKushwahaPatterns;

public class Example1 {

        public static int[][] rotate(int[][] matrix) {

            int n= matrix.length;

            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    int temp =matrix[i][j];
                    matrix[i][j]= matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
            for(int i=0;i<n;i++){
                int start =0;
                int end=n-1;
                while(start<end){
                    int temp=matrix[i][start];
                    matrix[i][start]=matrix[i][end];
                    matrix[i][end] = temp;
                    start++;
                    end--;
                }
            }
            return matrix;

    }
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotate(arr);

//        int a= arr.length;
//        int b=arr[0].length;
//        int[][] sol=new int[3][3];
//
//        for(int i=0;i<a;i++){
//            for(int j=0;j<b;j++){
//                sol[j][a-i-1]= arr[i][j];
//
//            }
//
//        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}
