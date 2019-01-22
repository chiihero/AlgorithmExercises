
/*
70. 爬楼梯
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

示例 1：

输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶

示例 2：

输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶
*/
public class leetcode_70 {
    public static int climbStairs(int n) {
        int low = 0;
        int high = x;
        while(low<=high){
            long mid = (long)(low + high)/2;
            if(mid*mid < x)
                low = (int)mid + 1;
            else if(mid*mid > x)
                high = (int)mid - 1;
            else
                return (int)mid;
            System.out.printf("%d\t%d\t%d\n",mid,high,low);
        }
        return high;

    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }
}
