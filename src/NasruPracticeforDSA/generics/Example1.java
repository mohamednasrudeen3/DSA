package NasruPracticeforDSA.generics;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Only Strings allowed
        list.add("Hello");


        String s = list.get(0); // No casting needed ✅
        System.out.println(s);
    }
}
