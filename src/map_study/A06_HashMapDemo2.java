package map_study;

import java.util.*;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-03 14:37
 */
public class A06_HashMapDemo2 {
    public static void main(String[] args) {

        // 定义一个数组，存储四个景点
        String[] arr = {"A", "B", "C", "D"};

        // 随机生成80个测试数据
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 80; i ++){
            list.add(arr[random.nextInt(arr.length)]);
        }

        // 使用map来替代计数器变量
        Map<String, Integer> hashMap = new HashMap<>();
        for(String name : list){
            if(hashMap.containsKey(name)){
                hashMap.put(name, hashMap.get(name) + 1);
            }else{
                hashMap.put(name, 1);
            }
        }
        System.out.println(hashMap);

        // 求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            int count = entry.getValue();
            if(count > max){
                max = count;
            }
        }
        System.out.println(max);

        // 判断是否存在和最大值一样的，如果一样将其打印下来
        for(Map.Entry<String, Integer> entry : entries){
            int count = entry.getValue();
            if(count == max){
                System.out.println(entry.getKey());
            }
        }
    }
}
