package NasruPracticeforDSA.javaPractice.oOps.Counstructor;

public class Classroom {
   /* Write a Java program to create a class called Classroom with
            instance variables className and students (an array of strings).
    Implement a parameterized constructor that initializes these variables.
    Print the values of the variables.*/
    private String className;
    private String[] students;
    Classroom(String className,String[] students){
        this.className=className;
        this.students=students;
    }


    public void printClassroom(){
        System.out.println("ClassName: "+className);
        for(String student:students){
            System.out.println(student+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] studentArray={"Nasru","Yaseen","Ibrahim"};
        String schlName="The Nasru School";
         Classroom cr= new Classroom(schlName,studentArray);
         cr.printClassroom();
    }
}
