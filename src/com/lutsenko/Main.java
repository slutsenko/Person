package com.lutsenko;

public class Main {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", "Ivanovov", "Ivanovich", "12.03.2019");
        Person vasya = new Person("Vasya", "Vasev", "Vasevich");
        Person igor = new Person("Igor Igorev Igorevich");
        System.out.println(vasya.getFullName());
        System.out.println(ivan.getShortName());
        System.out.println(igor);
    }
}
