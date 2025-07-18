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
        pattern3(5);

    }



    static void pattern1(int n) {
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

//    *
//    **
//    ***
//    ****
//    ***
//    **
//    *
    static void pattern2(int n){
        for(int row=1;row<=2*n-1;row++){
            int totalCols=row<=n?row:2*n-row;
        for(int col=1;col<=totalCols;col++){
            System.out.print("*");
        }
            System.out.println();

    }
    }


    static void pattern3(int n){
        for(int row=1;row<=2*n-1;row++){
            int totalCols= row>n?2*n-row:row;
            int spaces=n-totalCols;
            for (int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalCols;col++){

                System.out.print("* ");

            }
            System.out.println();
        }
    }

}
