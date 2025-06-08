package Hot100.array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-08 19:55
 */
public class leecode_189_轮转数组 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));

    }
    public static void rotate(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int len = nums.length;
        for(int i = 0; i < len ; i ++){
            deque.addLast(nums[i]);
        }
        for(int i = 1; i <= k; i ++){
            int num = deque.removeLast();
            deque.addFirst(num);
        }
        for(int i = 0; i < len; i ++){
            nums[i] = deque.removeFirst();
        }
    }
}
