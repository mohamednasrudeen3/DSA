package NasruPracticeforDSA.TOP150;

public class Example14 {
    public static int minEatingSpeed(int[] piles,int h){
        int left=1;
        int right=0;
        for(int pile:piles){
            right=Math.max(pile,right);
        }
        while(left<right){
            int mid= left+(right-left)/2;
            if(calculateHours(piles,mid,h)){
                right=mid;

            }else{
                left=mid+1;
            }

        }
        return left;
    }
     public static boolean calculateHours(int[] piles,int speed,int h){
        int hours=0;
        for(int pile:piles){
            hours +=Math.ceil((double)pile/speed);
        }
        return hours<=h;
     }
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h= 8;
        minEatingSpeed(piles,h);
    }
}
