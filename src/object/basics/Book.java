package object.basics;

public class Book {

    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void showInfo(){
        System.out.printf("Book \"%s\" have author %s and price is %.2f\n", title, author.getFullName(), price);
    }

    @Override
    public String toString() {
        return author.getLastName()+" "+author.getFirstName();
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
