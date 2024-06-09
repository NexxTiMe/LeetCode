package MergeSortedArray;

import java.util.Arrays;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0, 0};
        int[] nums2 = {4, 5, 2, 2};
        merge(nums1, 3, nums2, 4);
        System.out.println(Arrays.toString(nums1));
    }
}