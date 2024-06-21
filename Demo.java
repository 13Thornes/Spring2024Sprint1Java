public class Demo {
    public static void main(String[] args) {
        Author a1 = new Author("Cindy Newman", "12-01-1925");
        Book b1 = new Book(123, "Hello", a1, "A2H357", "Publish", 2, "EBook", "Fiction");
        Periodical p1 = new Periodical(456, "Bye", a1, "1h4s9o", "Company", 3, "Magazine", "45");
        Patron pa1 = new Patron(234, "Katherine Wall", "123 Main st", "1234567890");

        Library l1 = new Library(b1, p1, pa1);

        System.out.println(l1.toString());

        


    }
}
