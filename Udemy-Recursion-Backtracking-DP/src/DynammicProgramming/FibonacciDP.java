package DynammicProgramming;

import java.util.Map;

//O(n) running time - sacrifice some memory to save time
public class FibonacciDP {

    //top-down approach memo
    public int fibMemo(int n, Map<Integer, Integer> table) {
        if (!table.containsKey(n)) {
            table.put(n, fibMemo(n-1, table) + fibMemo(n-2, table));
        }
        return table.get(n);
    }

    //bottom-up approach tabulation
    public int fibTab(int n, Map<Integer, Integer> table) {

        for (int i = 2; i <=n; i++) {
            table.put(i, table.get(i-1) + table.get(i-2));
        }
        return table.get(n);
    }
}
