import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(31);
//        int total = 0;
//        while (n > 0) {
//            total += n/5;
//            n /= 5;
//
//        }

        BigInteger k= BigInteger.valueOf(n-1);
        while (n.equals(0)){

            n = n.multiply(k);
            k.subtract(BigInteger.valueOf(1));
        }
        System.out.println(n);
    }
}
