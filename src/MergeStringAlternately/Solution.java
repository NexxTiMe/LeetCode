package MergeStringAlternately;

public class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        if (word1.length() > word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                if (i < word2.length()) {
                    sb.append(word1.charAt(i));
                    sb.append(word2.charAt(i));
                } else {
                    sb.append(word1.substring(i));
                    return sb.toString();
                }
            }
        } else if (word2.length() > word1.length()) {
            for (int i = 0; i < word2.length(); i++) {
                if (i < word1.length()) {
                    sb.append(word1.charAt(i));
                    sb.append(word2.charAt(i));
                } else {
                    sb.append(word2.substring(i));
                    return sb.toString();
                }
            }
        } else {
            for (int i = 0; i < word1.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pq"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abc", "pqr"));
    }
}
