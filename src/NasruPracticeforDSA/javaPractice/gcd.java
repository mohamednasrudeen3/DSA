package NasruPracticeforDSA.javaPractice;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st Number");
        int a=sc.nextInt();
        System.out.println("enter 2nd Number");
        int b=sc.nextInt();

        while(a!=b){
            if(a>b){
                a=a-b;

            }
            else{
                b=b-a;
            }
        }
        System.out.println("gcd"+a);


    }
}
