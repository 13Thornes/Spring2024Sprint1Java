import java.util.ArrayList;

// Initialize Library lists
public class Library {
 ArrayList<Book> bookList = new ArrayList<Book>();
 ArrayList<Periodical> periodicalList = new ArrayList<Periodical>();
 ArrayList<Patron> patronList = new ArrayList<Patron>();
 ArrayList<Author> authorList = new ArrayList<Author>();

 // Create Constructors
 public Library() {
    ArrayList<Book> bookList = new ArrayList<Book>();
    ArrayList<Periodical> periodicalList = new ArrayList<Periodical>();
    ArrayList<Patron> patronList = new ArrayList<Patron>();
    authorList = new ArrayList<Author>();
 }

 public Library(Book book) {
   bookList.add(book);
 }

 public Library(Periodical periodical) {
    periodicalList.add(periodical);
    
 }

 public Library(Patron patron) {
    patronList.add(patron);
 }

 public Library(Book book, Periodical periodical, Patron patron, Author author) {
    bookList.add(book);
    periodicalList.add(periodical);
    patronList.add(patron);
    authorList.add(author);
 }


 // Getters and Setters
 public ArrayList<Book> getBookList() {
     return bookList;
 }

 public void setBookList(ArrayList<Book> bookList) {
     this.bookList = bookList;
 }

 public ArrayList<Patron> getPatronList() {
     return patronList;
 }

 public void setPatronList(ArrayList<Patron> patronList) {
     this.patronList = patronList;
 }

 public ArrayList<Periodical> getPeriodicalList() {
     return periodicalList;
 }

 public void setPeriodicalList(ArrayList<Periodical> periodicalList) {
    this.periodicalList = periodicalList;
}

public ArrayList<Author> getAuthorList() {
    return authorList;
}

public void setAuthorList(ArrayList<Author> authorList) {
    this.authorList = authorList;
}


// Add and Remove from lists

public void addBook(Book book) {
    if (bookList.contains(book)) {
        System.out.println("This book is already in the library");
    } else {
        bookList.add(book);
        System.out.println("Book added");
    }

    }

    public void addAuthor(Author author){
        if (authorList.contains(author)) {
            System.out.println("This author is already in the library");
        } else {
            authorList.add(author);
            System.out.println("Author added");
        }
    }

public void removeBook(Book book) {
    if (bookList.contains(book)) {
        bookList.remove(book);
        System.out.println("Book removed");
    } else {
        System.out.println("This book was not in the library");
    }
}

public void addPeriodical(Periodical periodical) {
    if (periodicalList.contains(periodical)) {
        System.out.println("This periodical is already in the library");
    } else {
        periodicalList.add(periodical);
        System.out.println("Periodical added");
    }

    }

public void removePeriodical(Periodical periodical) {
    if (periodicalList.contains(periodical)) {
        periodicalList.remove(periodical);
        System.out.println("Periodical removed");
    } else {
        System.out.println("This periodical was not in the library");
    }
}

public void addPatron(Patron patron) {
    if (patronList.contains(patron)) {
        System.out.println("This periodical is already in the library");
    } else {
        patronList.add(patron);
        System.out.println("Patron added");
    }

    }

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

