package NasruPracticeforDSA.Collections;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create an array list, add some colors (strings) and print out the collection.
public class Exercise1 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("Red");
        list.add("White");
        list.add("Green");

        for(String x:list){
            System.out.print(x+"  ");
        }
    }
}
