package NasruPracticeforDSA.recursion;

public class power {
    static int  pow(int x, int y){
        int n=x;
        if (y == 1) {
            return x;
        }else{
            return x*pow(x,y-1);
        }

    }
    public static void main(String[] args) {
        int x=3;
        int y=3;
        System.out.println(pow(x,y));
    }
}
