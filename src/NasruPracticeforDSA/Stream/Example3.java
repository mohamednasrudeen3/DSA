package NasruPracticeforDSA.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("mohamed", "nasrudeen", "java");
        List<String> upperCaseNames=names.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println(upperCaseNames);

    }
}
