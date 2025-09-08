package NasruPracticeforDSA.TOP150;

public class Example13 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=m*n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int midValue =matrix[mid/2][mid%2];
            if(midValue==target){
                return true;
                
            } else if (midValue<target) {
                mid=left+1;
            }else{
                mid=right-1;
            }
        }
return false;
    }
    public static void main(String[] args) {
        int[][] matrix={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

    }
}
