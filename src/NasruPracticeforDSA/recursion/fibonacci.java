package NasruPracticeforDSA.recursion;

public class fibonacci {
//    0 1 1 2 3 5 8 13 21.........
    static int fibonacci(int n){

        if(n<=1){
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
