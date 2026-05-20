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

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
}
