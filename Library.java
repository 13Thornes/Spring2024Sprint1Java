import java.util.ArrayList;

// Initialize Library lists
/**
 * @author Samantha Throne
 * @version 1.00
 * */ 


public class Library {
    /**
     * represents the bookList ArrayList of the Library Object
     */
 private ArrayList<Book> bookList = new ArrayList<Book>();
 /**
     * represents the periodicalList ArrayList of the Library Object
     */
 private ArrayList<Periodical> periodicalList = new ArrayList<Periodical>();
 /**
     * represents the patronList ArrayList of the Library Object
     */
 private ArrayList<Patron> patronList = new ArrayList<Patron>();
 /**
     * represents the authorList ArrayList of the Library Object
     */
 private ArrayList<Author> authorList = new ArrayList<Author>();

 // Create Constructors
 /**
     * 
     * @param bookList accepts the bookList and set it to the Library object
     * @param periodicalList accepts the periodicalList and set it to the Library object
     * @param patronList accepts the patronList and set it to the Library object
     * @param authorList accepts the authorList and set it to the Library object
     */
 public Library() {
    ArrayList<Book> bookList = new ArrayList<Book>();
    ArrayList<Periodical> periodicalList = new ArrayList<Periodical>();
    ArrayList<Patron> patronList = new ArrayList<Patron>();
    authorList = new ArrayList<Author>();
 }

 /**
  * Method to add a book to the bookList in the Library object
  * @param book accepts a book to add to the bookList in the Library object
  */
 public Library(Book book) {
   bookList.add(book);
 }

/**
 * Method to add a periodical to the periodicalList in the Library object
 * @param periodical accepts a periodical to add to the periodicalList in the Library object
 */
 public Library(Periodical periodical) {
    periodicalList.add(periodical);
    
 }

 /**
  * Method to add a patron to the patronList in the Library object
  * @param patron accepts a patron to add to the patronList in the Library object
  */
 public Library(Patron patron) {
    patronList.add(patron);
 }

 /**
  * 
  * @param book accepts a book and set it to the Library object
  * @param periodical accepts a periodical and set it to the Library object
  * @param patron accepts a patron and set it to the Library object
  * @param author accepts an author and set it to the Library object
  */
 public Library(Book book, Periodical periodical, Patron patron, Author author) {
    bookList.add(book);
    periodicalList.add(periodical);
    patronList.add(patron);
    authorList.add(author);
 }


 // Getters and Setters
 /**
  * 
  * @return returns the bookList of the Library object
  */
 public ArrayList<Book> getBookList() {
     return bookList;
 }


 /**
  * 
  * @param bookList accepts bookList and set it to the Libary object
  */
 public void setBookList(ArrayList<Book> bookList) {
     this.bookList = bookList;
 }


 /**
  * 
  * @return returns the patronList of the Library object
  */
 public ArrayList<Patron> getPatronList() {
     return patronList;
 }


 /**
  * 
  * @param patronList accepts patronList and set it to the Libary object
  */
 public void setPatronList(ArrayList<Patron> patronList) {
     this.patronList = patronList;
 }


 /**
  * 
  * @return returns the periodicalList of the Library object
  */
 public ArrayList<Periodical> getPeriodicalList() {
     return periodicalList;
 }


 /**
  * 
  * @param periodicalList accepts periodicalList and set it to the Libary object
  */
 public void setPeriodicalList(ArrayList<Periodical> periodicalList) {
    this.periodicalList = periodicalList;
}



/**
 * 
 * @return returns the authorList of the Library object
 */
public ArrayList<Author> getAuthorList() {
    return authorList;
}


/**
 * 
 * @param authorList accepts authorList and set it to the Libary object
 */
public void setAuthorList(ArrayList<Author> authorList) {
    this.authorList = authorList;
}


// Add and Remove from lists
/**
 * 
 * @param book accepts book and adds it to bookList in the Libary object
 */
public void addBook(Book book) {
    if (bookList.contains(book)) {
        System.out.println("This book is already in the library");
    } else {
        bookList.add(book);
        System.out.println("Book added");
    }

    }


