
/*
14. 最长公共前缀
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
示例 1:
输入: ["flower","flow","flight"]
输出: "fl"

示例 2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。

说明:
所有输入只包含小写字母 a-z 。
*/
public class leetcode_14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length ==1)
            return strs[0];
         for (int i=0;i<strs[0].length();i++){
             char[] str = strs[0].toCharArray();
         }
        System.out.println();


        return null;
    }

    public static void main(String[] args) {
        
        args[0] = "flower";
        args[1] = "flow";
        args[2] = "flight";

        longestCommonPrefix(args);
    }
}
