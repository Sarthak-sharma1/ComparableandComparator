package com.Sarthaks.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Emp> list = new ArrayList<>();
        list.add(new Emp(12,"890","APPLE"));
        list.add(new Emp(34,"89034","BANANA"));
        list.add(new Emp(3,"9045","Array"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

       for(Emp e : list){
           System.out.println(e);
       }
    }
}
