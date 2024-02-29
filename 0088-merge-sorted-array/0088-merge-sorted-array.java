import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m > 0 && n == 0){
            System.out.println(Arrays.toString(nums1));
            return;
        }

        
        for(int i = m, j = 0; i < nums1.length; i++, j++){
            nums1[i] = nums2[j];
        }
        
        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }
}