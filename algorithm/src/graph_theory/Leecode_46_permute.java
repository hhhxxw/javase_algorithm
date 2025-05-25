package graph_theory;

import java.util.ArrayList;
import java.util.List;

public class Leecode_46_permute {


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] state = new boolean[nums.length];
        dfs(result, state, nums, new ArrayList<>());
        return result;
    }

    public static void dfs(List<List<Integer>> result, boolean[] state, int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!state[i]) {
                state[i] = true;
                list.add(nums[i]);
                dfs(result, state, nums, list);
                state[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }
}
