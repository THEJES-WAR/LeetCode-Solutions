class Solution {
    public long minCuttingCost(int n, int m, int k) {
        // Case 1: both logs fit into trucks -> no cutting needed
        if (n <= k && m <= k) {
            return 0;
        }
        // Case 2: one log fits, cut the other
        else if (n <= k && m > k) {
            return minSplitCost(m, k);
        } 
        else if (m <= k && n > k) {
            return minSplitCost(n, k);
        } 
        // Case 3: both logs > k, cut whichever gives min cost
        else {
            return Math.min(minSplitCost(n, k), minSplitCost(m, k));
        }
    }

    private long minSplitCost(int x, int k) {
        // Valid splits: a and x-a, with both ≤ k
        int a1 = Math.max(1, x - k);  // smallest valid a
        int a2 = Math.min(k, x - 1);  // largest valid a

        long cost1 = (long) a1 * (x - a1);
        long cost2 = (long) a2 * (x - a2);

        return Math.min(cost1, cost2);
    }
}
