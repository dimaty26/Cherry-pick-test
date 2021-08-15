package yandex;

public class BinaryTaskTest {
    public static void main(String[] args) {
        int[] firstRaw = {1, 1, 0, 1, 1};
        int[] secondRaw = {0, 0, 0};
        int[] thirdRaw = {1, 1, 1, 1, 1};
        int[] fourthRaw = {0, 1, 1, 1, 0};
        System.out.println(countSymbols1(firstRaw) == 2);
        System.out.println(countSymbols1(secondRaw) == 0);
        System.out.println(countSymbols1(thirdRaw) == 5);
        System.out.println(countSymbols1(fourthRaw) == 3);
    }

    public static int countSymbols1(int[] array) {
        int current = 0;
        int max = 0;
        for (int i : array) {
            if (i == 1) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 0;
            }
        }

        return max;
    }
}
