package NasruPracticeforDSA.javaPractice.StringFunctions;

import java.util.ArrayList;
import java.util.Arrays;

public class Example5 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(13);
        for(int q:list){
            System.out.println(q);
        }


        int[] arr= new int[list.size()];
        int index=0;
        for(int element: list){
            arr[index]=element;
            index++;
        }
        for(int e: arr){
            System.out.print(e);
        }

    }
}
