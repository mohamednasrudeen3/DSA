package NasruPracticeforDSA.TOP150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {
    public static String encode(List<String> strs){


        if(strs.size()==0){
            return Character.toString((char)258);
        }
        String separate = Character.toString((char)257);
        StringBuilder sb= new StringBuilder();
        for(String s:strs){
            sb.append(s);
            sb.append(separate);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();

    }

    public static List<String> decode(String s){

        if(s.equals(Character.toString((char)258))){
            return new ArrayList();
        }

        String separate = Character.toString((char)257);

        return Arrays.asList(s.split(separate, -1));
//        -1 is used for for string retrival in the last


    }


    public static void main(String[] args) {

        List<String> input = Arrays.asList("abc","ab","xy","");
        System.out.println(input);
        System.out.println(decode(encode(input)));


    }
}
