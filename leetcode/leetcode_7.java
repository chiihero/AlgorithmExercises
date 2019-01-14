
/*
7. 整数反转
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321

 示例 2:

输入: -123
输出: -321

示例 3:

输入: 120
输出: 21

注意:

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

*/
public class leetcode_7 {
    public static int reverse(int x) {
        int sum = 0;
        while(x!=0){
            if (sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE / 10 && x%10 > 7)) return 0;
            if (sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE / 10 && x%10 < -8)) return 0;
            sum = sum *10 + x%10;
            x/=10;
        }
        System.out.println(sum+"\n");
        return sum;
    }

    public static void main(String[] args) {
        reverse(123);
        reverse(-123);
        reverse(1534236469);

    }

}
