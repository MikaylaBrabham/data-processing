package com.pluralsight.loops;

import com.pluralsight.Person;

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
        people.add(new Person("Uncle", "Ruckus", 58));
        people.add(new Person("Cindy", "McPhearson", 9));
        people.add(new Person("A Pimp ", "Named Slickback", 35));
        people.add(new Person("Thug", "Nificent", 37));
        people.add(new Person("Gangsta", "Licious", 35));
        people.add(new Person("Joe", "Petto", 71));


        // insert scanner and prompt user for a name to search
        Scanner myScanner = new Scanner (System.in);

        //ask user to search for a first or last name
        System.out.println("Please Enter The First Or Last Name Of The Person You're Searching For?");
        String peopleName = myScanner.nextLine().trim().toLowerCase();


        // create if else loop to ensure name is entered correctly

        //create a for loop to create a name who's word is a match
        List<Person> nameMatch = new ArrayList<>();
        for (Person person : people) {
            if(person.getFirstName().equalsIgnoreCase(peopleName) || person.getLastName().equalsIgnoreCase(peopleName)) {
                nameMatch.add(person);
            }
        }
        //display the name
        System.out.println("The person your looking for is " + nameMatch);

        //add if else to make sure it print out empty
        if (nameMatch.isEmpty()) {
            System.out.println("No one is here by that name.");
        } else {
            for (Person person : nameMatch) {
                System.out.println(person);
            }
        }
        // add the variables and  make them equal to 0
        int totalAges = 0;
        Person oldieButGoldie = people.get(0);
        Person youngIpadKid = people.get(0);

        for (Person person : people) {
            //add average age of everyone in list
            totalAges += person.getAge();

            //get oldest person
            if (person.getAge() > oldieButGoldie.getAge()) {
                oldieButGoldie = person;
            }
            //get youngest person
            if (person.getAge() < youngIpadKid.getAge()) {
                youngIpadKid = person;
            }
        }

        //display average age
        double averageAge = (double) totalAges / people.size();
        System.out.println("The average of all age's are " + averageAge);

        //display oldest person
        System.out.println("The oldest person's age  is " + oldieButGoldie);
        //display youngest
        System.out.println("The youngest person's age is " + youngIpadKid);

    }
}
//