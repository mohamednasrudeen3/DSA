package NasruPracticeforDSA.zohoInterview;

public class Practice1 {
    public static void printMatrix(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        for(int d=0;d<m+n-1;d++){
            if(d%2==0){
                int row = Math.min(d,m-1);
                int col= d-row;
                while(row>=0 && col<m){
                    System.out.print(mat[row][col]+ " ");
                    row--;
                    col++;
                }

            }
            else{
                int col=Math.min(d,m-1);
                int row=d-col;
                while(col>=0 && row<m ){
                    System.out.print(mat[row][col]+ " ");
                    row++;
                    col--;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        printMatrix(matrix);
    }
}
