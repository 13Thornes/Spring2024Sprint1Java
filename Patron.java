import java.util.ArrayList;

public class Patron {
    private int patronID;
    private String name;
    private String address;
    private String phoneNum;
    public ArrayList<LibaryItem> borrowedList = new ArrayList<LibaryItem>();

    public Patron(int patronID, String name, String address, String phoneNum) {
        this.patronID = patronID;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public Patron(int patronID, String name, String address, String phoneNum, LibaryItem item) {
        this.patronID = patronID;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        borrowedList.add(item);
    }

    public int getPatronID() {
        return patronID;
    }

    public void setPatronID(int patronID) {
        this.patronID = patronID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public ArrayList<LibaryItem> getBorrowedList() {
        return borrowedList;
    }

    public void setBorrowedList(LibaryItem item) {
        borrowedList.add(item);
    }

    // Add/remove book from WrittenList

    public void addBorrowedItem(LibaryItem  b) {
        
            borrowedList.add(b);
            System.out.println("Item added to list");
        
    }

    public void removeBorrowedItem(LibaryItem item) {
        if (this.borrowedList.contains(item)) {
            borrowedList.remove(item);
            System.out.println("Item removed from list");
    }

    }


     // toString() FIX THE STRING
     // SERIOUSLY FIX IT 
     public String toString() {
        return "Patron " + patronID + "[Name= " + this.name + ", Address= " + this.address + ", Phone No.= " + phoneNum + ", Items Borrowed: " + this.borrowedList.toString();
    
    }
    
    }
