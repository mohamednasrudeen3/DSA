package NasruPracticeforDSA.generics;

public class Example3 {
    public static <T> void printArray(T[] array){
        for(T element:array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr ={1,2,3};
        String[] strArr= {"A","B","C"};
        printArray(intArr);
        printArray(strArr);
    }
}
