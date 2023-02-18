package com.Sarthaks.InterViewQues;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("DART","32",new Address("STREET NO 2",6)));
        list.add(new Employee("BATH","27",new Address("STREET NO 3",4)));
        list.add(new Employee("CAT","29",new Address("STREET NO 4",5)));
       // System.out.println(list);
        list.sort(new AgeComparator());
        for(Employee e : list){
            System.out.println(e);
        }

        ArrayList<Employee> list1 = new ArrayList<>(list);
        list1.add(new Employee("APPLE","3",new Address("STREET NO 5",2)));
        list1.sort(new NameComparator());
        for(Employee e : list1){
            System.out.println(e);
        }

        ArrayList<Employee> list2 = new ArrayList<>(list1);
        list2.add(new Employee("Banana","3",new Address("STREET NO 5",1)));
        list2.sort(new AddressComparator());
        for(Employee e : list2){
            System.out.println(e);
        }

    }
}
