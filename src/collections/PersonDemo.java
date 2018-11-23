package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonDemo {

    public static void bubbleSort(List<Person> list) {
        for (int i = 1; i < list.size(); i++) {
            boolean var = true;
            for (int j = 0; j < list.size() - i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    Person person = new Person(list.get(j).getAge(), list.get(j).getName());
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, person);
                    var = false;
                }
            }
            if (var) {
                return;
            }
        }
    }

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

        bubbleSort(persons);

        System.out.println("\nList after bubble sort. Works method compareTo interface Comparable (parameter of sort is only age)\n" + persons);
        List<Person> persons2 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            persons2.add(new Person(i, "Elena" + i));
        }
        System.out.println("list persons equels list persons? " + Person.isEquel(persons, persons));
        System.out.println("list persons equels list persons2? " + Person.isEquel(persons, persons2));

        //persons.clone(persons);

        for (int i = 0; i < 6; i++) {
            persons.add(persons.get(i));
        }

        //System.out.println(persons.get(0).compare(persons.get(3),persons.get(1)));
        System.out.println(persons);
        Person.getUniqPerson(persons);
        System.out.println(persons);
    }
}
