public class Book extends LibaryItem {
    private String type;
    private String genre;

    public Book (int itemID, String title, Author author, String isbn, String publisher, int copyNum,String type, String genre){
        super(itemID, title, author, isbn, publisher, copyNum);
        this.type = type;
        this.genre = genre;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
   
        return (super.toString() + " Book[Type= " + type + ", Genre= " + genre + "]");
    }
}
