package Easy.Math;

public class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] num = new boolean[n];
        num[0] = false;                 // 2是质数
        for (int i = 1; i < n; i++) {
            num[i] = true;
        }

        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; ++i) {
            if (num[i - 1]) {
                for (int j = i * i; j <= n; j += i) {
                    num[j - 1] = false;
                }
            }
        }

        for (boolean bool : num) {
            if (bool)
                ++count;
        }

        return count;
    }

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(2));
    }
}
