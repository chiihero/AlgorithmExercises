import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void f(int[] a, int k, int n, String s)
    {
        if(k==a.length){
            if(n==0) System.out.println(s);
            return;
        }

        String s2 = s;
        for(int i=0; i<=a[k]; i++){
            f(a, k+1, 5-s2.length(), s2);   //填空位置
            s2 += (char)(k+'A');
        }
    }
    public static boolean check(){
    Math.pow(9, 1/3);

    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();    //获取开始时间
        int[] a = {4,2,2,1,1,3};

        f(a,0,5,"");
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
    }

}