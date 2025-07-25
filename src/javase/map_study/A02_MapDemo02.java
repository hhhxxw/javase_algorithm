package javase.map_study;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-02 08:58
 */
public class A02_MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("韦小宝", "沐剑屏");

        //
        Set<String> keys = map.keySet();

        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
