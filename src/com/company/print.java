package com.company;

public class print {
    public static void main(String[] args) {
        int zip=3;
        System.out.println(String.format("%-21s%-26s%19s%06d", "name", "address", "city", zip));
    }
}
