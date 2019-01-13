/* 

问题描述

如下图所示，3 x 3 的格子中填写了一些整数。
+--*--+--+
|10* 1|52|
+--****--+
|20|30* 1|
*******--+
| 1| 2| 3|
+--+--+--+

我们沿着图中的星号线剪开，得到两个部分，每个部分的数字和都是60。

本题的要求就是请你编程判定：对给定的m x n 的格子中的整数，是否可以分割为两个部分，使得这两个区域的数字和相等。

如果存在多种解答，请输出包含左上角格子的那个区域包含的格子的最小数目。

如果无法分割，则输出 0。
输入格式

程序先读入两个整数 m n 用空格分割 (m,n<10)。

表示表格的宽度和高度。

接下来是n行，每行m个正整数，用空格分开。每个整数不大于10000。
输出格式
输出一个整数，表示在所有解中，包含左上角的分割区可能包含的最小的格子数目。
样例输入1
3 3
10 1 52
20 30 1
1 2 3
样例输出1
3
样例输入2
4 3
1 1 1 1
1 30 80 2
1 1 1 100
样例输出2
10

 */
#include <stdio.h>
int nums[10] = {0};
int check_repeat(int n)
{
    int a;
    while (n)
    {
        a = n % 10;
        n /= 10;
        if (nums[a] > 1)
            return 1; //发现重复
        nums[a] += 1; //标记出现过
    }
    return 0; //正常退出循环 表示没有出现重复
}

int main()
{
    int i, j, flag, sum = 0, num;
    int a, b, c;
    scanf("%d", &num);

    for (i = 1; i < num; i++)
    {
        for (b = 1; b < 9876; b++)
        {
            a = (num - i) * b;
            if(a%b!=0)continue;
            memset(nums, 0, sizeof(nums));
            if (check_repeat(i) == 0 && check_repeat(b) == 0 && check_repeat(a) == 0 && nums[0] == 0)
            {

                flag = 1;
                for (j = 1; j < 10; j++)
                {
                    if (nums[j] != 1 || nums[0] > 0)
                    {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1)
                {
                    sum++;
                }
            }
        }
    }
    printf("%d", sum);

    return 0;
}