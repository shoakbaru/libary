// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Libary libary = new Libary();
        Book book = new Book("Shoakbar", "carslife_uz");
        libary.add(book, 1,"C1",1);
        System.out.println(book.getShelf());

//        String s = libary.getBooks(1,"C1");
//        System.out.println(s);

//        Boolean b = libary.contains(1,"C1",1,book);
//        System.out.println(b);

//        System.out.println("addBook => libaryBook " + addBookTest());


//        Book book = new Book("Shoakbar Umarov", "Carslife_uz");
//        System.out.println(book.getAuthor());
//        System.out.println(book.getTitle());
//        System.out.println(book);
    }
}