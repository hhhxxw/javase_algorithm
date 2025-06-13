package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-13 20:23
 */
public class leecode_46_全排列 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        dfs(nums, res, new ArrayList<>(), flag);
        return res;
    }
    public static void dfs(int[] nums, List<List<Integer>> res, List<Integer> current, boolean[] flag){
        if(current.size() == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.length; i ++){
            if(!flag[i]){
                current.add(nums[i]);
                flag[i] = true;
                dfs(nums, res, current, flag);
                flag[i] = false;
                current.remove(current.size() - 1);
            }
        }
    }
}
