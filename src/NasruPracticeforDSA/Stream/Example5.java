package NasruPracticeforDSA.Stream;

import java.util.Arrays;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 40, 30, 20);

        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
