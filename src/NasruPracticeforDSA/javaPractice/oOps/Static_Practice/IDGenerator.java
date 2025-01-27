package NasruPracticeforDSA.javaPractice.oOps.Static_Practice;

public class IDGenerator {
    /*
    Write a Java program to create a class called "IDGenerator" with a static variable 'nextID' and a static method
     "generateID()" that returns the next ID and increments 'nextID'. Demonstrate the usage of generateID in the main method.
     */
    static int nextID;

    static int generateID(){

        return nextID++;
    }

    public static void main(String[] args) {

        System.out.println(IDGenerator.generateID());
        System.out.println(nextID);
    }
}
