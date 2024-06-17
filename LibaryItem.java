public class LibaryItem {
    private String date;
    private Author author;


    public LibaryItem(String date, Author author){
        this.date = date;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString() {

        return ("Libary Item[ Date: "  + date + ", Author: " + author + "]");
    }
}
