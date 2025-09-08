package NasruPracticeforDSA.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E", "F")
        );

        List<String> flat =nested.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList());

        System.out.println(flat); // [A, B, C, D, E, F]
    }
}

