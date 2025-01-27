package NasruPracticeforDSA.javaPractice.StringFunctions;

import java.util.Scanner;

public class Example3 {
   /*
    A supermarket maintains a pricing format for all its products. A value N is printed on each
    product. When the scanner reads the value N on the item, the product of all the digits in the value
    N is the price of the item. The task here is to design the software such that given the code of any
    item N the product (multiplication) of all the digits of value should be computed(price).

    input -> 5244
    output->160
    */
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int num=sc.nextInt();
       int res=1;
       while(num>0){
           res=res*(num%10);
           num=num/10;
       }
       System.out.println(res);
   }





}
