/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 *
 * https://leetcode.cn/problems/longest-palindromic-substring/description/
 *
 * algorithms
 * Medium (39.60%)
 * Likes:    7716
 * Dislikes: 0
 * Total Accepted:    2M
 * Total Submissions: 5.1M
 * Testcase Example:  '"babad"'
 *
 * 给你一个字符串 s，找到 s 中最长的 回文 子串。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 *
 *
 * 示例 2：
 *
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 *
 *
 *
 * 提示：
 *
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 *
 *
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2){
            return s;
        }
        boolean dp[][] = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        int maxLen = 1;
        int begin = 0;
        var strChar = s.toCharArray();
        for (int j = 1; j < strChar.length; j++) {
            for (int i = 0; i < strChar.length; i++) {
                if (dp[i][j]){
                    continue;
                }
                if (strChar[i] != strChar[j] ){
                    dp[i][j] = false;
                }else{
                    if (j - i < 3){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if (dp[i][j]) {
                    int subMaxLen =  j - i + 1;
                    if ( subMaxLen > maxLen){
                        maxLen = subMaxLen;
                        begin = i;
                    }
                }
            }


        }
        return s.substring(begin, begin + maxLen);
    }
}
// @lc code=end

