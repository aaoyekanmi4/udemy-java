package Recursion;

public class BinarySearch {
    public int find(int[] container, int item, int left, int right) {
        int middleIdx = (left + right)/2;

        if (right < left) return -1;

        if (container[middleIdx] == item) {
            return middleIdx;
        }

        if (container[middleIdx] > item) {
            return find(container, item, left, middleIdx -1);
        } else {
            return find(container, item, middleIdx +1, right);
        }
    }
}
