package NasruPracticeforDSA.javaPractice.SCT.aSoberWalk;

import java.util.Scanner;

public class CoinBased {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        int one=0,two=0;
        int five = (num-4)/5;

       if(num-(5*five)%2==0){
           one=2;
       }else{
           one=1;
       }
       two=((num-5*five)-one)/2;
    }
}
