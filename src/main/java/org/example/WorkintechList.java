package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    @Override
    public boolean add(T element) {
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }

    @Override
    public void add(int index, T element) {
        if (!this.contains(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean addAll(java.util.Collection<? extends T> c) {
        boolean added = false;
        for (T element : c) {
            added |= this.add(element);
        }
        return added;
    }

    public void sort() {
        Collections.sort(this);
    }

    public void remove(Object o) {
        super.remove(o);
        this.sort();
    }
}
