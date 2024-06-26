
/**
 * @author Samantha Throne
 * @version 1.00
 * */ 

public class Book extends LibaryItem {

    /**
     * repersents the type of the Book Object
     */
    private String type;
    /**
     * repersents the genre of the Book Object
     */
    private String genre;

    /**
     * 
     * @param itemID accepts the item ID and set it to the Book object
     * @param title accepts the title and set it to the Book object
     * @param author accepts the author and set it to the Book object
     * @param isbn accepts the isbn and set it to the Book object
     * @param publisher accepts the publisher and set it to the Book object
     * @param copyNum accepts the copy number and set it  to the Book object
     * @param type accepts the type and set it to the Book Object
     * @param genre accepts the genre and set it to the Book object
     */

public class Book extends LibaryItem {
    public String type;
    public String genre;


    public Book (int itemID, String title, Author author, String isbn, String publisher, int copyNum,String type, String genre){
        super(itemID, title, author, isbn, publisher, copyNum);
        this.type = type;
        this.genre = genre;
    }

    /**
     * Creates a null Book object
     */
    public Book(){
        super();
    }

    /**
     * 
     * @return return the type of the Book object
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type accepts type and set it to the Book Object
     */


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


    /**
     * 
     * @return returns the genre of the Book object
     */

    public String getGenre() {
        return this.genre;
    }


    /**
     * 
     * @param genre acceptes the genre and set it to the Book object
     */

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
   
        return (super.toString() + " Book[Type= " + type + ", Genre= " + genre + "]");
    }
}
