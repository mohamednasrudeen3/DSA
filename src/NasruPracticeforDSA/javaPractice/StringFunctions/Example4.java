package NasruPracticeforDSA.javaPractice.StringFunctions;

import java.util.Scanner;

public class Example4 {

    /*
    Given an integer array Arr of size N the task is to find the count of elements whose value is greater
    than all of its prior elements.
    Note : 1st element of the array should be considered in the count of the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr =new int[n];
        for(int m :arr){
            m =scanner.nextInt();
        }
        for(int e:arr){
            System.out.println(e);
        }
    }

}
