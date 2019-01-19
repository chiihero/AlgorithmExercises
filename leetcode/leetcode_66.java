import com.sun.org.apache.regexp.internal.recompile;

/*
66. 加一
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

示例 1:

输入: [1,2,3]
输出: [1,2,4]
解释: 输入数组表示数字 123。

示例 2:

输入: [4,3,2,1]
输出: [4,3,2,2]
解释: 输入数组表示数字 4321。
 */
public class leetcode_66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i > 0; i--) {
            digits[i] += 1;
            if (digits[i] > 10){
                digits[i - 1] += 1;
                digits[i]=0;
            }
            else
                break;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        System.out.println(plusOne(nums));
        int[] nums2 = { 1, 9, 9 };
        System.out.println(plusOne(nums2));

    }
}
