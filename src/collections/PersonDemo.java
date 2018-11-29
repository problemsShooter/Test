package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonDemo {

    public static boolean isEqual(List<Person> list1, List<Person> list2) {
        if (list1.size() != list2.size()) return false;
        else {
            list1.sort(Person::compareTo);
            list2.sort(Person::compareTo);
            for (int i = 0; i < list1.size(); i++) {
                if (!list1.get(i).equals(list2.get(i))) return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 10; i++) persons.add(new Person(i, "Elena" + i));
        Collections.shuffle(persons);
        System.out.println(persons);

        Collections.shuffle(persons);
        Person.Compare compare = new Person.Compare();

        persons.sort(compare);
        System.out.println("\nList after Collections.sort. Works method compare interface Comparator (parameter of sort at first name after age)\n" + persons);
        persons.get(1).setAge(20);
        persons.get(1).setName(persons.get(2).getName());
        persons.get(2).setAge(25);
        Collections.shuffle(persons);
        Collections.sort(persons);
        System.out.println("\nSorted List. Works method compareTo interface Comparable (parameter of sort is only age)\n" + persons);

        List<Person> persons2 = new ArrayList<>();
        for (int i = 0; i < 15; i++) persons2.add(new Person(i, "Elena" + i));
        System.out.println("\nlist persons equally list persons? " + isEqual(persons, persons));
        System.out.println("list persons equally list persons2? " + isEqual(persons, persons2));

        for (int i = 0; i < 6; i++) persons.add(persons.get(i));
        System.out.println("\nperson0 equally person0? " + persons.get(0).equals(persons.get(0)));
        System.out.println("person0 equally person1? " + persons.get(0).equals(persons.get(1)) + "\n");

        System.out.println(persons);
        persons = Person.getUniquePersons(persons);
        System.out.println("Got list of unique persons " + persons);
    }
}
