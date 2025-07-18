package NasruPracticeforDSA.TOP150;

public class ContainerWithMostWater {
    public static int maxArea(int[] height){
        int largest =0;
      int left=0;
            int right=height.length-1;
            while(left<right) {
                int low = Math.min(height[left], height[right]);
                int current = low * (right - left);
                largest=Math.max(current,largest);
                right--;

            }



        return largest;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
