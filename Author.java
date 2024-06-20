// Project: Sprint 1 Java, Library System
// Author: Luke Peddle, Micheal Walsh, Samantha Thorne
// Date: June 18-? 2024

// Import required library
import java.util.ArrayList;

public class Author {
        // Initialize variables
    String name;
    String DOB;
    ArrayList<String> itemList;

    // Create constructors
    public Author() {
        this.name = "Default";
        this.DOB = "Default";
    }

    public Author(String n, String d, String i) {
        this.name = n;
        this.DOB = d;
        this.itemList.add(i);
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    public String getBooks() {
        return itemList.toString();
    }

    // Setters 

    public void setName(String n) {
        this.name = n;
    }

    public void setDOB(String d) {
        this.DOB = d;
    }

    public void setBookList(String b) {
        if (this.itemList == null) {
            this.itemList = new ArrayList<String>();
        } else {
        this.itemList.add(b);
    }}

    // Add/remove book from bookList

    public void addBook(String b) {
        if (this.itemList.contains(b)) {
            System.out.println("Item already in list");
        } else {
            this.itemList.add(b);
            System.out.println("Item added to list");
        }
    }

    public void removeItem(String item) {
        if (this.itemList.contains(item)) {
            itemList.remove(item);
    }

    }

    // toString() 
    public String toString() {
        return "Name: " + this.name + ", DOB: " + this.DOB + ", Works: " + this.itemList.toString();
    
    }
    
    }
    

