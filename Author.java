// Project: Sprint 1 Java, Library System
// Author: Luke Peddle, Micheal Walsh, Samantha Thorne
// Date: June 18-? 2024

// Import required library
import java.util.ArrayList;

public class Author {
        // Initialize variables
    public String name;
    public String DOB;
    public ArrayList<LibaryItem> writtenList = new ArrayList<LibaryItem>();

    // Create constructors
    public Author(String n, String d) {
        this.name = n;
        this.DOB = d;  
    }
    public Author() {
         
    }
    
    public Author(String n, String d, LibaryItem bt) {
        this.name = n;
        this.DOB = d;
        writtenList.add(bt);

    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String d) {
        this.DOB = d;
    }

    public String getWrittenList() {
        return writtenList.toString();
    }

    public void setWrittenList(LibaryItem i) {
        writtenList.add(i);
    }

    // Add/remove book from WrittenList

    public void addWrittenItem(LibaryItem  b) {
        if (this.writtenList.contains(b)) {
            System.out.println("Item already in list");
        } else {
            writtenList.add(b);
            System.out.println("Item added to list");
        }
    }

    public void removeWrittenItem(LibaryItem item) {
        if (this.writtenList.contains(item)) {
            writtenList.remove(item);
            System.out.println("Item removed from list");
    }

    }

    // toString() 
    public String toString() {
        return "Name: " + this.name + ", DOB: " + this.DOB + ", Works: " + this.writtenList.toString();
    
    }
    
    }
    

