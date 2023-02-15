package com.Sarthaks.Comparator;

import java.util.Comparator;

public class IDCompare implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getId()-o2.getId();
    }
}
