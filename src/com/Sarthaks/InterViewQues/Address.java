package com.Sarthaks.InterViewQues;

public class Address implements Comparable<Address>{
    private String street;
    private int code;

    public Address(String street, int code) {
        this.street = street;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", code=" + code +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public int compareTo(Address o) {
        return this.getCode()-o.getCode();
    }
}
