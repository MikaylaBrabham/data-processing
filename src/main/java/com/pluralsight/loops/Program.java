package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // create a list of 10 people only using traditional loops

        List<Person> people = new ArrayList<>();

        people.add(new Person("Huey", "Freeman", 10));
        people.add(new Person("Riley", "Freeman", 8));
        people.add(new Person("Robert", "Freeman", 62));
        people.add(new Person("Sarah", "Dubois", 35));
        people.add(new Person("Uncle", "Ruckus", 5));
        people.add(new Person("Cindy", "McPhearson", 9));
        people.add(new Person("A Pimp ", "Named Slickback", 35));
        people.add(new Person("Thug", "Nificent", 37));
        people.add(new Person("Gangsta", "Licious", 35));
        people.add(new Person("Joe", "Petto", 71));


        // insert scanner and prompt user for a name to search
        Scanner myScanner = new Scanner (System.in);

        //ask user to search for a first or last name
        System.out.println("Please Enter The First Or Last Name Of The Person You're Searching For?");
        String peopleName = myScanner.nextLine().trim();


        // create if else loop to ensure name is entered correctly

        //create a for loop to create a name who's word is a match
        List<Person> nameMatch = new ArrayList<>();


        for (Person person : people) {
            if(person.getFirstName().equalsIgnoreCase(peopleName));

            }
        }

        //display the name






    }
}
