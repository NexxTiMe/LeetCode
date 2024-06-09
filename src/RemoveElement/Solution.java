package RemoveElement;


import java.util.Arrays;

import static java.util.Arrays.sort;

public class Solution {
//    public static int removeElement(int[] nums, int val) {
//        int[] filtered = Arrays.stream(nums).filter(value -> value != val).toArray();
//        System.arraycopy(filtered, 0, nums, 0, filtered.length);
//        return nums.length;
//    }
    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int num : nums){
            if (num != val){
                nums[counter++] = num;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int[] expectedNums = {0,1,4,0,3};
        int k = removeElement(nums, val);
        System.out.println(k);
        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < 2; i++) {
            System.out.println(nums[i] == expectedNums[i]);
            assert nums[i] == expectedNums[i];
        }
    }
}
