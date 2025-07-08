package map_study;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-03 11:10
 */
public class A04_MapDemo04 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("韦小宝", "沐剑屏");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });

        System.out.println("-------------------------");
        map.forEach((String key, String value) -> {
                System.out.println(key + "=" + value);
            }
        );

        System.out.println("-------------------------");
        map.forEach((String key, String value) -> System.out.println(key + "=" + value));

    }
}
