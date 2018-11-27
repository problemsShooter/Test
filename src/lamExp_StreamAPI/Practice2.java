package lamExp_StreamAPI;

import object.basics.Author;
import object.basics.Book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Practice2 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("A", new Author("AA","AA"),100.d),
                new Book("B", new Author("BB","BB"),450),
                new Book("C", new Author("CC","CC"),2000),
                new Book("D", new Author("DD","DD"),499),
                new Book("E", new Author("EE","EE"),455),
                new Book("F", new Author("FF","FF"),450),
                new Book("G", new Author("GG","GG"),1500)
        );
        //task 1
        System.out.println("task1");
        Optional<Book> highestPrice = books.stream().
                max(Comparator.comparingDouble(Book::getPrice));

        if (highestPrice.isPresent()) {
            System.out.println(highestPrice.get().getPrice());
        }
        else {
            System.out.println("we haven't books");
        }



    }
}
