package object.basics;


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
        //if (name.equals("")) this.name = generateName();
        //else
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

    public void showParam() {
        System.out.println("Dog's parameters Name " + name + " size " + size.getSize() + " and age: " + age + ";");
    }
}

enum Size {

    BIG("Big"),
    MEDIUM("Medium"),
    SMALL("Small");
    private String size;

    Size(String size) {
        this.size = size;
    }

    public static Size size(String i) {
        switch (i) {
            case "big":
                return BIG;
            case "medium":
                return MEDIUM;
            case "small":
                return SMALL;
            default:
                return Dogs.generateSize();
        }
    }

    public String getSize() {
        return size;
    }
}