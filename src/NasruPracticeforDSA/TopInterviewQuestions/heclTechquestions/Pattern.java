package NasruPracticeforDSA.TopInterviewQuestions.heclTechquestions;

public class Pattern {

    public static void main(String[] args) {
        int n=26;
        Pattern1(n);
    }
    static void Pattern1(int n){
        for(int row=1;row<=n;row++){
            char start=65;
            for(int col=1;col<=row;col++){
                System.out.print(start++);
            }
            System.out.println();
        }
    }
}