    /**
     * 
     * @param author accepts book and adds it to bookList in the Libary object
     */
    public void addAuthor(Author author){
        if (authorList.contains(author)) {
            System.out.println("This author is already in the library");
        } else {
            authorList.add(author);
            System.out.println("Author added");
        }
    }


    //Remove Author from system
    /**
     * 
     * @param author accepts author and removes it from the authorList in the Library Object
     */
    public void removeAuthor(Author author){
        if (authorList.contains(author)) {
            
            ArrayList<Book> removeBList = new ArrayList<Book>();
            ArrayList<LibaryItem> safeItem = new ArrayList<LibaryItem>();
            for(Book i: bookList){
                if(i.getAuthor().getName().equals(author.getName())){
                removeBList.add(i);
                }
            }

            
            for(Patron p: patronList){
                ArrayList<LibaryItem> iList = p.getBorrowedList();
                for(LibaryItem i: iList){
                    if(!i.getAuthor().getName().equals(author.getName())){
                        System.out.println("Enter");
                        safeItem.add(i);
                    }
                }
            }

            for(Book i: removeBList){
                this.removeBook(i);
            }
            ArrayList<Periodical> removePList = new ArrayList<Periodical>();
            for(Periodical i: periodicalList){
                if(i.getAuthor().getName().equals(author.getName())){
                removePList.add(i);
                }
            }
            for(Periodical i: removePList){
                this.removePeriodical(i);
            }
            for(Patron p: patronList){
                ArrayList<LibaryItem> iList = p.getBorrowedList();
                for(LibaryItem i: iList){
                    if(!i.getAuthor().getName().equals(author.getName())){
                        System.out.println("Enter");
                        safeItem.add(i);
                    }
                }
            }

            for(Patron p: patronList){
                p.setBorrowedList(safeItem);
            }
            authorList.remove(author);
            System.out.println("Author removed");
        } else {
            System.out.println("This Author was not in the library");
        }
    }

    /**
     * 
     * @param book accepts book and removes it from the bookList in the Library Object
     */
public void removeBook(Book book) {
    if (bookList.contains(book)) {
        bookList.remove(book);
        System.out.println("Book removed");
    } else {
        System.out.println("This book was not in the library");
    }
}

/**
 * 
 * @param periodical accepts periodical and adds it to the periodicalList in the Library Object
 */
public void addPeriodical(Periodical periodical) {
    if (periodicalList.contains(periodical)) {
        System.out.println("This periodical is already in the library");
    } else {
        periodicalList.add(periodical);
        System.out.println("Periodical added");
    }

    }

    /**
     * 
     * @param periodical accepts periodical and removes it from the periodicalList in the Library Object
     */
public void removePeriodical(Periodical periodical) {
    if (periodicalList.contains(periodical)) {
        periodicalList.remove(periodical);
        System.out.println("Periodical removed");
    } else {
        System.out.println("This periodical was not in the library");
    }
}

/**
 * 
 * @param patron accepts patron and adds it to the patronList in the Library Object
 */
public void addPatron(Patron patron) {
    if (patronList.contains(patron)) {
        System.out.println("This periodical is already in the library");
    } else {
        patronList.add(patron);
        System.out.println("Patron added");
    }

    }


    /**
     * 
     * @param patron accepts patron and removes it from the patronList in the Library Object
     */
public void removePatron(Patron patron) {
    if (patronList.contains(patron)) {
        patronList.remove(patron);
        System.out.println("Patron removed");
    } else {
        System.out.println("This patron was not in the library");
    }
}
public String toString() {
    return ("Library[Books=" + bookList.toString() + ", Periodicals= " + periodicalList.toString() + ", Patrons= " + patronList.toString()  + "]");
}
}
