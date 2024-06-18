public class Demo {
    public static void main(String[] args) {
        Author a1 = new Author("Cindy Newman", "12-01-1925", "The world of fungus");

        System.out.println(a1.getBooks());

        a1.addBook("The Mushroom Palace");

        System.out.println(a1.getBooks());

        a1.removeItem("The Mushroom Palace");

        System.out.println(a1.getBooks());
    }
}
