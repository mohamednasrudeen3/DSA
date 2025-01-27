package NasruPracticeforDSA.javaPractice;

import java.util.HashMap;
import java.util.Scanner;

public class SweetSeventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
    SweetSeventeen.PrintDecimal(input);
    }
    static void PrintDecimal(String num){
        HashMap<Character,Integer> hmap= new HashMap<Character,Integer>();
        hmap.put('A',10);
        hmap.put('B',11);
        hmap.put('C',12);
        hmap.put('D',13);
        hmap.put('E',14);
        hmap.put('F',15);
        hmap.put('G',16);
        hmap.put('a',10);
        hmap.put('b',11);
        hmap.put('c',12);
        hmap.put('d',13);
        hmap.put('e',14);
        hmap.put('f',15);
        hmap.put('g',16);
        System.out.println(num.length());
        int number=0;
        int pow=0;
        for(int i=num.length()-1;i>=0;i--){
            char c = num.charAt(i);
            if((c>='A'&& c<='G')||(c>='a' && c<='g')){
            number += hmap.get(c) * Math.pow(17,pow++);
            }else {
                number +=((int)c -(int)'0')*(int)Math.pow(17,pow++);
            }

        }
        System.out.println(number);



    }



}
