package NasruPracticeforDSA.Stream;

import java.util.Arrays;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,3,5,6,7,8,9,10);
        list.stream()
                .filter(x->x%2!=0)
                .forEach(System.out::println);
    }

}
