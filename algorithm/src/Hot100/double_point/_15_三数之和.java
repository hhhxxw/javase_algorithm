package Hot100.double_point;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 我想到了排序+指针，但是具体实现还是没有完成
 * @Data 2025-5-30
 *思路：
 * 先进行排序
 * 固定一个元素，三个变量转换为两个变量
 * O(n3)->O(n2)
 */

public class _15_三数之和 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1,-4};
        System.out.println(treeSum(nums).toString());
    }
    public static List<List<Integer>> treeSum(int[] nums){
       List<List<Integer>> res = new ArrayList<>();
       Arrays.sort(nums);
       int len = nums.length;
       for(int i = 0; i < nums.length - 2; i ++){
           int target = 0 - nums[i];
           if(i > 0 && nums[i] == nums[i - 1]){
               continue;
           }
           // 排过序之后，如果当前元素大于零 后续不可能为零
           if(nums[i] > 0){
               break;
           }
           int j = i + 1;
           int k = len - 1;
           while(j < k){
               if(nums[j] + nums[k] < target){
                   j ++;
               }else if (nums[j] + nums[k] > target){
                   k --;
               }else{
                   res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                   while(j < k && nums[j] == nums[j + 1]){
                       j ++;
                   }
                   while(j < k && nums[k] == nums[k - 1]){
                       k --;
                   }
               }
           }
       }
       return res;
    }


}
