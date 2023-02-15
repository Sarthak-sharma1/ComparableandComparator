package com.Sarthaks.Comparator;

public class NameCompare implements java.util.Comparator<Emp> {


    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
