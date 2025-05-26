package Dynamic_Programming;

/**
 * 给定一个字符串，返回回文子串的数量
 *
 * 思路：布尔类型的dp[i][j]：表示区间范围[i,j] （注意是左闭右闭）的子串是否是回文子串，如果是dp[i][j]为true，否则为false。
 */
public class leecode_647_回文子串 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(countSubstrings(s));
    }
    public static int countSubstrings(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for(int i = 0; i < len; i ++){
            for(int j = 0; j < len; j ++){
                dp[i][j] = false;
            }
        }
        int res = 0;
        for(int i = len - 1; i >= 0; i --){
            for(int j = i; j < len; j ++){
                if(s.charAt(i) == s.charAt(j)){
                    if(j - i <= 1){
                        res ++;
                        dp[i][j] = true;
                    }else if(dp[i + 1][j - 1]){
                        res ++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return res;
    }



}
