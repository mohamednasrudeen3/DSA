package NasruPracticeforDSA.javaPractice.oOps.Static_Practice;

public class Initializer {
    /*
    Write a Java program to create a class called "Initializer" with a static block
     that initializes a static variable 'initialValue' to 1000. Print the value
      of 'initialValue' before and after creating an instance of "Initializer"
     */
    static int initialValue;
    static{
    initialValue=786;
        System.out.println("The static value before all: "+initialValue);
        }

    public static void main(String[] args) {
        System.out.println(Initializer.initialValue);

    }

}
