import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals based on their start values
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedList = new ArrayList<>();
        
        // Start with the first interval
        int[] currentInterval = intervals[0];
        mergedList.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];

            // If the next interval overlaps with the current interval
            if (nextInterval[0] <= currentInterval[1]) {
                // Merge them by updating the end time
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                // Move to the next interval and add it to the list
                currentInterval = nextInterval;
                mergedList.add(currentInterval);
            }
        }

        // Convert the list back to a 2D array
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
