package NasruPracticeforDSA.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String p="1221";
        int s=0;
        int e=p.length()-1;

        System.out.println(pal(p));
        System.out.println(palin(p,s,e));
    }

    private static boolean pal(String p) {
        int s=0;
        int e=p.length()-1;
        while (s<e){
            if(p.charAt(s)==p.charAt(e)){
                s++;
                e--;
            }
            else
                return false;

        }
          return true;
    }
    private static boolean palin(String p,int s,int e) {
      if(s>e){
          return true;
      }
        else{
            if(p.charAt(s)!=p.charAt(e)){
                return false;
            }
           return palin(p,s+1,e-1);
      }

    }
}
