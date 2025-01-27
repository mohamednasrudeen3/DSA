package NasruPracticeforDSA.javaPractice.nestedClasses;

public class MathUtil {
    /*
        Write a Java program to create an outer class called 'MathUtil' with a static nested class Calculator.
         The Calculator class should have a static method add(int a, int b) that returns the sum of a and b.
          Call the add() method from the main method.
     */
    static class Calculator{
        static int add(int a, int b){
            return a+b;
        }
    }

    public static void main(String[] args) {
        int sum=MathUtil.Calculator.add(12,45);
        System.out.println(sum);


    }
}
