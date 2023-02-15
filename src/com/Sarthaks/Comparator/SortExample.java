package com.Sarthaks.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Emp> list = new ArrayList<>();
        list.add(new Emp(234,"CAT","789"));
        list.add(new Emp(232,"ATT","589"));
        list.add(new Emp(231,"BAT","689"));
        System.out.println(list);
        list.sort(new IDCompare());
        System.out.println(list);

        ArrayList<Emp> list1 = new ArrayList<>(list);
        list1.add(new Emp(34,"DAT","675"));
      //  System.out.println(list1);
        list1.sort(new NameCompare());
        for(Emp e : list1){
            System.out.println(e);
        }

    }
}
