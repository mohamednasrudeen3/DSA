package NasruPracticeforDSA.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> freq = words.stream()
                .collect(Collectors.groupingBy(w->w,Collectors.counting()));
        System.out.println(freq);
    }
}
