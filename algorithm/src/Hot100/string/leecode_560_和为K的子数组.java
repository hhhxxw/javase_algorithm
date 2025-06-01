package Hot100.string;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-01 21:30
 */
public class leecode_560_和为K的子数组 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
//    public static int subarraySum(int[]nums, int k){
//        Arrays.sort(nums);
//        int res = 0;
//        if(nums.length == 1){
//            if(nums[0] == k){
//                return 1;
//            }else{
//                return 0;
//            }
//        }
//        int i = 0, j = 0;
//        while(j < nums.length && i <= j){
//            if(nums[i] + nums[j] < k){
//                if(nums[i] > nums[j])
//            }else if(nums[i] + nums[j] > k){
//                j --;
//                i ++;
//            }else{
//                res ++;
//                i ++;
//            }
//        }
//
//        return res;
//    }
    public static int subarraySum(int[] nums, int k){
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);
        int count = 0;
        int prefixSum = 0;

        for(int num : nums){
            prefixSum += num;
            // 检查prefixSum - k 是否在哈希表中
            if(prefixSumCount.containsKey(prefixSum - k)){
                count += prefixSumCount.get(prefixSum - k); // 加上个数
            }
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }



}
