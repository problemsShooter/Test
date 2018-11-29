package lamExp_StreamAPI;

import collections.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person(12, "Tom"),
                new Person(29, "Jon"),
                new Person(15, "Josh"),
                new Person(22, "Teresa"),
                new Person(45, "Teresa"),
                new Person(47, "Jon"),
                new Person(36, "Leo"),
                new Person(66, "Martin"),
                new Person(74, "Fernando"),
                new Person(98, "Katrina"),
                new Person(8, "Donald"),
                new Person(3, "Mat"));

        //task1
         System.out.println("Task1");
        List<String> workableNames = persons.stream().
                        filter(a->a.getAge()>=20 && a.getAge()<=30).
                map(Person::getName).
                collect(Collectors.toList());
        workableNames.forEach(System.out::println);

        //task2
        System.out.println("\nTask2");
        Set<String> uniquePerson = persons.stream().
                map(Person::getName).
                collect(Collectors.toSet());
        uniquePerson.forEach(System.out::println);

//        //task3
        System.out.println("\nTask3");
        List<String> upperNames = new ArrayList<>();
        persons.stream().
                map(Person::getName).
                forEach(a -> upperNames.add(a.toUpperCase()));
        upperNames.forEach(System.out::println);

        //task4
        System.out.println("\nTask4");
        List<String> sortedNames = new ArrayList<>();
        persons.
                stream().
                sorted(Comparator.comparing(length -> length.getName().length())).
                map(Person::getName).
                forEach(sortedNames::add);
        sortedNames.forEach(System.out::println);
    }
}
