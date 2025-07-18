package NasruPracticeforDSA.recursion;

public class sumOfFirstN {
   static int sumN(int n){
       if(n==1){
           return 1;
       }else{
           return n+ sumN(n-1);
       }
   }

    public static void main(String[] args) {
        int n=3;
        System.out.println(sumN(n));
    }
}
