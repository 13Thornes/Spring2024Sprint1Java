
import java.util.ArrayList;
import java.util.Scanner;



public class Demo {

    
    
        

    
    public static void addBook(Library l)
{ Scanner scanner = new Scanner(System.in);
    String itemType;
    String choice;
    System.out.println("Is the libary Item a book or peridoical(B, P): ");
    itemType = scanner.next();

    System.out.println(itemType);

    if(itemType.equals("B") ){
        System.out.println("Is the author of the libary item already in the system?(Y,N)?");
        choice = scanner.next();
        if(choice.equals("N")){
            String name;
            String DOB;

            System.out.println("Please enter the Author's full name.");
            name = scanner.next();

            System.out.println("Please enter the Author's date of birth");

            DOB = scanner.next();

             Author a = new Author(name, DOB);

             l.addAuthor(a);

            int itemID;
            String title;
            String ISBN;
            String publisher;
            int copyNum;
            String type;
            String genre;

            System.out.println("Enter the Item Id");

            itemID = scanner.nextInt();

            System.out.println("Enter the title");

            title = scanner.next();

            System.out.println("Enter the ISBN");

            ISBN = scanner.next();

            System.out.println("Enter the publisher");

            publisher = scanner.next();

            System.out.println("Enter the number of copies on hand");

            copyNum = scanner.nextInt();

            System.out.println("Enter the type of book(P,E,A)");

            type = scanner.next();

            if(type.equals("P") || type.equals("E")  || type.equals("AS")){
                System.out.println("Enter the genre");

            genre = scanner.next();

            Book b= new Book( itemID,title, a, ISBN, publisher, copyNum, type, genre);
            l.addBook(b);
            }

            else{
            
                System.out.println("Invalid Input");
            }
            

        }

        else if(choice.equals("Y")){

            boolean valid = false;
            System.out.println("Please enter the authors full name");
            String authorName = scanner.next();
            Author a1 = new Author();

            ArrayList<Author> authorList = new ArrayList<Author>();

            authorList = l.getAuthorList();

            for (Author a : authorList) {
                if (a.getName().equals(authorName));
                {
                    valid = true;

                    a1 = a;
                }
              }

              if(valid == false){
                System.out.println("Author is not in the database");
              }

        else{
            int itemID;
            String title;
            String ISBN;
            String publisher;
            int copyNum;
            String type;
            String genre;

            System.out.println("Enter the Item Id");

            itemID = scanner.nextInt();

            System.out.println("Enter the title");

            title = scanner.next();

            System.out.println("Enter the ISBN");

            ISBN = scanner.next();

            System.out.println("Enter the publisher");

            publisher = scanner.next();

            System.out.println("Enter the number of copies on hand");

            copyNum = scanner.nextInt();

            System.out.println("Enter the type of book(P,E,A)");

            type = scanner.next();

            if(type != "P" && type !="E"  && type != "A"){
                System.out.println("Invalid Input");
            }

            else{
            System.out.println("Enter the genre");

            genre = scanner.next();

            Book b = new Book( itemID, title, a1, ISBN,publisher,copyNum, type, genre);

            l.addBook(b);


            }
        }
        }

        else{
            System.out.println("Invalid Input");
        }

    }

    else if(itemType.equals("P")){

        
        
        System.out.println("Is the author of the libary item already in the system?(Y,N)?");
        choice = scanner.next();
        if(choice.equals("N")){
            String name;
            String DOB;

            System.out.println("Please enter the Author's full name.");
            name = scanner.next();

            System.out.println("Please enter the Author's date of birth");

            DOB = scanner.next();

             Author a = new Author(name, DOB);

             l.addAuthor(a);

            int itemID;
            String title;
            String ISBN;
            String publisher;
            int copyNum;
            String type;
            String issueNum;

            System.out.println("Enter the Item Id");

            itemID = scanner.nextInt();

            System.out.println("Enter the title");

            title = scanner.next();

            System.out.println("Enter the ISBN");

            ISBN = scanner.next();

            System.out.println("Enter the publisher");

            publisher = scanner.next();

            System.out.println("Enter the number of copies on hand");

            copyNum = scanner.nextInt();

            System.out.println("Enter the type of peridoical(P,E,A)");

            type = scanner.next();

            if(type != "P" && type !="E"){
                System.out.println("Invalid Input");
            }

            else{
            System.out.println("Enter the Issue Number");

            issueNum = scanner.next();

            Periodical p = new Periodical( itemID, title,  a, ISBN, publisher, copyNum, type, issueNum);
            l.addPeriodical(p);


            }
            

        }

        else if(choice.equals("Y")){

            boolean valid = false;
            System.out.println("Please enter the authors full name");
            String authorName = scanner.next();

            ArrayList<Author> authorList = new ArrayList<Author>();
            Author a1 = new Author();
            authorList = l.getAuthorList();

            for (Author a : authorList) {
                if (a.getName().equals(authorName));
                {
                    valid = true;

                    a1 = a;
                }
              }

              if(valid == false){
                System.out.println("Author is not in the database");
              }

        else{

            
            int itemID;
            String title;
            String ISBN;
            String publisher;
            int copyNum;
            String type;
            String issueNum;

            System.out.println("Enter the Item Id");

            itemID = scanner.nextInt();

            System.out.println("Enter the title");

            title = scanner.next();

            System.out.println("Enter the ISBN");

            ISBN = scanner.next();

            System.out.println("Enter the publisher");

            publisher = scanner.next();

            System.out.println("Enter the number of copies on hand");

            copyNum = scanner.nextInt();

            System.out.println("Enter the type of Perodical(P,E)");

            type = scanner.next();

            if(type != "P" && type !="E"  ){
                System.out.println("Invalid Input");
            }

            else{
            System.out.println("Enter the Issue Number");

            issueNum = scanner.next();

            Periodical p = new Periodical( itemID, title,  a1, ISBN, publisher, copyNum, type, issueNum);
            l.addPeriodical(p);


            }
        }
        }

        else{
            System.out.println("Invalid Input");
        }
    }

    else{
        System.out.println("Invalid Input");
    }
    
}

public static void editItem(Library l){
    boolean valid = false;
    Scanner scanner = new Scanner(System.in);
    String itemName;
    String itemType;
    System.out.println("Enter the type of Item(B,P)");
    itemType = scanner.next();

    if(itemType.equals("B")){
    System.out.println("Enter the Name of the Book you want to edit");
        
    itemName = scanner.next();


    ArrayList<Book> bList;
    bList = l.getBookList();
    for (Book b : bList) {
        if (b.getTitle().equals(itemName))
        {
            valid = true;
            System.out.println("Enter the Item ID");
            b.setItemID(scanner.nextInt());

            System.out.println("Enter the title");
            b.setTitle(scanner.next());

            System.out.println("Enter the Item ISBN");
            b.setIsbn(scanner.next());

            System.out.println("Enter the amount of copies");
            b.setCopyNum(scanner.nextInt());
        }
      }

      if(valid == false){
        System.out.println("Book does not exist");
      }
    }
     else if(itemType.equals("P")){
      System.out.println("Enter the Name of the Periodical you want to edit");
  
      itemName = scanner.next();
  
  
      ArrayList<Periodical> pList;
      pList = l.getPeriodicalList();
      for (Periodical p : pList) {
          if (p.getTitle().equals(itemName));
          {
              valid = true;
              System.out.println("Enter the Item ID");
              p.setItemID(scanner.nextInt());
  
              System.out.println("Enter the title");
              p.setTitle(scanner.next());
  
              System.out.println("Enter the Item ISBN");
              p.setIsbn(scanner.next());
  
              System.out.println("Enter the amount of copies");
              p.setCopyNum(scanner.nextInt());
          }
        }
  
        if(valid == false){
          System.out.println("Periodical does not exist");
        }
    }

    else{
        System.out.println("Invalid input");
    }
    }

