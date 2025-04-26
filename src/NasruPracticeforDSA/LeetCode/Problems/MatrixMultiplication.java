package NasruPracticeforDSA.LeetCode.Problems;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a= {
            {2,3},
            {4,5}
        };

        int[][] b= {
                {1,2,3},
                {4,5,6,}
        };
//Result declare 2*2 2*3
        int c[][]=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                c[i][j]=0;
                for(int k=0;k<a.length;k++){
                                     c[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                System.out.print(c[i][j]+"  ");

            }
            System.out.println();
        }





    }
}
