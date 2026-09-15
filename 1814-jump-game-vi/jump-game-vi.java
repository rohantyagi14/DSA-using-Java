class Solution {
    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];

        Deque<Integer> deque = new ArrayDeque<>();

        dp[0] = nums[0];
        deque.add(0);

        for (int i = 1; i < n; i++) {

            // Remove indices outside the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k) {
                deque.pollFirst();
            }

            // Best previous score is at the front
            dp[i] = nums[i] + dp[deque.peekFirst()];

            // Maintain decreasing dp values
            while (!deque.isEmpty() && dp[deque.peekLast()] <= dp[i]) {
                deque.pollLast();
            }

            deque.addLast(i);
        }

        return dp[n - 1];
    }
}