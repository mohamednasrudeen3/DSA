package NasruPracticeforDSA.TOP150;

import java.util.Stack;

public class Example9 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(String c:tokens){
            if(isOperator(c)){
                int a= stack.pop();
                int b= stack.pop();
                int result=Operand(a,b,c);
                stack.push(result);

            }else{
                stack.push(Integer.parseInt(c));
            }

        }
        return stack.pop();
    }
    public static boolean isOperator(String s){
        if(s.equals("+")||s.equals("-")|| s.equals("/")||s.equals("*")){
            return true;
        }
        return false;
    }

    public static int Operand(int a, int b, String c){
        int result=0;
        switch(c){
            case "+":
                result+=a+b;
                break;
            case "-":
                result+=a-b;
                break;
            case "/":
                result+=a/b;
                break;
            case "*":
                result+=a*b;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));

    }
}
