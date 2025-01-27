package NasruPracticeforDSA.javaPractice.StringFunctions;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();

        int[] arr= new int[n];



        System.out.println("Enter the array Values:");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }


    }
}
