import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();    //获取开始时间
        int n=50;
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
        System.out.println(count);
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
    }
}
