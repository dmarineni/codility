package com.codility.app.utils;

import java.util.Comparator;

public class SortByName<T extends Comparable<T>> implements Comparator<T> {

    @Override
    public int compare(T x, T y) {
        return x.compareTo(y);
    }
}
