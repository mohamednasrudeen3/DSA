package NasruPracticeforDSA.generics;

public class Main{
    public static void main(String[] args) {
        Calculator<Integer> calculator = new Calculator<>();
        System.out.println(calculator.square(5));

    }
}
