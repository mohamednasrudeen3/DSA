package NasruPracticeforDSA.javaPractice;

import java.util.Scanner;

public class CompareFloatingPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1");
        double num1 = sc.nextDouble();
        System.out.print("Enter num2");
        double num2=sc.nextDouble();

        num1 =Math.round(num1*1000);
        num2 =Math.round(num2*1000);

        if(num1==num2){
            System.out.println();
        }

    }
}
