package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
   private List<T> items;
   private int maxSize;

   //Constructor
    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    //add and see if size is less than the size
    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        }
    }

    //getter of the list
    public List<T> getItems() {
        return new ArrayList<>(items);
    }
}

