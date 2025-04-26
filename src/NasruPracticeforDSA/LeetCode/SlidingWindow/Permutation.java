//package NasruPracticeforDSA.LeetCode.SlidingWindow;
//
//import NasruPracticeforDSA.javaPractice.Example1;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Permutation {
//    public static boolean checkInclusion(String s1,String s2){
//        if(s1.length()>s2.length()){
//            return false;
//        }
//
//        Map<Character,Integer> need = new HashMap<>();
//        Map<Character,Integer> have = new HashMap<>();
//        int n=s1.length();
//
//        for(int i=0;i<n;i++){
//            need.put(s1.charAt(i),need.getOrDefault(s1.charAt(i),0)+1);
//        }
//
//        int start=0;
//        int end=0;
//
//        while(end<s2.length()){
//            char c=s2.charAt(end);
//
//            if(!need.containsKey(c)){
//                end=end+1;
//                start=end;
//                have.clear();
//                continue;
//            }
//
//            if(need.containsKey(c)){
//                have.put(c,have.getOrDefault(c,0)+1);
//
//            }
//            while(have.get(c)>need.get(c)){
//               char startChar= s2.charAt(start);
//               have.put(startChar,have.get(startChar)-1);
//               start++;
//            }
//
//            if(end-start+1 == s1.length()){
//                return true;
//            }
//            end+=1;
//        }
//
//        return false;
//    }
//
//
//
//    public static void main(String[] args) {
////        String s1 = "ab";
////        String s2 = "eidboaoo";
//        System.out.println(Permutation.checkInclusion(s1,s2));
//    }
//}
