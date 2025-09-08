package NasruPracticeforDSA.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(7,9,3,4,2,5,8,10);
//        list.stream()
//                .filter(n->n%2==0)
//                .forEach(System.out::println);
        List<String> list=Arrays.asList("Java","stream","api");
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);



    }

}
