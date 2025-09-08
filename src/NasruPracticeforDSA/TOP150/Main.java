package NasruPracticeforDSA.TOP150;

class Main {
    public static void main(String[] args) {
        String s = "j";
        int minLength=100000;
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1))){
                    count=j-i+1;
                    minLength=Math.min(minLength,count);
                }

            }
        }
        System.out.println(minLength);

    }
    public static boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        if(s.charAt(l)==s.charAt(r)){
            while(s.charAt(l)==s.charAt(r) && l<r){
                l++;
                r--;
            }
            return true;
        }
        return false;
    }
}