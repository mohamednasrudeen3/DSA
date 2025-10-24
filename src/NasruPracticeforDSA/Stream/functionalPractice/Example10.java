package NasruPracticeforDSA.Stream.functionalPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        List<Integer>  list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream()
                .filter(x->x%2==0)
                .forEach(System.out::println);

    }
}
