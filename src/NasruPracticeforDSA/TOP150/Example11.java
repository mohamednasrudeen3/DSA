package NasruPracticeforDSA.TOP150;

import java.util.Stack;

public class Example11 {
    public static int[] DailyTemp(int[] temperatures){
       int n= temperatures.length;
       Stack<Integer> stack= new Stack<>();
       int[] result= new int[n];
       for(int i=0;i<n;i++){
           while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
               int index=stack.pop();
               result[index] = i-index;
           }
           stack.push(i);
       }
       return result;
    }
    public static void main(String[] args) {
        int[] temperatures ={73,74,75,71,69,72,76,73};
        for(int x:DailyTemp(temperatures)){
            System.out.print(x+" ");
        }
    }
}
