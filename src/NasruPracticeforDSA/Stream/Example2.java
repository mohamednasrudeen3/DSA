package NasruPracticeforDSA.Stream;

import java.util.Arrays;
import java.util.List;

class Example2{
    public static void main(String[] args) {
//        Given a list of integers, print only the even numbers.

/*        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
             nums.stream()
                        .filter(x->x%2==0)
                       .forEach(System.out::println);
   */

//        Convert a list of strings to uppercase using map()
       /* List<String> words = Arrays.asList("java", "spring", "api");
        words.stream()
                .map(name->name.toUpperCase())
                .forEach(System.out::println);

        */

//        Count how many names start with "A".
        List<String> names = Arrays.asList("Ali", "Ahmed", "Kumar", "Anil");

        long n=names.stream()
                .filter(name->name.startsWith("A"))
                .count();
        System.out.println(n);


    }
}