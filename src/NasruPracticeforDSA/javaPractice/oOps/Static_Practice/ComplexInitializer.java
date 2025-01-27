package NasruPracticeforDSA.javaPractice.oOps.Static_Practice;

public class ComplexInitializer {
    /*
    Write a Java program to create a class called "ComplexInitializer" with a static block that
    initializes multiple static variables (x, y, z) using complex logic. Print the values of
     these variables in the main method.
     */
    private static int x;
    private static int y;
    private static int z;

    static {
        x=12;
        y=15;
        z=calculateZ(x,y);
    }
    private static int calculateZ(int a,int b){
        return a * b + (a - b);
    }

    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
        System.out.println();
    }

}
