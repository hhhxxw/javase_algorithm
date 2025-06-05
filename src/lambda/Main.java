package lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-05 21:29
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr = {{2, 3}, {1, 5, 6, 7, 8},{4, 9}};

        /**
         调用一个方法的时候, 如果方法的形参是一个接口,就要传递这个接口的实现类对象
         如果实现类对象要用到一次, 就可以用匿名内部类的形式进行书写
         **/
        Arrays.sort(arr, Comparator.comparingInt(b->b[0]));
        // 等价于
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });


        /** 正儿八经的排序
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; // 从小到达排序
            }
        });
        System.out.println(Arrays.toString(arr));

         **/
        // 使用lambda 表达式优化匿名内部类（看一下代码编写规则就明白了）

//        Arrays.sort(arr, (Integer o1, Integer o2 ) -> {
//            return o1 - o2;
//        });

        System.out.println(Arrays.toString(arr));
        // 输出[1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
