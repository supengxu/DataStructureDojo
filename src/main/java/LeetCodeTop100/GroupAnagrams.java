package LeetCodeTop100;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
    /**
     * 题目：字母异位词分组
     * 描述：请你将所有输入的字母异位词组合在一起。可以按任意顺序返回结果列表。
     * 字母异位词是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
     * 
     * 示例 1：
     * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
     * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * 
     * 示例 2：
     * 输入: strs = [""]
     * 输出: [[""]]
     * 
     * 示例 3：
     * 输入: strs = ["a"]
     * 输出: [["a"]]
     * 
     * 提示：
     * 1 <= strs.length <= 104
     * 0 <= strs[i].length <= 100
     * strs[i] 仅包含小写字母
     * 
     * 进阶：你可以设计一个时间复杂度为 O(n * k) 的算法解决此问题吗？（其中 n 是字符串数组的长度，k 是单个字符串的最大长度）
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // 待实现
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}