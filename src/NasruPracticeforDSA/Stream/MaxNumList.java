package NasruPracticeforDSA.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxNumList {
    public static void main(String[] args) {
//    List<Integer> list = Arrays.asList(1,1,6,7,8,3,9,8);
//        Set<Integer> set = new HashSet<>();
//   Set<Integer> duplicates = list.stream()
//           .filter(x->!set.add(x))
//           .collect(Collectors.toSet());
//   for(int x:duplicates){
//       System.out.println(x);
//   }







//        Given a List<String> of names, write a Java Stream
//        snippet to find all names that appear more than once,
//        and collect them into a Set<String>.
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob", "David");
        Set<String> unique = new HashSet<>();
        names.stream()
                .filter(name->!unique.add(name))
                .forEach(System.out::println);







    }
}
