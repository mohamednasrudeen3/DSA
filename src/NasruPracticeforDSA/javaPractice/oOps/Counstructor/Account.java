package NasruPracticeforDSA.javaPractice.oOps.Counstructor;

public class Account {
    /*
    Write a Java program to create a class called Account with instance variables accountNumber and balance.
     Implement a parameterized constructor that initializes these variables with validation:

//    accountNumber should be non-null and non-empty.
    balance should be non-negative.
    Print an error message if the validation fails.
     */
    private String accountNumber;
    private double balance;
    public Account(String accountNumber,double balance){



        //    accountNumber should be non-null and non-empty.
        if(accountNumber==null || accountNumber.isEmpty()){
            System.err.println("Your account Number cannot be empty or Null  ");
            return;
        }
        if(balance<0){
            System.err.println("Error:balance cannot be Negative");
            return;
        }




        this.accountNumber=accountNumber;
        this.balance=balance;



    }

    public static void main(String[] args) {
        Account acc1= new Account("ABC123",10000000.29);
        System.out.println("Account Number: "+acc1.accountNumber);
        System.out.println("Balance: "+ acc1.balance);
        Account acc2= new Account("jh",-10000000.29);

    }

}
