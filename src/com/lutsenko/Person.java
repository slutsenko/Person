package com.lutsenko;

public class Person {
    private String name;
    private String surName;
    private String lastName;
    private String birthday;

    public Person(String fullName) {
        var names = fullName.split(" ");
        this.name = names[0];
        this.surName = names[1];
        this.lastName = names[2];
    }


    public Person(String name, String surName, String lastName) {
        this.name = name;
        this.surName = surName;
        this.lastName = lastName;
    }


    public Person(String name, String surName, String lastName, String birthday) {
        this.name = name;
        this.surName = surName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getFullName() {
        name = name != null ? name : "";
        surName = surName != null ? surName : "";
        lastName = lastName != null ? lastName : "";

        return (name + " " + surName + " " + lastName).trim();
    }

    public String getShortName() {

        return surName + " " + Character.toUpperCase(name.charAt(0)) + "." + " " + Character.toUpperCase(lastName.charAt(0)) + ".";
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
