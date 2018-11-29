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
    public int compareTo(Person person) {
        return age - person.age;
    }

    public static boolean isEqual(List<Person> list1, List<Person> list2) {
        if (list1.size() != list2.size()) return false;
        else {
            Compare compare = new Compare();
            bubbleSort(list1);
            bubbleSort(list2);
            for(int i = 0; i< list1.size(); i++){
                if(compare.compare(list1.get(i),list2.get(i))!=0)return false;
            }
        }
        return true;
    }

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

    public static List<Person> getUniquePerson(List<Person> persons) {
        TreeSet<Person> personTreeSet = new TreeSet<>(persons);
        List<Person> newList = new ArrayList<>(personTreeSet);
        return newList;
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
