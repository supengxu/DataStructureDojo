/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 *
 * https://leetcode.cn/problems/zigzag-conversion/description/
 *
 * algorithms
 * Medium (53.84%)
 * Likes:    2502
 * Dislikes: 0
 * Total Accepted:    791.6K
 * Total Submissions: 1.5M
 * Testcase Example:  '"PAYPALISHIRING"\n3'
 *
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 *
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 *
 * string convert(string s, int numRows);
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 *
 * 示例 2：
 *
 *
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * 解释：
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 *
 * 示例 3：
 *
 *
 * 输入：s = "A", numRows = 1
 * 输出："A"
 *
 *
 *
 *
 * 提示：
 *
 *
 * 1
 * s 由英文字母（小写和大写）、',' 和 '.' 组成
 * 1
 *
 *
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        var col = s.length();
        var str = new String[numRows][col];
        var zIndex = 1;
        var sIndex = 0;
        for (int i = 0; i < col; i++) {
            if (zIndex == 1 || zIndex == 0) {
                for (int j = 0; j < numRows; j++) {
                    if (str[j][i] == null && sIndex < s.length()) {
                        str[j][i] = String.valueOf(s.charAt(sIndex));
                        zIndex = j;
                        sIndex++;
                    }

                }
            } else if (zIndex > 1 && sIndex < s.length()) {
                str[zIndex - 1][i] = String.valueOf(s.charAt(sIndex));
                zIndex--;
                sIndex++;
            }
        }


// 拼接 str 数组中的字符串并返回
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (str[i][j] != null) {
                    result.append(str[i][j]);
                }
            }
        }
        return result.toString();
    }
}
// @lc code=end

