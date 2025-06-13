package Hot100.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-03 19:58
 */
public class leecode_76_最小覆盖子串 {
    public static void main(String[] args) {

    }
    public static String minWindow(String s, String t){
        int sLen = s.length();
        int tLen = t.length();

        //统计t中字符的频率
        Map<Character, Integer> targetFreq = new HashMap<>();
        for(char c : t.toCharArray()){
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }
        // 需要匹配的字符种类数量
        int required = targetFreq.size();
        // 窗口的左右边界， 初始都指向s的开头
        int left = 0, right = 0;
        int formed = 0;

        Map<Character, Integer> windowFreq = new HashMap<>();


        return null;
    }
}
