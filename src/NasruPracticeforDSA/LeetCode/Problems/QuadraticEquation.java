package NasruPracticeforDSA.LeetCode.Problems;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Input a:");
        double a= sc.nextDouble();
        System.out.print("Input b:");
        double b= sc.nextDouble();
        System.out.print("Input c:");
        double c= sc.nextDouble();
//        (-b±√(b²-4ac))/(2a)
        double result= b * b - 4.0 * a * c;
        if(result > 0.0){
            double r1 =(-b+Math.pow(result,0.5))/2.0*a;
            double r2 =(-b-Math.pow(result,0.5))/2.0*a;
            System.out.println(("The roots are " + r1 + " and " + r2));
        } else if (result==0.0) {
            double r3= -b/2.0*a;
            System.out.println("The roots is" + r3);
        }else{
            System.out.println("The Equation has no real roots");
        }
    }
}
