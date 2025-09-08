package NasruPracticeforDSA.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example7 {
//    Find the maximum number in a list using reduce().
public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 10, 20, 50, 30);
    int Max=numbers.stream()
            .reduce(Integer.MIN_VALUE,(a,b)->(a>b)?a:b);
    System.out.println(Max);
}

}
