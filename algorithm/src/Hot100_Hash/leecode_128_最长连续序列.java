package Hot100_Hash;

import java.util.ArrayList;
import java.util.Arrays;

public class leecode_128_最长连续序列 {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(nums);
//      System.out.println(Arrays.toString(nums));
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums){
        int max = 0;
        //先排序
        Arrays.sort(nums);
        if(nums.length == 1){
            return 1;
        }
        for(int i = 0; i < nums.length; i ++){
            int count = 1;
            for(int j = i + 1; j < nums.length; j ++){
                if(nums[j] == nums[j - 1] + 1){
                    count ++;
                }else {
                    break;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}
