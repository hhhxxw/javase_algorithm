package daimasuixianglu.Hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-08 22:08
 */
public class leecode_349_两个数组的交集 {

    // 找两个数组的交集，返回不重复元素的数组
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // 将 nums1 和 nums2 的元素分别加入 set1 和 set2
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        // 使用 Set 存储交集结果，确保结果唯一
        Set<Integer> resultSet = new HashSet<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                resultSet.add(num);
            }
        }

        // 将 resultSet 转换为数组
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }
    // 主函数，用于测试
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {2, 3, 3, 4};

        int[] result = intersection(nums1, nums2);

        System.out.println("两个数组的交集为：" + Arrays.toString(result));
    }
}

