package NasruPracticeforDSA.javaPractice.StringFunctions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] str = {"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return",
                "struct", "type", "var" };
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0; i < 16; i++) {
            if (str[i].equals(input)) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("this is not a keyword");
        } else {
            System.out.println("This is a Keyword");
        }
    }
}

