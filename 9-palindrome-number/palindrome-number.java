class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are never palindrome
        if (x < 0) {
            return false;
        }

        // Numbers ending with 0 are not palindrome
        // except 0 itself
        if (x % 10 == 0 && x != 0) {
            return false;
        }

        int reversed = 0;

        // Reverse only half of the number
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }

        // Even digits: x == reversed
        // Odd digits: x == reversed / 10
        return x == reversed || x == reversed / 10;
    }
}