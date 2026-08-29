package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<E extends Comparable<E>> extends ArrayList<E>{
    @Override
    public boolean add(E e){
        if(!this.contains(e)){
            super.add(e);
        }
        return true;
    }

    public void sort(){
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        super.remove(o);
        sort();
        return true;
    }
}
