package leecode_daily_game;

import java.util.HashMap;
import java.util.Map;

/**
 * 一开始思路，字符串串数组的全排列，最后检测是不是回文串，如果是记录下长度最大的回文串的长度
 * 算法知识点：dfs
 * 思路：
 * 统计单词频率： 使用哈希表统计每个单词出现的次数
 * 配对处理：对于每个单词，如果它的反转存在于哈希表中，且未被使用过，则尽可能多地配对这两个单词。
 * 处理自回文单词：统计自回文单词的数量，每对可以贡献 4 个字符，最多有一个单独贡献 2 个字符。
 * 计算总长度：将所有配对的单词和自回文单词的贡献相加，得到最长回文串的长度。
 */
public class leecode_2131_连接两字母单词得到的最长回文串 {
    public static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        String[] words = {"lc","cl","gg"};
        System.out.println(longestPalindrome(words));
    }
    public static int longestPalindrome(String[] words){
        //使用哈希表统计每个单词出现的次数
        Map<String, Integer> freq = new HashMap<>();
        // 统计每个单词 word 在数组 words 中出现的次数，并将结果存储在哈希表 freq 中。
        for(String word : words){
            //getOrDefault(word, 0)：如果 word 不存在于 freq 中，则返回默认值 0；否则返回 freq.get(word) 的值。
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        int length = 0;
        boolean hasCenter = false;
        // freq.keySet() 获取所有的key
        for(String word : freq.keySet()){
            // 将字符串 word 反转（倒序），并将结果存储到 reversed 变量中。
            String reversed = new StringBuilder(word).reverse().toString();
            if(word.equals(reversed)){
                int count = freq.get(word);
                length += (count / 2) * 4;
                if(count % 2 == 1){
                    hasCenter = true;
                }
            }else if(word.compareTo(reversed) < 0){
                int min = Math.min(freq.getOrDefault(word, 0), freq.getOrDefault(reversed, 0));
                length += min * 4;
            }
        }
        if(hasCenter){
            length += 2;
        }
        //计算总长度：将所有配对的单词和自回文单词的贡献相加，得到最长回文串的长度。
        return length;
    }
}
