package NasruPracticeforDSA.LeetCode.Problems;

import java.util.Scanner;

public class positiveOrnegavtive {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Inputnumber:");
        int input=in.nextInt();
        if(input>0){
            System.out.println("you entered a positive number");
        }
        else{
            System.out.println("please enter the positive number");
        }
    }
}
