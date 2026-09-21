import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            // If a duplicate is found, shrink the window from the left
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character and record the max length
            charSet.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
