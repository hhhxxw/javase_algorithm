package map_study;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-02 08:23
 */
public class A01_MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("韦小宝", "沐剑屏");
        System.out.println(map.size());
        System.out.println(map);
    }
}
