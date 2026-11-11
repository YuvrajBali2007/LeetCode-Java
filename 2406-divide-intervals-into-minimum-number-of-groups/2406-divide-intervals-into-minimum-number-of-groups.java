class Solution {
    public int minGroups(int[][] intervals) {
        // Find the maximum endpoint to size the difference array accurately
        int maxEnd = 0;
        for (int[] interval : intervals) {
            maxEnd = Math.max(maxEnd, interval[1]);
        }

        // Difference array of size maxEnd + 2 to handle right + 1 safely
        int[] diff = new int[maxEnd + 2];

        for (int[] interval : intervals) {
            diff[interval[0]]++;       // Interval starts: +1 active group
            diff[interval[1] + 1]--;   // Interval ends after right: -1 active group
        }

        int maxGroups = 0;
        int currentOverlap = 0;

        // Prefix sum scan to find maximum concurrent intervals
        for (int count : diff) {
            currentOverlap += count;
            maxGroups = Math.max(maxGroups, currentOverlap);
        }

        return maxGroups;
    }
}
