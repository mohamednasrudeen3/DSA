package NasruPracticeforDSA.Stream;

import java.util.*;
import java.util.stream.*;

public class Example6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Nasrudeen", "Mohamed", "Ahmed", "Kumar");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
