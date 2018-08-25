package Easy.Math;

public class IsPowerOfThree {
    boolean isPowerOfThree(int n) {
        // k = log3^n log以3为底的n
        double k = Math.log10(n) / Math.log10(3);
        return k - (int)k == 0 ? true : false;
    }

    public static void main(String[] args) {
        IsPowerOfThree isPowerOfThree = new IsPowerOfThree();
        isPowerOfThree.isPowerOfThree(8);
    }
}
