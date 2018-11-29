package object_basics;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Dogs {
    String name;
    Size size;
    int age;

    public Dogs() {
        name = generateName();
        size = generateSize();
        age = generateAge();
    }

    public Dogs(String name) {
        this();
        this.name = name;
    }

    public Dogs(Size size) {
        this();
        this.size = size;
    }

    public Dogs(int age) {
        this();
        this.age = age;
    }

    public Dogs(String name, Size size) {

        this(name);
        this.size = size;
    }

    public Dogs(Size size, int age) {
        this(size);
        this.age = age;
    }

    public Dogs(String name, int age) {
        this(name);
        this.age = age;
    }

    public Dogs(String name, Size size, int age) {
        this(name, size);
        this.age = age;
    }

    private int generateAge() {
        Random r = new Random();
        return r.nextInt(20);
    }

    static Size generateSize() {
        Random r = new Random();
        List<Size> list = Arrays.asList(Size.values());
        return list.get(r.nextInt(3));
    }

    private String generateName() {
        Random random = new Random();
        String name = "";
        char a;
        int k = random.nextInt(7);
        for (int i = 0; i < k; i++) {
            a = (char) (random.nextInt(26) + 97);
            name += a;
        }
        name += random.nextInt(100);
        return name;
    }

    private void equals(Dogs dog) {
        age = dog.age;
        size = dog.size;
        name = dog.name;
    }

    public static boolean equals(String str1, String str2) {
        return str1 == null ? str2 == null : str1.equals(str2);
    }

    public static void sortDogs(Dogs[] dogs, Integer param) {
        switch (param) {
            case 0:
                for (int i = 1; i < dogs.length; i++) {
                    boolean var = true;
                    for (int j = 0; j < dogs.length - i; j++) {
                        if (dogs[j].age > dogs[j + 1].age) {
                            Dogs a = new Dogs(dogs[j].name, dogs[j].size, dogs[j].age);
                            dogs[j].equals(dogs[j + 1]);
                            dogs[j + 1].equals(a);
                            var = false;
                        }
                    }
                    if (var) {
                        System.out.println("massive was sorted sort's bubble: ");
                        return;
                    }
                }
            case 1:
                for (int i = 1; i < dogs.length; i++) {
                    boolean var = true;
                    for (int j = 0; j < dogs.length - i; j++) {

                        if (dogs[j].name.compareTo(dogs[j + 1].name) > 0) {
                            Dogs a = new Dogs(dogs[j].name, dogs[j].size, dogs[j].age);
                            dogs[j].equals(dogs[j + 1]);
                            dogs[j + 1].equals(a);
                            var = false;
                        }
                    }
                    if (var) {
                        System.out.println("massive was sorted sort's bubble: ");
                        return;
                    }
                }
            case 2:
                for (int i = 1; i < dogs.length; i++) {
                    boolean var = true;
                    for (int j = 0; j < dogs.length - i; j++) {

                        if (dogs[j].size.getSize().compareTo(dogs[j + 1].size.getSize()) > 0) {
                            Dogs a = new Dogs(dogs[j].name, dogs[j].size, dogs[j].age);
                            dogs[j].equals(dogs[j + 1]);
                            dogs[j + 1].equals(a);
                            var = false;
                        }
                    }
                    if (var) {
                        System.out.println("massive was sorted sort's bubble: ");
                        return;
                    }
                }
            default:
                System.out.println("Massive wasn't sorted: ");
                break;
        }
    }

    public void showParam() {

        System.out.println("Dog's parameters Name " + name + " size " + size.getSize() + " and age: " + age + ";");
    }

    enum Size {

        BIG("Big"),
        MEDIUM("Medium"),
        SMALL("Small");
        private String size;

        Size(String size) {
            this.size = size;
        }

        public static Size size(int i) {
            switch (i) {
                case 0:
                    return BIG;
                case 1:
                    return MEDIUM;
                case 2:
                    return SMALL;
                default:
                    return Dogs.generateSize();
            }
        }

        public String getSize() {
            return size;
        }
    }
}

