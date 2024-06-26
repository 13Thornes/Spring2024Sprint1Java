import java.util.ArrayList;
/**
 * @author Samantha Throne
 * @version 1.00
 */
public class Patron {
    /**
     * repersents the ID of the patron
     */
    private int patronID;
    /**
     * repersents the name of the patron
     */
    private String name;
    /**
     * repersents the address of the patron
     */
    private String address;
    /**
     * repersents the phone number of the patron
     */
    private String phoneNum;
    /**
     * repersents a list of all the library items the patron has borrowed
     */
    public ArrayList<LibaryItem> borrowedList = new ArrayList<LibaryItem>();

    /**
     * create a Patron Object
     * @param patronID accepts patronID and set it to the Patron object
     * @param name accepts the name and set it to the Patron Object
     * @param address accepts the address and set it to the Patron object
     * @param phoneNum accepts the phoneNum and set it to the Patron object
     */
    public Patron(int patronID, String name, String address, String phoneNum) {
        this.patronID = patronID;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    /**
     * create a null Patron object
     */
    public Patron(){

    }
    /**
     * create a Patron Object
     * @param patronID accepts patronID and set it to the Patron object
     * @param name accepts the name and set it to the Patron Object
     * @param address accepts the address and set it to the Patron object
     * @param phoneNum accepts the phoneNum and set it to the Patron object
     * @param item accepts the item and set it o the Patron object
     */
    public Patron(int patronID, String name, String address, String phoneNum, LibaryItem item) {
        this.patronID = patronID;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        borrowedList.add(item);
    }

    /**
     * 
     * @return returns the patronID of the Patron object
     */
    public int getPatronID() {
        return patronID;
    }

    /**
     * 
     * @param patronID accepts patronID and set it to the Patron object
     */
    public void setPatronID(int patronID) {
        this.patronID = patronID;
    }

    /**
     * 
     * @return returns name of the Patron object
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name accepts name and set it to the Patron object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return returns address of the Patron object
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address accepts address and set it to the Patron object
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return returns the phoneNum of the Patron object
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 
     * @param phoneNum accepts phoneNum and set it to the Patron Object
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 
     * @return returns borrowedList of the Patron object
     */
    public ArrayList<LibaryItem> getBorrowedList() {
        return borrowedList;
    }

    /**
     * 
     * @param item accepts borrowedList and set it to the Patron object
     */
    public void setBorrowedList(ArrayList<LibaryItem> item) {
        borrowedList = item;
    }

    // Add/remove book from WrittenList

    /**
     * method to add a borrowed item to the borrowedItem list
     * @param i accepts LibaryItem i and adds it to borrowedList
     */
    public void addBorrowedItem(LibaryItem  i) {
        
            borrowedList.add(i);
            System.out.println("Item added to list");
        
    }

    /**
     * method to remove a borrowed library item
     * @param i accepts LibaryItem i and removes it from borrowedList
     */
    public void removeBorrowedItem(LibaryItem i) {
        if (this.borrowedList.contains(i)) {
            borrowedList.remove(i);
            System.out.println("Item removed from list");
    }

    }


 
    /**
     * @return returns all the data of the Patron object as a string
     */
     public String toString() {
        return "Patron " + patronID + "[Name= " + this.name + ", Address= " + this.address + ", Phone No.= " + phoneNum + ", Items Borrowed: " + this.borrowedList.toString();
    
    }
    
    }