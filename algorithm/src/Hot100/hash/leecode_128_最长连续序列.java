package Hot100.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class leecode_128_最长连续序列 {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(nums);
//      System.out.println(Arrays.toString(nums));
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        /**
         * @date 2025-07-10 14:42
         */

        int longestStreak = 0;

        for (int num : numSet) {
            // 要找最后一个元素
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
