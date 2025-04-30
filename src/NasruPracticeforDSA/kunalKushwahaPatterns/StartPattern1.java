package NasruPracticeforDSA.kunalKushwahaPatterns;
/*
*
* *
* * *
* * * *
STEP 1
* no of lines =no of rows
* no of times outer for loop will run
STEP 2
* identify for every row number
* how many colunms are there
* Types of element in column
*
STEP 3
*
* */
public class StartPattern1 {
    public static void main(String[] args) {
        pattern6(5);

    }
    static void pattern1(int n){
    for(int row=1;row<=n;row++){
//        for Every Row Run the column
        for(int col=1;col<=row;col++){
            System.out.print("* ");
        }
//        When one row is printed we need to add a new line
        System.out.println();
    }
    }

    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row=n;row>=1;row--){
            for(int col=row;col>=1;col--){
                System.out.print("* ");
            }
            System.out.println();
            }
    }

    static void pattern4(int n){
        for(int row=1;row<=2*n-1;row++){
            int totColNum= row>n?2*n-row:row;
            for(int col=1;col<=totColNum;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


static void pattern5(int n){
        for(int row=1;row<=2*n-1;row++){
            int totCol= row>n?2*n-row:row;
    for(int col=1;col<=totCol;col++){
        System.out.print("* ");
    }
            System.out.println();
    }
}






    static void pattern6(int n){
        for(int row=1;row<=2*n-1;row++){
            int totCol= row>n?2*n-row:row;
            int spaces = n-totCol;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
         for(int col = 1; col <=totCol; col++) {
                   System.out.print("* ");
               }
               System.out.println();


        }
    }

}
