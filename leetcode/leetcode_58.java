/*
58. 最后一个单词的长度
给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。

示例:

输入: "Hello World"
输出: 5


 */
public class leetcode_58 {
    public static int lengthOfLastWord(String s) {
        int len =s.length();
        if(len==0||s==" ") return 0;
        int sum = 0;
        char[] ch =s.toCharArray();
        for (int i=0;i<len;i++) {
            if(i>1&&ch[i]!=' '&&ch[i-1]==' ')
                sum = 1;
            else if(ch[i]!=' ')
                sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("a"));
        System.out.println(lengthOfLastWord(" "));
        System.out.println(lengthOfLastWord("  "));
        System.out.println(lengthOfLastWord("day "));
        System.out.println(lengthOfLastWord("da day "));
        System.out.println(lengthOfLastWord("b   a    "));



    }
}
