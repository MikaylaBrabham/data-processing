package com.pluralsight.loops;

public class Person {

        //add given string
        private String FirstName;
        private String LastName;
        private Integer age;


        // add constructor
    public Person(String firstName, String lastName, Integer age) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    //add getters and setters

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Integer getAge() {
        return age;
    }

    //add to string

    @Override
    public String toString() {
        return FirstName + " " + LastName + ", age " +  age + ".";
    }
}

