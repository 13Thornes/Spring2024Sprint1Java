import java.util.ArrayList;

public class LibaryItem {
    public int itemID;
    public String title;
    public Author author;
    public String isbn;
    public String publisher;
    public int copyNum;
    public int borrowAmount = 0;
    public ArrayList<LibaryItem> itemList = new ArrayList<LibaryItem>();


    public LibaryItem(int itemID, String title, Author author, String isbn, String publisher, int copyNum){
        this.itemID = itemID;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.copyNum = copyNum;
    }
    public LibaryItem(){

    }
    // Getters and Setters

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String pub) {
        this.publisher = pub;
    }

    public int getCopyNum() {
        return copyNum;
    }

    public void setCopyNum(int copyNum) {
        this.copyNum = copyNum;
    }

    // toString()

    public String toString() {

        return ("Library Item[ID= " + itemID + ", Title= " + title + ", Author= " + author.name + ", ISBN= " + isbn + " Publisher= " + publisher + ", Copies= " + copyNum +"]");
    }

    // Borrow and Return book

    public void Borrow() {

        if(borrowAmount == copyNum){
            System.out.println(title + " is currently unaviable");
        }

        else{

            borrowAmount++;
    }
    }

    public void Return() {
        
        if(borrowAmount == 0){
            System.out.println(" There are currently no copies borrowed");
        }
        else{
            borrowAmount--;
        }
    }
    
}
