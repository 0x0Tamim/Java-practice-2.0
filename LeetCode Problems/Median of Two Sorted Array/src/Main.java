import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix = new int[nums1.length + nums2.length];

        // Merge two sorted arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mix[k++] = nums1[i++];
            } else {
                mix[k++] = nums2[j++];
            }
        }

        // Add remaining elements
        while (i < nums1.length) {
            mix[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            mix[k++] = nums2[j++];
        }

        // Find median
        int n = mix.length;
        if (n % 2 == 0) {
            return (mix[n / 2 - 1] + mix[n / 2]) / 2.0;
        } else {
            return mix[n / 2];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = sol.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median is: " + median);
    }
}
