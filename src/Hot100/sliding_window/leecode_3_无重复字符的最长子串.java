package Hot100.sliding_window;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-01 21:18
 */
public class leecode_3_无重复字符的最长子串 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s){
        Set<Character> str = new HashSet<>();
        int left = 0, right = 0;
        int maxLen = 0;
        while(right < s.length()){
            if(!str.contains(s.charAt(right))){
                str.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right ++;
            }else{
                str.remove(s.charAt(left));
                left ++;
            }
        }
        return maxLen;
    }
}
