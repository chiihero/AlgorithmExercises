/*
问题描述
　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
样例输入
FFFF
样例输出
65535
*/
#include <stdio.h>
#include<math.h>
int main() {
	int i,n=0;
	long long sum = 0;
	char num[8];
	scanf("%s",&num);
	for(i=strlen(num)-1; i>=0; i--) {
		if((int)(num[i]-'0')>9) {
			sum+=(int)(num[i]-'A'+10)*pow(16,n);
		} else {
			sum+=(int)(num[i]-'0')*pow(16,n);
		}
		n++;
	}
	printf("%lld",sum);
	return 0;
}