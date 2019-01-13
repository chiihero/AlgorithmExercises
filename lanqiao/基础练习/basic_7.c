/*
问题描述
　　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
*/
#include <stdio.h>

int main()
{
    int i,j,sum;
    int temp,num1,num2,num3;
 
    for(sum = 100; sum < 1000; sum++){
        temp = sum;
        
        num3 = temp %10;
        temp /=10;
        num2 = temp %10;
        temp /=10;
        num1 = temp %10;
        if(sum == num1*num1*num1+num2*num2*num2+num3*num3*num3)
            printf("%d\n",sum);
    }
    return 0;
}
