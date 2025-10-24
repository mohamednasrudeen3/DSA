package NasruPracticeforDSA.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,3,4,5,6,6,7,7,8,3,3);
        Set<Integer> unique = new HashSet<>();

        list.stream()
                .filter(x->!unique.add(x))
                .distinct()
                .forEach(System.out::println);




    }

}
