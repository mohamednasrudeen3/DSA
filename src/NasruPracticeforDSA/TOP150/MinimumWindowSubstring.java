package NasruPracticeforDSA.TOP150;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0||s.length()<t.length()){
                return "";
        }
        Map<Character,Integer> mapT =new HashMap<>();
        for(char c:t.toCharArray()){
            mapT.put(c,mapT.getOrDefault(c,0)+1);
        }
        int required=mapT.size();
        int left=0,right=0;
        int create=0;
        int[] ans={-1,0,0};
        Map<Character,Integer> subStringMap= new HashMap<>();
        while (right<s.length()){
            char c=s.charAt(right);
            int count= subStringMap.getOrDefault(c,0);
            subStringMap.put(c,count+1);
            if(mapT.containsKey(c) && subStringMap.get(c).intValue()==mapT.get(c).intValue()){
                create++;
            }
            while(left <=right && required==create){
                c=s.charAt(left);
                if(ans[0]==-1||ans[0]>=right-left+1){
                    ans[0]=right-left+1;
                    ans[1]=left;
                    ans[2] =right;
                }
                subStringMap.put(c,subStringMap.get(c)-1);

                if(mapT.containsKey(c) && subStringMap.get(c).intValue()<mapT.get(c).intValue()){
                    create--;
                }
                left++;
            }
            right++;

        }
        if(ans[0]==-1){
            return "";
        }
return s.substring(ans[1],ans[2]+1);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));

    }
}
