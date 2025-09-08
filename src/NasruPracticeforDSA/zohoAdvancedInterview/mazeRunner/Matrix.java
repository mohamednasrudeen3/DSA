package NasruPracticeforDSA.zohoAdvancedInterview.mazeRunner;

import java.util.Scanner;

public class Matrix {
    public static int findShortest(int startX,int startY,int endX,int endY){
        int shortest=Math.max(Math.abs(endX-startX),Math.abs(endY-startY));
        return shortest;
    }
    public static void main(String[] args) {
        System.out.println("Enter the n for n*n Matrix: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        char[][] matrix= new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = '0';

            }

        }

        System.out.println("Enter Adventurer Position(row and col):");
        int aRow= sc.nextInt();
        int aCol= sc.nextInt();

        matrix[aRow][aCol]='A';
        System.out.println("Enter Destination Position(row and col):");
        int dRow= sc.nextInt();
        int dCol= sc.nextInt();
        matrix[dRow][dCol]='D';

        System.out.println("the N*N matrix is");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

//   Finding Shortest Path

        System.out.println("The Shortest Distance is :");
        System.out.println(findShortest(aRow,aCol,dRow,dCol));
    }
}
