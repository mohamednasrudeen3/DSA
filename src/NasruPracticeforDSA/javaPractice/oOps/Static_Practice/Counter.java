package NasruPracticeforDSA.javaPractice.oOps.Static_Practice;

public class Counter {
    /*
    Write a Java program to create a class called "Counter" with a static variable count.
     Implement a constructor that increments count every time an object is created. Print
      the value of count after creating several objects.
     */
    private static int count;



    Counter() {
        count++;
    }


    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter c1= new Counter();
        Counter c2= new Counter();
        Counter c3= new Counter();
        Counter c4= new Counter();
        Counter c5= new Counter();
        Counter c6= new Counter();


        System.out.println(Counter.getCount());

    }
}
