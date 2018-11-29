package lamExp_StreamAPI;

import object.basics.Author;
import object.basics.Book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("B", new Author("AA", "BB"), 450),
                new Book("C", new Author("AA", "BC"), 2000.5),
                new Book("D", new Author("DD", "Ab"), 499),
                new Book("E", new Author("DD", "DD"), 455),
                new Book("A", new Author("AA", "BB"), 100.d),
                new Book("F", new Author("FF", "FF"), 450),
                new Book("G", new Author("aa", "aa"), 1500)
        );
        //task 1
        System.out.println("task1");
        Optional<Book> highestPrice = books.stream().
                max(Comparator.comparingDouble(Book::getPrice));
        Book book;
        if (highestPrice.isPresent()) {
            book = highestPrice.get();
            System.out.println(book.getPrice());
        } else {
            System.out.println("we haven't books");
        }
        //task2
        System.out.println("\ntask2");
        int NUMBER_AUTHOR = 0;
        String authorBooks = books.stream().
                filter(a -> books.get(NUMBER_AUTHOR).getAuthor().isEquals(a.getAuthor())).
                map(Book::getTitle).collect(Collectors.joining(" "));
        System.out.println(authorBooks);

        //task3
        System.out.println("\ntask3");
        List<Book> sortedBooks = books.stream()
                .sorted(new Compare())
                .collect(Collectors.toList());
        System.out.println(sortedBooks);

        //task4
        System.out.println("\ntask4");
        double totalPrice = books.stream().
                map(Book::getPrice).mapToDouble(Double::doubleValue).sum();
        System.out.println("TotalPrice " + totalPrice);
    }

    public static class Compare implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            if (o1.getAuthor().isEquals(o2.getAuthor())) {
                return 0;
            } else if (String.CASE_INSENSITIVE_ORDER.compare(o1.getAuthor().getLastName(), o2.getAuthor().getLastName()) != 0)
                return String.CASE_INSENSITIVE_ORDER.compare(o1.getAuthor().getLastName(), o2.getAuthor().getLastName());
            else
                return String.CASE_INSENSITIVE_ORDER.compare(o1.getAuthor().getFirstName(), o2.getAuthor().getFirstName());
        }
    }

}
