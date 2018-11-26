package object.basics;


    public class BookDemo {

    public static void main(String []args){

        Book book = new Book("Developing Java Software", new Author("Russel","Winderand"), 79.75);
        book.showInfo();
    }
}
