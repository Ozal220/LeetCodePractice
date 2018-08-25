package Easy.SortAndSearch;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int writeIndex = m + n - 1;

        while (i >= 0 && j >= 0) {
            nums1[writeIndex--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[writeIndex--] = nums2[j--];

        }
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        Merge merge = new Merge();
        merge.merge(num1, 3, num2, 3);
        for (int n : num1)
            System.out.printf(n + " ");
    }
}
