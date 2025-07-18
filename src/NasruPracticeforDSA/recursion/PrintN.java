package NasruPracticeforDSA.recursion;

public class PrintN {
    static void pN(int n){
        if(n>=1){
            System.out.print(n);
            System.out.println();
            return;
        }

        pN(n-1);
    }
    static void rpN(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        rpN(n-1);
        System.out.print(n+" ");


    }

    public static void main(String[] args) {
        int n=5;
        rpN(n);
    }
}
