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
    }

    public static boolean isEquel(List<Person> list1, List<Person> list2) {
        return list1.containsAll(list2);
    }

    public static List<Person> getUniqPerson(List<Person> persons) {
        TreeSet<Person> personTreeSet = new TreeSet<>(persons);
        List<Person> newList = new ArrayList<>(personTreeSet);
        return newList;
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
