package NasruPracticeforDSA.TOP150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Permutation567 {
    public static boolean checkInclusion(String s1,String s2){
        if(s1.length()>s2.length()){
            return false;
        }
        int[] s1h= new int[26];
        int[] s2h= new int[26];
        for(int i=0;i<s1.length();i++){
            s1h[s1.charAt(i)-'a']++;
            s2h[s2.charAt(i)-'a']++;

        }
        for(int i=0;i<s2.length()-s1.length();i++){
            if(Arrays.equals(s1h,s2h)){
                return true;
            }
            s2h[s2.charAt(i+s1.length())-'a']++;
            s2h[s2.charAt(i)-'a']--;

        }
        return Arrays.equals(s1h,s2h);

    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
}
