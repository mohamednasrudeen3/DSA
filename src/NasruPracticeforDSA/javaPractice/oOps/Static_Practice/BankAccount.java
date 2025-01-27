package NasruPracticeforDSA.javaPractice.oOps.Static_Practice;

public class BankAccount {

/*
    Write a Java program to create a class called "BankAccount" with instance variables 'accountNumber'
     and balance, and static variables 'bankName' and 'interestRate'. Provide static methods to get and
      set the static variables. Create several 'BankAccount' objects and print their details along with
      the static variables.
 */

    private long accountNumber;
    private double balance;

    private static String bankName;
    private static double interestRate;

    private BankAccount(long accountNumber,int balance){
        this.balance=balance;
        this.accountNumber=accountNumber;
    }

    public static String getBankName(){
        return bankName;
    }
    public static void setBankName(String name){
        bankName= name;
    }


    public static double getInterestRate(){
        return interestRate;
    }
    public static void setInterestRate(double rate){
        interestRate=rate;
    }

    public void  printDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance :"+ balance);
        System.out.println("Bank Name :"+ bankName);
        System.out.println("Interest Rate :" + interestRate);
    }


    public static void main(String[] args) {
        BankAccount b1= new BankAccount(135501000015896L,15000);
        BankAccount.setBankName("Indian Overseas Bank");
        BankAccount.setInterestRate(3.6);
        b1.printDetails();
    }
}
