import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m > 0 && n == 0){
            System.out.println(Arrays.toString(nums1));
            return;
        }

        System.arraycopy(nums2, 0, nums1, m, n);

        Arrays.sort(nums1);
    }
}