/*
204. 计数质数     
统计所有小于非负整数 n 的质数的数量。

示例:

输入: 10
输出: 4
解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
*/

public class leetcode_204 {
      public int countPrimes(int n) {
            Boolean[] is_composite =new Boolean[n+1];
            //排除2的倍数
            for (int i = 4; i < n; i+=2) {
                  is_composite[i]=true;
            }
            int sum=0;
            int next_prime=3;
            int stop_at= (int) Math.sqrt(n)+1;
            while (next_prime<stop_at) {
                  //排除素数的倍数
                  for (int i = next_prime*2; i < n; i+=next_prime) {
                        is_composite[i]=true;
                  }
                  next_prime+=2;
                  //寻找下一个素数
                  while (next_prime<=n&&is_composite[next_prime]!=null) {
                        next_prime+=2;

                  }
            }
            for (int i = 2; i < n; i++) {
                if(is_composite[i]==null) sum++;
            }
            return sum;
      }

      public int countPrimes2(int n) {
            boolean[] is_composite = new boolean[n + 1];
            int count = n / 2;
            int stop_at= (int) Math.sqrt(n)+1;

            for (int i = 3; i <stop_at; i += 2) {
                  if (is_composite[i])
                        continue;
                  for (int j = i * i; j < n; j += 2 * i) {
                        if (!is_composite[j]) {
                              count--;
                              is_composite[j] = true;
                        }
                  }
            }
            return count;
      }
}
