

/*
67. 二进制求和
给定两个二进制字符串，返回他们的和（用二进制表示）。

输入为非空字符串且只包含数字 1 和 0。

示例 1:

输入: a = "11", b = "1"
输出: "100"

示例 2:

输入: a = "1010", b = "1011"
输出: "10101"


 */
public class leetcode_67 {
    public static String addBinary(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        if (alen < blen)
            return addBinary(b, a);
        char[] ach = a.toCharArray();
        char[] bch = b.toCharArray();
        int i = alen;
        int j = blen;
        while (j > 0) {
            int temp = ach[--i] + bch[--j] - '0';
            if (temp == '1') {
                ach[i] = '1';
            }else if (i != 0) {
                temp -=2;
                ach[i] = (char)temp;
                ach[i - 1] += 1;
            } else if (i == 0) {
                ach[i] = (char)temp;
            }
        }
        if (ach[0] >= '2') {
            ach[0] -= 2;
            char[] res = new char[alen + 1];
            res[0] = '1';
            System.arraycopy(ach, 0, res, 1, alen);
            return String.valueOf(res);
        }
        return String.valueOf(ach);

    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1", "111"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("1111", "1111"));

    }
}
