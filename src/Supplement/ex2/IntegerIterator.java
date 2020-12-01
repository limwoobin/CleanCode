package Supplement.ex2;

import java.util.Iterator;

public class IntegerIterator implements Iterator<Integer> {
    private Integer nextValue = 0;

    @Override
    public synchronized boolean hasNext() {
        return nextValue < 10000;
    }

    @Override
    public synchronized Integer next() {
        if (nextValue == 100000) {
            throw new RuntimeException();
        }

        return nextValue++;
    }

    public synchronized Integer getNextValue() {
        return nextValue;
    }
}
