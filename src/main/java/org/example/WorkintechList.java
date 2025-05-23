package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<Object> {

    @Override
    public boolean add(Object o) {
        if (!this.contains(o)) {
            return super.add(o);
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        sort(); // her silmeden sonra otomatik sırala
        return removed;
    }

    public void sort() {
        Collections.sort((ArrayList) this);
    }
}
