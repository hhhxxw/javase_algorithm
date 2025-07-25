package Hot100.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leecode_1_两数之和 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i ++){
            if(map.containsKey(target - nums[i]) && i != map.get(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }
}
/*
public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        //边界条件
        if(nums==null || nums.length == 0){

            return arr;
        }
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            int temp = target - nums[i];
            if(hashmap.containsKey(temp)){
                arr[0] = hashmap.get(temp);
                arr[1] = i;
                return arr;
            }
            hashmap.put(nums[i], i);
        }
        return null;
    }
 */