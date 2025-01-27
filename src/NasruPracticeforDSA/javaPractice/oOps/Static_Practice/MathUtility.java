package NasruPracticeforDSA.javaPractice.oOps.Static_Practice;

public class MathUtility {
 /*   Write a Java program to create a class called "MathUtility" with
    a static method add that takes two integers and returns their sum.
    Demonstrate the usage of this static method in the main method
    without creating an instance of "MathUtility".

  */
    static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        int c=MathUtility.add(5,6);
        System.out.println(c);

    }
}
