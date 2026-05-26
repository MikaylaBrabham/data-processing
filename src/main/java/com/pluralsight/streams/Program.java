package com.pluralsight.streams;

import com.pluralsight.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

    public class Program.java {
       main


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
            Scanner myScanner = new Scanner(System.in);

            //ask user to search for a first or last name
            System.out.println("Please Enter The First Or Last Name Of The Person You're Searching For?");
            String search = myScanner.nextLine();


            // create if else loop to ensure name is entered correctly

            //create a for loop to create a name who's word is a match
            List<Person> nameMatch = people.stream().filter(person -> person.getFirstName()
                            .equalsIgnoreCase(search) || person.getLastName().equalsIgnoreCase(search))
                    .collect(Collectors.toList());

            //print matches
            System.out.println("Matches");
            nameMatch.forEach(person -> System.out.println(person.getFirstName()
                    + " " + person.getLastName()));


            // add the variables and  make them equal to 0
            int totalAges = people.stream().map(Person::getAge).reduce(0, Integer::sum);
            double averageAge = (double) totalAges / people.size();

            //to get oldest
            int oldieButGoldie = people.stream().map(Person::getAge).reduce(people.get(0).getAge(), Math::max);

            //to get youngest
            int youngIpadKid = people.stream().map(Person::getAge).reduce(people.get(0).getAge(), Math::min);

            // display names
            System.out.println("Average age: " + averageAge);
            System.out.println("Oldest age: " + oldieButGoldie);
            System.out.println("Youngest age: " + youngIpadKid);
        }
    }
}
