/*
问题描述

给出n个数，找出这n个数的最大值，最小值，和。
输入格式

第一行为整数n，表示数的个数。

第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。
输出格式
输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。
样例输入
5
1 3 -2 4 5
样例输出
5
-2
11
数据规模与约定
1 <= n <= 10000。
*/
#include <stdio.h>

int main()
{
    int i,j,n,min,max,sum;
	scanf("%d",&n);
    int nums[n];

    scanf("%d",&nums[0]);
    max = nums[0];
    min = nums[0];
    sum = nums[0];
    for(i = 1; i < n; i++){
        scanf("%d",&nums[n]);
        if(max<nums[n])
            max = nums[n];
        if(min>nums[n])
            min = nums[n];
        sum += nums[n];
    }
    printf("%d\n%d\n%d",max,min,sum);
    return 0;
}
