package KidsGreatestNumberCandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 * <p>
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 * <p>
 * Note that multiple kids can have the greatest number of candies.
 */
public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().orElse(0);
        Arrays.stream(candies).forEach(value -> {
            result.add(value + extraCandies >= max);
        });
        return result;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3},3));
    }
}
