package Hot100.double_point;

import java.util.Arrays;

public class leecode_283_移动零 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
    // 编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
    public static void moveZeros(int[] nums){
        for(int i = 0; i < nums.length;){
            while(i < nums.length && nums[i] != 0){
                i ++;
            }
            int j = i;
            while(j < nums.length && nums[j] == 0){

                j ++;
            }
            if(j < nums.length){
                int test = nums[i];
                nums[i] = nums[j];
                nums[j] = test;
            }else{
                return;
            }
        }
//        int i = 0, j =0;
//        // 找到为零
//        while(i < nums.length && j < nums.length){
//            if(j == nums.length - 1){
//                break;
//            }
//            while(nums[i] != 0){
//                i ++;
//            }
//            // 找到不为零
//            while(nums[j] == 0){
//                j ++;
//            }
//            if(i != j){
//                int test = nums[i];
//                nums[i] = nums[j];
//                nums[j] = test;
//            }
        }


}
