package NasruPracticeforDSA.javaPractice.nestedClasses;

public class University {
    /*
    Write a Java program to create an outer class called University with a static nested class Department.
     The Department class should have a method "displayInfo()" that prints the department name and the number
      of faculty members. Instantiate the Department class from the main method and call the "displayInfo()"
      method.
*/
    static class Department{
        private String departmentName;
        private int facultymemNumber;

        public Department(String departmentName,int facultymemNumber){
          this.departmentName=departmentName;
          this.facultymemNumber=facultymemNumber;
        }

       public void displayInfo(){
           System.out.println("department Name: "+departmentName);
           System.out.println("Faculty Member Number: "+ facultymemNumber);
        }


    }

    public static void main(String[] args) {
        Department computerSci= new Department("CSE",387);
        computerSci.displayInfo();
    }

    }
