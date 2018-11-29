package collections;

import java.util.*;

public class Person implements Comparable<Person> {
    private Integer age;
    private String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            if (age.equals(person.age) && name.equals(person.name) )
                return true;
            else return false;
        }
        return false;

    }

    @Override
    public int compareTo(Person person) {
        return age - person.age;
    }

    public static List<Person> getUniquePersons(List<Person> persons) {
        TreeSet<Person> personTreeSet = new TreeSet<>(persons);
        return new ArrayList<>(personTreeSet);
    }

    @Override
    public String toString() {
        return name;
    }

    public static class Compare implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            if (person1.name.equals(person2.name)) {
                return person1.compareTo(person2);
            } else return String.CASE_INSENSITIVE_ORDER.compare(person1.name, person2.name);
        }
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
