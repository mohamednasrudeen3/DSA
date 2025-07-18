package NasruPracticeforDSA.TOP150;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

//Top K elements
public class Example2 {

public static int[] topKFrequent(int[] nums,int k){
    if(k==nums.length){
        return nums;
    }
    HashMap<Integer,Integer> count = new HashMap<>();
    for(int n:nums){
        count.put(n,count.getOrDefault(n,0)+1);
    }

    Queue<Integer> heap=new PriorityQueue<>((a,b)->count.get(a)-count.get(b));
    for(int n:count.keySet()){
        heap.add(n);
        if(heap.size()>k){
            heap.poll();
        }
    }
    int[] ans =new int[k];
    for(int i=0;i<k;i++){
ans[i]= heap.poll();
    }
    return ans;
}

    public static void main(String[] args) {
        int[] arr ={1,3,4,3,4,2,3,4,2,5,4,5,5};
        int k=3;
        int[] result = Example2.topKFrequent(arr, k);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }



}
