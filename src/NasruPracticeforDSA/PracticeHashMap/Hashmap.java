package NasruPracticeforDSA.PracticeHashMap;
//Write a Java program to copy all mappings from the specified map to another map.

import java.util.HashMap;

class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap= new HashMap<>();
        hashMap.put(1,"Red");
        hashMap.put(2,"Green");
        hashMap.put(3,"Blue");
        System.out.println("HashMap before removal:"+ hashMap);
        hashMap.clear();
        System.out.println("HashMap after removal:"+ hashMap);


    }
}