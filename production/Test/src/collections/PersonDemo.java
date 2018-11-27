package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonDemo {



    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            persons.add(new Person(i, "Elena" + i));
        }
        Collections.shuffle(persons);
        System.out.println(persons);

        Collections.sort(persons);
        int NUMBER_OF_INSERT = 3;
        persons.set(NUMBER_OF_INSERT, new Person(20, "Elena20"));
        System.out.println("\nList after Collections.sort. Works method compare interface Comparator (parameter of sort at first name after age)\n" + persons);
        Collections.shuffle(persons);

        Person.bubbleSort(persons);

        System.out.println("\nList after bubble sort. Works method compareTo interface Comparable (parameter of sort is only age)\n" + persons);
        List<Person> persons2 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            persons2.add(new Person(i, "Elena" + i));
        }
        System.out.println("list persons equally list persons? " + Person.isEqual(persons, persons));
        System.out.println("list persons equally list persons2? " + Person.isEqual(persons, persons2));

        for (int i = 0; i < 6; i++) {
            persons.add(persons.get(i));
        }
        Person.Compare compare  = new Person.Compare();//created new exemplar static nested classes.
        System.out.println(" person0 equally person0? " + compare.compare(persons.get(0),persons.get(0)));
        System.out.println(" person0 equally person1? " + compare.compare(persons.get(0),persons.get(1)));

        System.out.println(persons);
        persons = Person.getUniquePerson(persons);
        System.out.println("Got unique list " + persons);
    }
}
