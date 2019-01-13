/*

问题描述
　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的四位十进制数。

*/
#include <stdio.h>

int main()
{
    int i,j,sum;
    int temp,num1,num2,num3,num4;
 
    for(sum = 1000; sum < 10000; sum++){
        temp = sum;
        num4 = temp %10;
        temp /=10;
        num3 = temp %10;
        temp /=10;
        num2 = temp %10;
        temp /=10;
        num1 = temp %10;
        if(num1 == num4 && num2 == num3)
            printf("%d\n",sum);
    }
    return 0;
}
