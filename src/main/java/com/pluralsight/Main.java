package com.pluralsight;

import javax.crypto.spec.PSource;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] Args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> people = Arrays.asList(
        new Person("Richard", "John", 22),
        new Person("Emily", "Clark", 25),
        new Person("Michael", "Smith", 30),
        new Person("Sarah", "Brown", 28),
        new Person("David", "Lee", 35),
        new Person("Olivia", "Taylor", 27),
        new Person("James", "Wilson", 33),
        new Person("Sophia", "Davis", 21),
        new  Person("Ethan", "Martinez", 24),
        new Person("Isabella", "Anderson", 26)
        );
//        String letter = scanner.nextLine();
//        List<Person> nameFound = people.stream()
//                        .filter(peoples -> people.getFirst().equalsI)
//                                .collect(Collectors.toList());

        System.out.println("Enter a name to search (first or last)");

        String nameSearch = scanner.nextLine().trim();

        List<Person> matches = people.stream()
                .filter(ppl -> ppl.getFirstName().equalsIgnoreCase(nameSearch)
                || ppl.getLastName().equalsIgnoreCase(nameSearch))
                .collect(Collectors.toList());
        

//        for( Person person : people){
//            if (person.getFirstName().equalsIgnoreCase(nameSearch)
//                    || person.getLastName().equalsIgnoreCase(nameSearch)) {
//                matches.add(person);
//            }
//        }

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
