package NasruPracticeforDSA.TOP150;
//VeryImportant
public class Example7 {
    public static int characterReplacement(String s, int k){
        int[] occurance= new int[26];
        int left=0;
        int right=0;
        int maxOccurance=0;
        int ans=0;
        for(;right<s.length();right++){
        maxOccurance = Math.max(maxOccurance,++occurance[s.charAt(right)-'A']);
        if(right-left+1-maxOccurance>k){
            occurance[s.charAt(left)-'A']--;
            left++;
        }
        ans=Math.max(ans,right-left+1);
        }
return ans;
    }
    public static void main(String[] args) {
        String s="AABABBA";
        int k=1;
        System.out.println(characterReplacement(s,k));
    }
}
