import java.util.ArrayList;
import java.util.Scanner;

public class LibaryItem {
    private int itemID;
    private String title;
    private Author author;
    private String isbn;
    private String publisher;
    private int copyNum;
    private int borrowAmount = 0;
    


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

    public int getBorrowAmount() {
        return borrowAmount;
    }

    // toString()

    public String toString() {

        return ("Library Item[ID= " + itemID + ", Title= " + title + ", Author= " + author.getName() + ", ISBN= " + isbn + " Publisher= " + publisher + ", Copies= " + copyNum +"]");
    }

    // Borrow and Return book

    public void Borrow(Patron p) {
        
        if(borrowAmount == copyNum){
            System.out.println(title + " is currently unaviable");
        }

        else{

            p.addBorrowedItem(this);
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
