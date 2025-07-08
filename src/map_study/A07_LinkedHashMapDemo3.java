package map_study;

import java.util.LinkedHashMap;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-03 14:55
 */
public class A07_LinkedHashMapDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("c", 798);
        linkedHashMap.put("b", 456);
        linkedHashMap.put("a", 123);
        linkedHashMap.put("a", 111);

        System.out.println(linkedHashMap);
    }
}
