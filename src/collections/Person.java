package collections;

import java.util.*;

public class Person implements Comparable<Person>, Comparator<Person> {
    private Integer age;
    private String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        return age - person.age;
        //return person.age.compareTo(this.age);
    }

    public static boolean isEquel(List<Person> list1, List<Person> list2) {
        return list1.containsAll(list2);
    }

    public static List<Person> getUniqPerson(List<Person> persons) {
        //HashSet<Person> personHashSet = new HashSet<>(persons);
        for (int i = 0; i < persons.size(); i++) {
            for (int j = 0; j < persons.size() - 1; j++) {
                if (persons.get(j).compare(persons.get(j),persons.get(j + 1)) == 0)
                    persons.remove(j + 1);
            }
        }
        return persons;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compare(Person person1, Person person2) {
        if (person1.name.equals(person2.name)) {
            return person1.compareTo(person2);
        } else return String.CASE_INSENSITIVE_ORDER.compare(person1.name, person2.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
