package CanPlaceFlowers;

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * <p>
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */
public class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n==0) return true;
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0)
                return n - 1 == 0;
            return n <= 0;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n -= 1;
            }
            if (i == flowerbed.length - 1 && flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n -= 1;
            }
            if (i + 2 < flowerbed.length && flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0) {
                flowerbed[i + 1] = 1;
                n -= 1;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1));
    }
}
