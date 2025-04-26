package NasruPracticeforDSA.javaPractice.PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class Example2Imp {
    public static int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // To handle cases where prefixSum itself is divisible by k
        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            int remainder = prefixSum % k;

            // Handling negative remainders to keep them within range [0, k-1]
            if (remainder < 0) {
                remainder += k;
            }

            count += map.getOrDefault(remainder, 0);
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println(subarraysDivByK(nums, k)); // Output: 7
    }
}
