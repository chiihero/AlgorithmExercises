/*
问题描述
　　给定n个十六进制正整数，输出它们对应的八进制数。

输入格式
　　输入的第一行为一个正整数n （1<=n<=10）。
　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。

输出格式
　　输出n行，每行为输入对应的八进制正整数。

　　【注意】
　　输入的十六进制数不会有前导0，比如012A。
　　输出的八进制数也不能有前导0。

样例输入
　　2
　　39
　　123ABC

样例输出
　　71
　　4435274

　　【提示】
　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
*/
#include <stdio.h>
#include<math.h>
int main() {
	int i,j,m,n=0;
	char egh[300000];
	char two[400000];
	char num[10][100000];
	scanf("%d",&n);
	for(i=0; i<n; i++) {
		scanf("%s",&num[i]);
		int len = strlen(num[i]);
		for(j=0; j<len; j++) {
			if(num[i][j]<='9') {
				two[j*4]=(num[i][j]-'0')/8+48;
				two[j*4+1]=((num[i][j]-'0')%8)/4+48;
				two[j*4+2]=((num[i][j]-'0')%4)/2+48;
				two[j*4+3]=((num[i][j]-'0')%2)/1+48;
			} else {
				two[j*4]=(num[i][j]-'A'+10)/8+48;
				two[j*4+1]=((num[i][j]-'A'+10)%8)/4+48;
				two[j*4+2]=((num[i][j]-'A'+10)%4)/2+48;
				two[j*4+3]=((num[i][j]-'A'+10)%2)/1+48;
			}

		}
		len = strlen(two);
		j =len;//二进制计算开始数值 
		
		if(len%3>0) len = len/3+1;
		else len = len/3;//八进制长度 
		for(m=0; m<len; m++) {
			if(j/3>0) {
				egh[m]=(two[j-1]-'0')+(two[j-2]-'0')*2+(two[j-3]-'0')*4+48;
			} else if(j==1) {
				egh[m]=(two[j-1]-'0')+48;
			} else if(j==2) {
				egh[m]=(two[j-1]-'0')+(two[j-2]-'0')*2+48;
			}
//			printf("TWO：%c%c%c\n",two[j-1],two[j-2],two[j-3]);
//			printf("EGH：%c\n",egh[m]);
			j-=3;
		}
		for(j =strlen(egh)-1;j>=0;j--)
			printf("%c",egh[j]);

	}
//	printf("%s\n",two);
//	printf("%s",egh);


	return 0;
}