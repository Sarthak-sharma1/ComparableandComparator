package com.Sarthaks.InterViewQues;

public class NameComparator implements java.util.Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
