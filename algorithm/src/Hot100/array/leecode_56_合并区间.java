package Hot100.array;

import java.util.*;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-04 13:56
 */
public class leecode_56_合并区间 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(merge(intervals).toString());
    }
    public static int[][] merge(int[][] intervals){
        if(intervals == null || intervals.length == 0){
            return new int[0][0];
        }
        // 按照第一个元素进行排序
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        for(int i = 1; i < intervals.length; i ++){
            int[] last = merged.get(merged.size() - 1);
            if(intervals[i][0] <= last[1]){
                last[1] = Math.max(last[1], intervals[i][1]);
            }else{
                merged.add(intervals[i]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
