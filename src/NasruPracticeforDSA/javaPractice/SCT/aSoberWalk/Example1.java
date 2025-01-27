package NasruPracticeforDSA.javaPractice.SCT.aSoberWalk;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nU");
        int no=sc.nextInt();
        String bin="";
        while(no!=0){
            bin=(no&1)+bin;
            no=no>>1;
        }
        bin=bin.replaceAll("1","2");
        bin=bin.replaceAll("0","1");
        bin=bin.replaceAll("2","0");
        int res=Integer.parseInt(bin,2);

        System.out.println(res);
    }
}
