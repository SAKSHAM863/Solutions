import java.util.*;

public class Longest_Substring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> seen = new HashSet<>();
        int maxLength = 0, left = 0, right = 0;

        while (right < n) {
            if (!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int length = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}