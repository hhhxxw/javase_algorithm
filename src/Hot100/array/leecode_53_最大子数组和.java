package Hot100.array;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-08 20:59
 */
public class leecode_53_最大子数组和 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for(int i = 1; i < nums.length; i ++){
            maxCurrent = Math.max(nums[i], nums[i] + maxCurrent);
            if(maxCurrent > maxGlobal){
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }

}
