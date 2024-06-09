package GreatestCommonDivisorString;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 * <p>
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 **/
public class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        final int length2 = str2.length();
        final int length1 = str1.length();
        if (length1 >= length2) {
            for (int i = length2; i > 0; i--) {
                if (length2 % i == 0 && length1 % i == 0) {
                    final String candidate = str2.substring(0, i);
                    if (str2.split(candidate).length == 0 && str1.split(candidate).length == 0) {
                        return candidate;
                    }
                }
            }
        } else {
            for (int i = length1; i > 0; i--) {
                if (length2 % i == 0 && length1 % i == 0) {
                    final String candidate = str2.substring(0, i);
                    if (str2.split(candidate).length == 0 && str1.split(candidate).length == 0) {
                        return candidate;
                    }
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "AB"));
    }
}
