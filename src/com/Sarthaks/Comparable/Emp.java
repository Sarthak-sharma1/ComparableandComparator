package com.Sarthaks.Comparable;

public class Emp implements Comparable<Emp>{
     private  int id;
     private String phoneNumber;
     private String name;

    public Emp(int id, String phoneNumber, String name) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Emp o) {
        return this.id-o.id;
    }
}
