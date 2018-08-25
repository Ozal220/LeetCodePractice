package Easy.Others;

public class HammingWeight {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;

        while(n != 0){
            if ((n & 1) != 0){
                ++count;
            }
            n = n >>> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        HammingWeight hammingWeight = new HammingWeight();
        int res = hammingWeight.hammingWeight(0b10000000000000000000000000000000);
        System.out.println(res);
    }
}
