package yandex;

public class TestMain {

    public static void main(String[] args) {
        Solution sol = new Solution();
        //int result = sol.reverse(1534236469);
        //System.out.println(result);
        System.out.println(2147483647 - -2147483647);
    }
}

class Solution {
    public int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        boolean negative = false;

        if (x < 0) {
            negative = true;
            x *= -1;
        }

        String str = String.valueOf(x);
        char[] ch = str.toCharArray();
        char[] resultArray = new char[ch.length];

        for (int i = 0; i < ch.length; i++) {
            resultArray[ch.length - 1 - i] = ch[i];
        }

        String resultStr = new String(resultArray);
        int result = Integer.parseInt(resultStr);
        if (negative) {
            result *= -1;
        }
        return result;
    }
}
