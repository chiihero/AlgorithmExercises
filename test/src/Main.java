import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        int n=28;
//        StringBuffer str = new StringBuffer();
//        int tmp = 0;
//        while (n > 0) {
//            n--;
//            tmp = n % 26;
//            str.insert(0,(char) (tmp + 'A'));
//            n /= 26;
//        }
//        System.out.println(str.toString());

        String s="AB";
        int sum = 0;
        for (int i = 0,len =s.length(); i <len ; i++) {
            sum = sum * 26 + (int)s.charAt(i) - 64;

        }
        System.out.println(sum);
    }
}
