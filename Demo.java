public class Demo {
    public static void main(String[] args) {
        Author a1 = new Author("Cindy Newman", "12-01-1925");
        Book b1 = new Book(123, "Hello", a1, "A2H357", "Publish", 2, "EBook", "Fiction");

        System.out.println(b1.toString());

        b1.Borrow();

        System.out.println(b1.toString());

        b1.Return();

        System.out.println(b1.toString());


    }
}
