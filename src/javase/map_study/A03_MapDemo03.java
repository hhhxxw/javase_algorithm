package javase.map_study;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-02 09:12
 */
public class A03_MapDemo03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("韦小宝", "沐剑屏");
//
//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " = " + value);
//        }

//        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

    }
}
