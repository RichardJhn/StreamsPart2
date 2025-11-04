package com.pluralsight;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main (String[] Args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        people.add(new Person("Richard", "John", 22));
        people.add(new Person("Emily", "Clark", 25));
        people.add(new Person("Michael", "Smith", 30));
        people.add(new Person("Sarah", "Brown", 28));
        people.add(new Person("David", "Lee", 35));
        people.add(new Person("Olivia", "Taylor", 27));
        people.add(new Person("James", "Wilson", 33));
        people.add(new Person("Sophia", "Davis", 21));
        people.add(new  Person("Ethan", "Martinez", 24));
        people.add(new Person("Isabella", "Anderson", 26));

        System.out.println("Enter a name to search (first or last)");

        String nameSearch = scanner.nextLine().trim();

        List<Person> matches = new ArrayList<>();

        for( Person person : people){
            if (person.getFirstName().equalsIgnoreCase(nameSearch)
                    || person.getLastName().equalsIgnoreCase(nameSearch)) {
                matches.add(person);
            }
        }

        if(matches.isEmpty()){
            System.out.println("This person was not found");
        }
        else{
            System.out.println("People found: ");
            for (Person match : matches) {
                System.out.println(match);
            }
        }

        int totalAge = 0;
        int oldest = people.get(0).getAge();
        int youngest = people.get(0).getAge();

        for (Person p : people){
            totalAge += p.getAge();

            if (p.getAge() > oldest){
                oldest = p.getAge();
            }
            if (p.getAge() < youngest){
                youngest = p.getAge();
            }
        }


        double averageAge = (double) totalAge / people.size();

        System.out.println("The average Age is: " + averageAge );
        System.out.println("The oldest is: " + oldest);
        System.out.println("Youngest is: " + youngest);




        //calculate age
    }
}
