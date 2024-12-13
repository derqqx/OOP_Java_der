public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Jo Nesbo", "Rødstrupe", 2000);
        Book book2 = new Book("Jo Nesbo", "Marekors", 2003);

        LibraryMember member = new LibraryMember(1001 , "Dancing Queen");

        Library library = new Library("Cherie");

        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();
        System.out.println("Library member: " + member);
    }
}