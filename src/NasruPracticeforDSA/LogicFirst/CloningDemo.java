package NasruPracticeforDSA.LogicFirst;

class Department implements Cloneable{
    int deptID;
    String name;
    Department(int i, String n){
        this.deptID=i;
        this.name=n;
    }
    void display(){
        System.out.println("Department id: "+this.deptID);
        System.out.println("Department Name "+name);
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Student extends Object implements Cloneable {
    int id;
    String name;
    Department dept;
    Student(int i,String n, Department d){
        this.id=i;
        this.name=n;
        this.dept=d;
    }
    void display(){
        System.out.println("Student Id: "+id);
        System.out.println("Student name: "+ name);
        dept.display();
    }

    protected Object clone() throws CloneNotSupportedException{
       Student s= (Student)super.clone();
        s.dept=(Department)dept.clone();
        return s;
    }

}
public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException{
        Department dept= new Department(1,"Physics");
        Student s1= new Student(1,"nasru", dept);
//        implement Shallow copy
        Student s2= (Student) s1.clone();
        dept.name= "Maths";
        s1.display();

        s2.display();

    }
}
