package NasruPracticeforDSA.TopInterviewQuestions.SlidingWindow;

import javax.xml.stream.events.Characters;
import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
public static int lengthOfLongestSubstring(String s){
   int res=Integer.MIN_VALUE;
   int start=0;
   int n=s.length();
   Set<Character> chars= new HashSet<>();
   for(int end=0;end<n;end++){
       char current=s.charAt(end);
       while(chars.contains(current)){
           chars.remove(s.charAt(start));
           start++;
       }
       chars.add(current);
       res=Math.max(res,end-start+1);

   }
     return res==Integer.MIN_VALUE?0:res;
}
    public static void main(String[] args) {
        String s="abcabcab";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
