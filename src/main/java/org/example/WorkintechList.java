package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WorkintechList<T> extends ArrayList<T> {
    public WorkintechList() {
        super();
    }

    public List<T> toList() {
        return new ArrayList<>(this);
    }

    public void sort() {
        Collections.sort((List) this, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if (o1 == null && o2 == null) return 0;
                if (o1 == null) return -1;
                if (o2 == null) return 1;
                if (o1 instanceof Number && o2 instanceof Number) {
                    double d1 = ((Number) o1).doubleValue();
                    double d2 = ((Number) o2).doubleValue();
                    return Double.compare(d1, d2);
                }
                String s1 = o1.toString();
                String s2 = o2.toString();
                return s1.compareToIgnoreCase(s2);
            }
        });
    }

    public void sortMixed() {
        sort();
    }
}