#include<stdio.h>

//函数功能，希尔排序算法对数字递增排序 //函数参数，数列起点，数列终点
void shell_sort(int *numbers, const int n) {
	int i;
	int increment = n; //初始化划分增量
	int temp;
	do { //每次减小增量，直到increment = 1
		increment = increment / 3 + 1;
		for (i =  increment; i < n; ++i) { //对每个划分进行直接插入排序
			if (numbers[i - increment] > numbers[i]) {
				temp = numbers[i];
				int j = i - increment;
				do { //移动元素并寻找位置
					numbers[j + increment] = numbers[j];
					j -= increment;
				} while (j > 0 && numbers[j] > temp);
				numbers[j + increment] = temp; //插入元素
			}
		}
	} while (increment > 1);
}


int main() {
	int a[] = { 5,12,35,42,11,2,9,41,26,18,4 };
	int j;
	int n = 11;
	shell_sort(a, n);
	printf("排序好的数组为：");
	for (j = 0; j < n; j++) {
		printf("%d ", a [j]);
	}
	return 0;
}
