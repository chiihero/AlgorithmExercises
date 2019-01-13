#include<stdio.h>

//�������ܣ�ϣ�������㷨�����ֵ������� //����������������㣬�����յ�
void shell_sort(int *numbers, const int n) {
	int i;
	int increment = n; //��ʼ����������
	int temp;
	do { //ÿ�μ�С������ֱ��increment = 1
		increment = increment / 3 + 1;
		for (i =  increment; i < n; ++i) { //��ÿ�����ֽ���ֱ�Ӳ�������
			if (numbers[i - increment] > numbers[i]) {
				temp = numbers[i];
				int j = i - increment;
				do { //�ƶ�Ԫ�ز�Ѱ��λ��
					numbers[j + increment] = numbers[j];
					j -= increment;
				} while (j > 0 && numbers[j] > temp);
				numbers[j + increment] = temp; //����Ԫ��
			}
		}
	} while (increment > 1);
}


int main() {
	int a[] = { 5,12,35,42,11,2,9,41,26,18,4 };
	int j;
	int n = 11;
	shell_sort(a, n);
	printf("����õ�����Ϊ��");
	for (j = 0; j < n; j++) {
		printf("%d ", a [j]);
	}
	return 0;
}
