package NasruPracticeforDSA.PracticeHashMap;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Example2 {

    public static void main(String[] args) {
        HashMap<Integer,String> hmap= new HashMap<>();
        hmap.put(1,"A");
        hmap.put(2,"B");
        hmap.put(3,"c");
        hmap.put(4,"d");
        hmap.put(5,"f");
        hmap.put(6,"g");
        System.out.println(hmap);
//        Write a Java program to get a shallow copy of a HashMap instance.
    Map<Integer,String> newHmap=new HashMap<>();
    newHmap=(HashMap)hmap.clone();
        System.out.println(newHmap);
    }
}
