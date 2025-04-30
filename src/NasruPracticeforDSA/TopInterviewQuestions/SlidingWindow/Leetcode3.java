package NasruPracticeforDSA.TopInterviewQuestions.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {

public static int lengthOfLongestSubstring(String s){
    int maxLength=0;
    int n =s.length();
 int start=0;
        for(int j=start;j<n;j++){
            if(isUnique(s,start ,j)){
                maxLength=Math.max(maxLength,j-start+1);

            }
            if(j==n-1){
                start++;
            }
        }

    return maxLength;
  }

  public static boolean isUnique(String s,int start, int end){
    Set<Character> chars= new HashSet<>();

    for(int k=start;k<=end;k++){
        if(chars.contains(s.charAt(k))){
            return false;
        }
        chars.add(s.charAt(k));
    }
    return true;
  }
    public static void main(String[] args) {
        String s="abcabcab";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
