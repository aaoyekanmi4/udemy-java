package BinPacking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstFitDecreasingAlgorithm {
    private List<Bin> bins;
    private List<Integer> items;
    private int binCapacity;
    private int binCounter = 1;

    public FirstFitDecreasingAlgorithm(List<Integer> items, int binCapacity) {
        this.items = items;
        this.binCapacity = binCapacity;
        //worst case - number of bins will equal number of items
        this.bins = new ArrayList<>(items.size());
    }

    public void solve() {
        //sort the items in descending order
        Collections.sort(items, Collections.reverseOrder());

        //if largest item does not fit,
        if (items.get(0) > binCapacity) {
            System.out.println("No feasible solution...");
            return;
        }
        bins.add(new Bin(binCounter, binCapacity));

        for (Integer item: items) {
            //track whether we have put the item into a bin or not
            boolean placedItem = false;
            // this is how we track the actual bin
            int currentBin = 0;

            while (!placedItem) {
                // item does not fit in the last bin
                if (currentBin == bins.size()) {
                    Bin newBin = new Bin(++binCounter, binCapacity);
                    newBin.put(item);
                    bins.add(newBin);
                    placedItem = true;
                } else if (bins.get(currentBin).put(item)) {
                    placedItem = true;
                } else {
                    currentBin++;
                }
            }
        }
    }

    public void showResults() {
        for (Bin bin: bins) {
            System.out.println(bin);
        }
    }
}
