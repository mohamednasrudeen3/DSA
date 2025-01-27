package NasruPracticeforDSA.javaPractice.oOps.Counstructor;

public class Student {
    /*Write a Java program to create a class called Student with instance variables studentId,
    studentName, and grade. Implement a default constructor and a parameterized constructor
    that takes all three instance variables. Use constructor chaining to initialize the
    variables.Print the values of the variables.*/
    private int studentId;
    private String studentName;
    private String grade;

    public Student() {
        this(0,"Unknown","None");
    }

    public Student(int studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student1=new Student();
        System.out.println("Student1 Id:"+ student1.studentId);
        System.out.println("Student1 Name:"+ student1.studentName);
        System.out.println("Student1 Grade"+ student1.grade);

        Student student2=new Student(101,"Mohamed Nasrudeen","A+");
        System.out.println("Student1 Id: "+ student2.studentId);
        System.out.println("Student1 Name: "+ student2.studentName);
        System.out.println("Student1 Grade: "+ student2.grade);

    }
}
