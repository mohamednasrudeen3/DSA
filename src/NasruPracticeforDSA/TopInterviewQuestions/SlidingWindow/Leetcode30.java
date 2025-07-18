//package NasruPracticeforDSA.TopInterviewQuestions.SlidingWindow;
//
//import java.util.*;
//
//public class Leetcode30 {
//    public List<Integer> findSubstring(String s, String[] words) {
//        List<Integer> list= new ArrayList<>();
//        int numWords=words.length;
//        int wordLength=words[0].length();
//        int totalLength =wordLength*numWords;
//
//        for(int i=0;i<s.length()-totalLength;i++){
//            String curString =s.substring(i,i+totalLength);
//            if(isValid(curString,words,wordLength)){
//                list.add(i);
//            }
//        }
//return list;
//    }
//    public static boolean isValid(String curStr,String[] words,int wordLength ){
//        List<String> permutations = generatePermutations(Arrays.asList(words),"");
//
//
//        for(String permutation:permutations){
//          if(curStr.equals(permutation)){
//              return true;
//          }
//        }
//        return false;
//    }
//    public static List<String> generatePermutations(List<String> words,String Prefix){
//        if(words.size()==0){
//            return new ArrayList<>();
//        }
//        else{
//            for (int i = 0; i < words.size(); i++) {
//                String strg = words.get(i);
//                String remaining = String.valueOf(words.indexOf(i)+words.indexOf(i+1));
//                generatePermutations(remaining, Prefix +strg);
//            }
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//
//    }
//}