    public static void main(String[] args) {
        Author a1 = new Author("Cindy Newman", "12-01-1925");
        Book b1 = new Book(123, "Hello", a1, "A2H357", "Publish", 2, "EBook", "Fiction");
        Periodical p1 = new Periodical(456, "Bye", a1, "1h4s9o", "Company", 3, "Magazine", "45");
        Patron pa1 = new Patron(234, "Katherine Wall", "123 Main st", "1234567890");

        
        Library l = new Library(b1, p1, pa1, a1);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome to the Library Management System");
            System.out.println("1. Add Library Item");
            System.out.println("2. Edit Library Item");
            System.out.println("3. Delete Library Item");
            System.out.println("4. Borrow Library Item");
            System.out.println("5. Return Library Item");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Adding a new library item...");
                    addBook(l);
                    System.out.println(l.toString());
                    break;
                case 2:
                    System.out.println("Editing an existing library item...");
                    editItem(l);
                    System.out.println(l.toString());
                    break;
                case 3:
                    System.out.println("Deleting a library item...");
                    // Add logic to delete a library item
                    break;
                case 4:
                    System.out.println("Borrowing a library item...");
                    // Add logic to borrow a library item
                    break;
                case 5:
                    System.out.println("Returning a library item...");
                    // Add logic to return a library item
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();


    }
}
