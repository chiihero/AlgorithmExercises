/* 
问题描述
    100 可以表示为带分数的形式：100 = 3 + 69258 / 714。 
    还可以表示为：100 = 82 + 3546 / 197。
    注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。
    类似这样的带分数，100 有 11 种表示法。
输入格式
    从标准输入读入一个正整数N (N<1000*1000)
输出格式
    程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。
    注意：不要求输出每个表示，只统计有多少表示法！
样例输入1
    100
样例输出1
    11
样例输入2
    105
样例输出2
    6

    num = c +a/b
    a = (num -c)*b
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