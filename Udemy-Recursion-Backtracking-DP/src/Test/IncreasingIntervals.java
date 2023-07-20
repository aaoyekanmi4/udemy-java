package Test;

import java.util.List;

public class IncreasingIntervals {
        public int getIntervals(List<Integer> periods, int k) {
            int intervalSize = 1;
            int currentIdx = 1;
            int intervalCount = 0;

            while (currentIdx < periods.size()) {
                if (periods.get(currentIdx) > periods.get(currentIdx - 1)) {
                    intervalSize++;
                    if (intervalSize == k) {
                        intervalCount++;
                        intervalSize = 1;
                    } else {
                        currentIdx++;
                    }
                } else {
                    currentIdx++;
                }
            }
            return intervalCount;
        }
}
