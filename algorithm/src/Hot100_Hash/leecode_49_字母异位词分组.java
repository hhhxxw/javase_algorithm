package Hot100_Hash;

import java.util.*;

public class leecode_49_字母异位词分组 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // 将字符串转换为字符数组并排序
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // 检查哈希表中是否存在该排序后的字符串作为键
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            // 将原始字符串添加到对应的列表中
            map.get(sortedStr).add(str);
        }

        // 将哈希表中的所有值转换为列表并返回
        return new ArrayList<>(map.values());
    }


}
