package BinPacking;

import java.util.ArrayList;
import java.util.List;

public class Bin {
    private int id;
    //maximum we can store
    private int capacity;
    //amount we have already stored
    private int amountStored;
    private List<Integer> items;

    public boolean put(int item) {
        if (amountStored + item <= capacity) {
            items.add(item);
            amountStored += item;
            return true;
        } else {
            return false;
        }
    }

    public Bin(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public String toString() {
        String contentOfBin = "Item in bin#" + this.id;
        for (Integer item: items) {
            contentOfBin += " " + item + " ";
        }
        return contentOfBin;
    }
}
