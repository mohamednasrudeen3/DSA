package NasruPracticeforDSA.javaPractice.nestedClasses;

public class Computer {
    /*
    Write a Java program to create an outer class called  Computer with an inner class Processor.
     The Processor class should have a method "displayDetails()" that prints the details of the
      processor (e.g., brand and speed). Create an instance of Processor from the Computer class
       and call the "displayDetails()" method.
     */
    class Processor{

        public void printDetails(){
            System.out.println("Brand: intel");
            System.out.println("Speed: 4.5 GHz");
        }

    }
    void showPrintDetails(){
        Processor processor= new Processor();
        processor.printDetails();
    }

    public static void main(String[] args) {
        Computer computer= new Computer();
        computer.showPrintDetails();
    }
}
