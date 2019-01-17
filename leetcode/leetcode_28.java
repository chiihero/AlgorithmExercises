/*
28. 实现strStr()
实现 strStr() 函数。
给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

示例 1:
输入: haystack = "hello", needle = "ll"
输出: 2
示例 2:
输入: haystack = "aaaaa", needle = "bba"
输出: -1
说明:
当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。

 */
public class leetcode_28 {
    public static int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if(nlen==0)return 0;
        if(hlen<nlen)return -1;
        char[] haystackch=haystack.toCharArray();
        char[] needlech=needle.toCharArray();
        for (int i=0,len=hlen-nlen;i<=len;i++) {
            if (haystackch[i]==needlech[0]) {
                for(int j=0;j<nlen;j++){
                    if(haystackch[i+j]!=needlech[j]){
                        break;
                    }
                    if(j==nlen-1)
                    return i;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(strStr("a",""));
        System.out.println(strStr("a","a"));
        System.out.println(strStr("mississippi","issipi"));
        System.out.println(strStr("mississippi", "issip"));
    }
}
