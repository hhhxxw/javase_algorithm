package Hot100.array;

import java.util.Arrays;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-10 08:29
 */
public class leecode_238_除自身以外数组的乘积 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        // 计算前缀乘积
        // res[i] = nums[0] * nums[1] * ... * nums[i - 1] = res[i - 1] * nums[ i - 1]
        for(int i = 1; i < n; i ++){
            res[i] = nums[i - 1] * res[i - 1];
        }
        // 计算后缀机
        int R = 1;
        for(int i = n - 1; i >= 0; i--){
            res[i] = nums[i] * R;
            R = R * nums[i];
        }
        return res;
    }


}
