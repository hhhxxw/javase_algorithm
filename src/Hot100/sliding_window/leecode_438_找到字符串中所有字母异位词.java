package Hot100.sliding_window;

import java.util.ArrayList;
import java.util.List;

/**
 * 滑动窗口 + 哈希
 * @author hxw
 * @date 2025-05-31 20:48
 */
public class leecode_438_找到字符串中所有字母异位词 {
    //给定两个字符串 s 和 p，找到 s 中所有是 p 的字母异位词（Anagram）的子串，返回这些子串的起始索引。不考虑答案的顺序。
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p).toString());
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        // 先判断极端条件
        if (s.length() < p.length()) {
            return result;
        }

        //统计p出现的频率

        int[] pCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - '0']++;
        }

        //滑动窗口遍历s，统计窗口字母的频率和p字符频率数组进行比较
        int[] window = new int[26];
        int left = 0, right = 0, matched = 0;

        while (right < s.length()) {
            char rChar = s.charAt(right);
            if (pCount[rChar - 'a'] > 0) {
                window[rChar - 'a']++;
                if (window[rChar - 'a'] <= pCount[rChar - 'a']) {
                    matched++;
                }
            }
            right++;

            while (matched == p.length()) {
                if (right - left == p.length()) {
                    result.add(left);
                }
                char lChar = s.charAt(left);
                if (pCount[lChar - 'a'] > 0) {
                    window[lChar - 'a']--;
                    if (window[lChar - 'a'] < pCount[lChar - 'a']) {
                        matched--;
                    }
                }
                left++;

            }


        }
        return result;
    }
}
