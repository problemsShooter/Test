package object_basics;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printName(){
        System.out.printf("Full name of author is %s %s\n", firstName, lastName);
    }
    public String getFullName(){
       return firstName +" "+ lastName;
    }
}
