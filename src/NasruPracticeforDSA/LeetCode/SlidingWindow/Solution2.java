package NasruPracticeforDSA.LeetCode.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public static int maxSubLength(String s){
        if(s.length()==1){
            return 1;
        }
        int maxresult=0;
        int result=0;
        int start=0;
        int end=0;
        Set<Character> sCount = new HashSet<>();
        for(int i=0;i<s.length()&& end<s.length();i++){
            if (sCount.contains(s.charAt(end))){
                sCount.remove(s.charAt(end));


                end++;
                start++;
            continue;
            }

if(end<s.length()) {
    if (!sCount.contains(s.charAt(end))) {
        sCount.add(s.charAt(end));
        result++;
        end++;
    }
}
maxresult=Math.max(result,maxresult);


        }
        return maxresult;
    }
    public static void main(String[] args) {
        String s="pwwkew";
        System.out.println(Solution2.maxSubLength(s));
    }
}
