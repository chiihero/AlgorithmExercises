/* 

问题描述

小明为某机构设计了一个十字型的徽标（并非红十字会啊），如下所示：
..$$$$$$$$$$$$$..
..$...........$..
$$$.$$$$$$$$$.$$$
$...$.......$...$
$.$$$.$$$$$.$$$.$
$.$...$...$...$.$
$.$.$$$.$.$$$.$.$
$.$.$...$...$.$.$
$.$.$.$$$$$.$.$.$
$.$.$...$...$.$.$
$.$.$$$.$.$$$.$.$
$.$...$...$...$.$
$.$$$.$$$$$.$$$.$
$...$.......$...$
$$$.$$$$$$$$$.$$$
..$...........$..
..$$$$$$$$$$$$$..

对方同时也需要在电脑dos窗口中以字符的形式输出该标志，并能任意控制层数。
输入格式
一个正整数 n (n<30) 表示要求打印图形的层数。
输出格式
对应包围层数的该标志。
样例输入1
1
样例输出1
..$$$$$..
..$...$..
$$$.$.$$$
$...$...$
$.$$$$$.$
$...$...$
$$$.$.$$$
..$...$..
..$$$$$..
样例输入2 
3
样例输出2
..$$$$$$$$$$$$$..
..$...........$..
$$$.$$$$$$$$$.$$$
$...$.......$...$
$.$$$.$$$$$.$$$.$
$.$...$...$...$.$
$.$.$$$.$.$$$.$.$
$.$.$...$...$.$.$
$.$.$.$$$$$.$.$.$
$.$.$...$...$.$.$
$.$.$$$.$.$$$.$.$
$.$...$...$...$.$
$.$$$.$$$$$.$$$.$
$...$.......$...$
$$$.$$$$$$$$$.$$$
..$...........$..
..$$$$$$$$$$$$$..
提示
请仔细观察样例，尤其要注意句点的数量和输出位置。

 */

#include <stdio.h>
int main() {
	int i,j,n;
	char photo[130][130];
	memset( photo, '.', 16900 * sizeof(char));

	scanf("%d",&n);
	n =3;
	int space = 0, num_s = 0, t = 0;
	int row  = 4*(n-1)+9;                //n层时，数组大小
	int  center = (row-1)/2;

	space = center;   //摆放$时，前面跳过个数space
	t = num_s = 1;    //需要连续摆放num_s个$
	//（A区域），（C区域）
	for (i = center-2; i >= 0; i -= 2) {   //摆放上面到中心和左边到中心'$'型
		//这里从中心往外围摆放$
		for (j = space; t > 0; ++j) {
			photo[i][j] = '$';
			photo[j][i] = '$';
			--t;
		}
		space -= 2;   //注意观察规律
		t = num_s += 2;
	}
	//（B区域）
	for (i = 2; i <=center; i += 2) {
		photo[i-1][i] = '$';//摆放中上对角线
		photo[i][i] = '$';//摆放正对角线
		photo[i][i-1] = '$'; //摆放中下对角线
	}
//	至此，左上角的图案全部摆放完毕（然后通过对称性...）
//	（对称性 对折图形）
	for (i = 0; i < (row+1)/2; ++i)
		for (j = 0; j < (row+1)/2; ++j) {
			photo[row-i-1][row-j-1] = photo[i][j];//沿对角线对折
			photo[i][row-j-1] = photo[i][j];//沿列中线对折
			photo[row-i-1][j] = photo[i][j]; //沿行中线对折
		}
	for (i = 0; i < row; ++i) {            //打印十字图
		for (j = 0; j < row; ++j)
			printf("%c",photo[i][j]);
		printf("\n");
	}
	return 0;
}
