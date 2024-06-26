

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Luke Peddle
 * @version 1.00
 */
public class Demo {
    //Method to add an library item to the database
    //Method to remove item from data base
/**
 * Method to add a LibaryItem, Patron, or Author object
 * @param l accepts Library object to obtian lists
 */
    public static void addBook(Library l){ 
    Scanner scanner = new Scanner(System.in);
    String itemType = "";
    String choice = "";
    String itemChoice ="";
    boolean validInput = false;

    //Enter the type of data being added
    while(validInput == false){
        System.out.println("Enter the type of data being added(LB,P)");
        itemChoice = scanner.next();

        if(itemChoice.equals("LB") || itemChoice.equals("P")){
            validInput = true;
        }

        else{
            System.out.println("Invalid Input");
        }
    }

    validInput = false;

    //Enter if a Library item is being added
   if(itemChoice.equals("LB")){
    while(validInput == false){
    System.out.println("Is the libary Item a book or peridoical(B, P): ");
    itemType = scanner.next();

    if(itemType.equals("B")|| itemType.equals("P")){
        validInput = true;
    }

    else{
        System.out.println("Invalid input");
    }
    }

    validInput = false;
    if(itemType.equals("B") ){

        //Input wether the author is in the system or not
        while(validInput == false){
        System.out.println("Is the author of the libary item already in the system?(Y,N)?");
        choice = scanner.next();

        if(choice.equals("Y") || choice.equals("N")){
            validInput = true;
        }
        else{
            System.out.println("Invalid input");
        }
        }
        validInput = false;

        //Add the author to the system
        if(choice.equals("N")){
            String name;
            String DOB;
            

            System.out.println("Please enter the Author's full name.");
            name = scanner.next();

            System.out.println("Please enter the Author's date of birth");

            DOB = scanner.next();

             Author a = new Author(name, DOB);

             l.addAuthor(a);

             //Create the new book
            int itemID;
            String title;
            String ISBN;
            String publisher;
            int copyNum;
            String type = "";
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

            while(validInput == false){
                System.out.println("Enter the type of book(P,E,A)");
                type = scanner.next();
    
                if(type.equals("P") || type.equals("E")  || type.equals("A")){
                    validInput = true;
                }
    
                else{
               
                    
                    System.out.println("Invalid Input");
    
                }
            }
            validInput = false;

            System.out.println("Enter the genre");
            genre = scanner.next();

            //Create the object andd add it to the system
            Book b= new Book( itemID,title, a, ISBN, publisher, copyNum, type, genre);
            l.addBook(b);
            }
        
            //Enter if the author is in the system
        else if(choice.equals("Y")){

            boolean valid = false;
            Author a1 = new Author();
            String authorName = "";

            //Have the user enter the author's name
            while(validInput == false ){
                
            System.out.println("Please enter the authors full name");
            authorName = scanner.next();
            

            ArrayList<Author> authorList = new ArrayList<Author>();

            authorList = l.getAuthorList();

            for (Author a : authorList) {
                //If found the author, save it 
                if (a.getName().equals(authorName))
                {
                    valid = true;

                    a1 = a;
                }
              }

              if(valid == false){
                System.out.println("Author is not in the database");
              }

              else{
                validInput = true;
              }
            }
            validInput = false;
        
            //Create the data for the book
            int itemID;
            String title;
            String ISBN;
            String publisher;
            int copyNum;
            String type ="";
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

            
            while(validInput == false){
            System.out.println("Enter the type of book(P,E,A)");

            type = scanner.next();
            System.out.println(type);

            if(type.equals("P") || type.equals("E")  || type.equals("A")){
                validInput = true;
            }

            else{
           
                
                System.out.println("Invalid Input");

            }
        }
        validInput = false;
        System.out.println("Enter the genre");

        genre = scanner.next();

        //Create the book and store it in the system
        Book b = new Book( itemID, title, a1, ISBN,publisher,copyNum, type, genre);

        l.addBook(b);
        a1.addWrittenItem(b);
        }
        


    }

    //Enter if the publication is a periodical
    else if(itemType.equals("P")){

        //See if the author is already in the system
        while(validInput == false){
        
        System.out.println("Is the author of the libary item already in the system?(Y,N)?");
        choice = scanner.next();

        if(choice.equals("Y") || choice.equals("N")){
            validInput = true;
        }

        else{
            System.out.println("Invalid Input");
        }
        }
        validInput = false;
    


        //Enter if the author is not in the system
        if(choice.equals("N")){

            //Create the data for the author
            String name;
            String DOB;
            
            System.out.println("Please enter the Author's full name.");
            name = scanner.next();

            System.out.println("Please enter the Author's date of birth");

            DOB = scanner.next();

            //Create the author object

             Author a = new Author(name, DOB);

             l.addAuthor(a);

             //Create the data for the periodical
            int itemID;
            String title;
            String ISBN;
            String publisher;
            int copyNum;
            String type = "";
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

            while(validInput == false){
                System.out.println("Enter the type of book(P,E)");
    
                type = scanner.next();
                System.out.println(type);
    
                if(type.equals("P") || type.equals("E")){
                    validInput = true;
                }
    
                else{
               
                    
                    System.out.println("Invalid Input");
    
                }
            }
            validInput = false;

            System.out.println("Enter the issue number");
            issueNum = scanner.next();

            //Create the periodical
            Periodical p = new Periodical( itemID, title,  a, ISBN, publisher, copyNum, type, issueNum);
            l.addPeriodical(p);
            }

        //Enter if the author is already in the System
        else if(choice.equals("Y")){
            boolean valid = false;
            Author a1 = new Author();
            String authorName = "";

            //Have the user enter the author's name
            while(validInput == false ){
            System.out.println("Please enter the authors full name");
            authorName = scanner.next();
            

            ArrayList<Author> authorList = new ArrayList<Author>();

            authorList = l.getAuthorList();

            for (Author a : authorList) {
                //If found the author, save it 
                if (a.getName().equals(authorName))
                {
                    
                    valid = true;

                    a1 = a;
                }
              }

              if(valid == false){
                System.out.println("Author is not in the database");
              }

              else{
                validInput = true;
              }
            }
            validInput = false;

        

            //Create the data for the periodical
            int itemID;
            String title;
            String ISBN;
            String publisher;
            int copyNum;
            String type = "";
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

           
            while(validInput == false){
                System.out.println("Enter the type of periodical(P,E)");
    
                type = scanner.next();
                System.out.println(type);
    
                if(type.equals("P") || type.equals("E")){
                    validInput = true;
                }
    
                else{
               
                    
                    System.out.println("Invalid Input");
    
                }
            }
            validInput = false;

            System.out.println("Enter the issue number");
            issueNum = scanner.next();

            Periodical p = new Periodical( itemID, title,  a1, ISBN, publisher, copyNum, type, issueNum);
            l.addPeriodical(p);


            }
        }
    }

            //Enter if a patron is being added
            if(itemChoice.equals("P")){
                //Create the data for the new patron
                int pId;
                String name;
                String address;
                String phoneNum;
                String pType ="";
                System.out.println("Enter the patron Id");
                
                pId = scanner.nextInt();

                System.out.println("Enter the patron's name");
                name = scanner.next();

                System.out.println("Enter the patron's address");
                address = scanner.next();

                System.out.println("Enter the phone number");
                phoneNum = scanner.next();

                //Enter the type of patron
                while(validInput == false){
                System.out.println("Enter the type of patron(S,E)");
                
                pType = scanner.next();
                if(pType.equals("S") || pType.equals("E")){
                    validInput = true;
                }
        
                else{
                    System.out.println("Invalid Input");
                }
                }

                validInput = false;
                

                //Enter if the patron is a student
                if(pType.equals("S")){
                    int studentID;
                    String school;
                    int grade;
                    System.out.println("Enter the patron's Student ID");
                    studentID = scanner.nextInt();

                    System.out.println("Enter the patron's school");
                    school = scanner.next();

                    System.out.println("Enter the patron's grade");
                    grade = scanner.nextInt();

                    //Create a student object with the inputed data
                    Student s = new Student(pId,name,address,phoneNum,studentID, school, grade);
                    l.addPatron(s);
            
                }

                //Enter if the patron is a Employee
                else if(pType.equals("E")){
                        int empID;
                        String position;

                        System.out.println("Enter the employee ID");
                        empID = scanner.nextInt();

                        System.out.println("Enter the position");

                        position = scanner.next();

                        //Create an employee
                        Employee e = new Employee(pId,name,address,phoneNum,empID, position);
                        l.addPatron(e);
                }
            }
        }
        
       

//Method to remove item from data base
/**
 * Method to remove a LibaryItem, Patron, or Author object
 * @param l accepts Library object to obtian lists
 */
//Method to remove item from data base
public static void removeItem(Library l){
    boolean valid = false;
    boolean validInput = false;
    Scanner scanner = new Scanner(System.in);
    String itemName;
    String itemType = "";
    String choice = "";
    Book removeBook = new Book();

    //Have the user enter what type of item they wish to delete
    while(validInput == false){
        System.out.println("Enter the what type of item to be deleted (LB,P,A)");
        choice = scanner.next();

        if(choice.equals("LB") || choice.equals("P") || choice.equals("A")){
            validInput = true;
        }
        else{
            System.out.println("Invalid input");
        }
    }
    validInput = false;

    if(choice.equals("LB")){ 
    //Have the user enter they type of item
    while (validInput == false){
    System.out.println("Enter the type of Item(B,P)");
    itemType = scanner.next();

    if(itemType.equals("B") || itemType.equals("P")){
        validInput = true;
    }
    else{
        System.out.println("Invalid Input");
    }
    }
    validInput = false;

    //Enter if the item is a book
    if(itemType.equals("B")){

    //Search throught the books with the title

    
    System.out.println("Enter the Name of the Book you want to remove");
        
    itemName = scanner.next();


    ArrayList<Book> bList;
    bList = l.getBookList();
    for (Book b : bList) {
        if (b.getTitle().equals(itemName))
        {
            valid = true;
            removeBook = b;
            
        }
      }

      

      if(valid == false){
        System.out.println("Book does not exist");
      }
      else{
      //remove the book from the system
        l.removeBook(removeBook);
      }
    
    }
    //Enter if the item is a periodical
     else if(itemType.equals("P")){
        Periodical removeP = new Periodical();

        //Search the list for the periodical
        
      System.out.println("Enter the Name of the Periodical you want to remove");
      itemName = scanner.next();
        
  
  
      ArrayList<Periodical> pList;
      pList = l.getPeriodicalList();
      for (Periodical p : pList) {
          if (p.getTitle().equals(itemName))
          {
              valid = true;
             removeP = p;
          }
        }
  
        if(valid == false){
          System.out.println("Periodical does not exist");
        }
        
        else{
        //Remove the periodical from the list
        l.removePeriodical(removeP);
    }
        
    }
    }

    //Enter if a patron is being deleted
    else if(choice.equals("P")){
        Patron removePar = new Patron();
        validInput = false;
        //Enter the id of the patron to be deleted
       
            System.out.println("Enter the Patron's Id");
            int pId = scanner.nextInt();

            ArrayList<Patron> pList = l.getPatronList();

            for(Patron p: pList){

                if(p.getPatronID() == pId){
                    valid = true;
                    removePar = p;
                }
            }

            if (valid == false){
                System.out.println("Invalid Id");
            }

            else{
                validInput = true;
                ArrayList<LibaryItem> lbList = removePar.getBorrowedList();

                //Return the patrons books
                for(LibaryItem i: lbList){
                    i.Return();
                }

                //Remove the patron from the system
                l.removePatron(removePar);
            }
        

        

    }
    //Enter if an author is being removed
    else if( choice.equals("A")){
        Author removeA = new Author();
        //Search the System for the author
       
            System.out.println("Enter the author's name");
            String name = scanner.next();

            ArrayList<Author> aList = l.getAuthorList();

            for(Author a: aList){

                if(a.getName().equals(name)){
                    valid = true;
                    removeA = a;
                }
            }

            if (valid == false){
                System.out.println("Invalid Author");
            }

            else{
        //Remove the author from the system
        l.removeAuthor(removeA);
        }
    }
    }

/**
 * Method to edit a LibaryItem, Patron, or Author object
 * @param l accepts Library object to obtian lists
 */
    //Method to edit item
    public static void editItem(Library l){
        boolean valid = false;
        Scanner scanner = new Scanner(System.in);
        String itemName;
        Boolean validInput = false;
        String itemType ="";
        String iType = "";

        //Have the user enter what item type this wish to edit
        while(validInput == false){
            System.out.println("Enter what item type you wish to edit(LB,P,A)");
            iType = scanner.next();

            if(iType.equals("LB") || iType.equals("P") || iType.equals("A")){
                validInput = true;
            }

            else{
                System.out.println("Invalid Input");
            }
        }
        validInput = false;

        //Enter if an libray item is being edited
        if(iType.equals("LB")){
            while(validInput == false){
            System.out.println("Enter the type of Item(B,P)");
            itemType = scanner.next();
            
            
            if(itemType.equals("B") || itemType.equals("P")){
                validInput = true;
            }

            else{
                System.out.println("Invalid input");
            }
            }
            validInput = false;
            //Enter if the library item is a book
            if(itemType.equals("B")){
            System.out.println("Enter the Name of the Book you want to edit");
                
            itemName = scanner.next();
        
        
            ArrayList<Book> bList;
            bList = l.getBookList();
            for (Book b : bList) {
                //Edit the values
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
        
            //Enter if could not find the book
            if(valid == false){
                System.out.println("Book does not exist");
            }
            }
            //Enter if a periodical is being edited
            else if(itemType.equals("P")){
            System.out.println("Enter the Name of the Periodical you want to Edit");
        
            itemName = scanner.next();
        
        
            ArrayList<Periodical> pList;
            pList = l.getPeriodicalList();
            for (Periodical p : pList) {

                //Edit the values
                if (p.getTitle().equals(itemName))
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
        
                //Enter if could not find periodical
                if(valid == false){
                System.out.println("Periodical does not exist");
                }
            }
        }

        //Enter if the user wants to edit a patron
        else if (iType.equals("P")){
            int patronId;

            System.out.println("Enter the patron's ID");

            patronId = scanner.nextInt();

            ArrayList<Patron> pList;
            pList = l.getPatronList();
            for (Patron p : pList) {

                //Edit the values
                if (p.getPatronID() == patronId)
                {
                    valid = true;
                    System.out.println("Enter the patron ID");
                    p.setPatronID(scanner.nextInt());
        
                    System.out.println("Enter the patron name");
                    p.setName(scanner.next());
        
                    System.out.println("Enter the patron address");
                    p.setAddress(scanner.next());
        
                    System.out.println("Enter the patron phone number");
                    p.setPhoneNum(scanner.next());
                }
                }
        
                //Enter if could not find patron
                if(valid == false){
                System.out.println("Patron does not exist");
                }
            }

            //Enter if an author is being edited
            else if (iType.equals("A")){
                String name;
    
                System.out.println("Enter the Author's name");
    
                name = scanner.next();
    
                ArrayList<Author> aList;
                aList = l.getAuthorList();
                for (Author a : aList) {
    
                    //Edit the values
                    if (a.getName().equals(name))
                    {
                        valid = true;
                        System.out.println("Enter the Author's name");
                        a.setName(scanner.next());
            
                        System.out.println("Enter the Authors Date of birth");
                        a.setDOB(scanner.next());
            
                       
                    }
                    }
            
                    //Enter if could not find author
                    if(valid == false){
                    System.out.println("Author does not exist");
                    }
                }
        }
    /**
 * Method to search through LibaryItem Objects to borrow a LibaryItem object
 * @param l accepts Library object to obtian lists
 */
    //Method to borrow items
    public static void borrowItem(Library l){
        Scanner scanner = new Scanner(System.in);
        String type = "";
        boolean validInput = false;

        //Enter what search method to be sued
        while(validInput == false){
        System.out.println("Enter what search method you would like to use(T,A,I)");

        type = scanner.next();

        if(type.equals("T") || type.equals("A") || type.equals("I")){
            validInput = true;
        }

        else{
            System.out.println("Invalid Input");
        }
        }
        validInput = false;

        //Enter if searching by title
        if(type.equals("T")){
            String pubType ="";

            //Enter the type of library item
            while(validInput == false){
            System.out.println("Enter the name of the type of puplication that is being borrowed(B,P)");
            pubType = scanner.next();
            if(pubType.equals("B") || pubType.equals("P")){
                validInput = true;
            }
    
            else{
                System.out.println("Invalid Input");
            }
            }
            validInput = false;

            //Enter if the item is a book
            if(pubType.equals("B")){
                boolean valid = false;
                String title;
                System.out.println("Enter the title of the book");
                title = scanner.next();

                //Search the library for the book
                ArrayList<Book> bList = l.getBookList();
                for(Book b: bList){
                    //Enter if found the book
                    if(title.equals(b.getTitle())){
                    valid = true;
                    String borrow ="";
                    System.out.println(b.getTitle() + " " + b.getAuthor().getName() + " " + b.getIsbn() + " " + " Total copies: " + b.getCopyNum() + " Total copies currently available: " + (b.getCopyNum() - b.getBorrowAmount()));
                    while(validInput == false){
                    System.out.println("Do you wish to borrow this book?(Y,N)");
                    borrow = scanner.next();
                    
                    if(borrow.equals("Y") || borrow.equals("N")){
                        validInput = true;
                    }
            
                    else{
                        System.out.println("Invalid Input");
                    }
                    }
                    validInput = false;
                

                    //Enter if the user wants to borrow the book
                    if(borrow.equals("Y")){
                        String addPat = "";

                        //Have the user enter whether the patron is in the database or not
                        while(validInput == false){
                        System.out.println("Is the Patron already in the System?(Y,N)");
                        addPat = scanner.next();
                        if(addPat.equals("Y") || addPat.equals("N")){
                            validInput = true;
                        }
                
                        else{
                            System.out.println("Invalid Input");
                        }
                        }

                        validInput = false;
                        //Enter if the patron is already in the system
                        if(addPat.equals("Y")){
                            int pId;
                        System.out.println("Enter the patron's Id");
                        pId = scanner.nextInt();
                        ArrayList <Patron> pList = l.getPatronList();
                        boolean pValid = false;
                        for(Patron p: pList){
                            int amountCopies = 0;
                            if(pId == p.getPatronID()){
                            pValid = true;
                            boolean validCopies = false;

                            //Enter the amount of copies to be borrowed
                            while(validCopies == false){

                                System.out.println("Enter the amount of copies you wish to borrow");
                                amountCopies = scanner.nextInt();

                                if (amountCopies > (b.getCopyNum()-b.getBorrowAmount())){
                                    System.out.println("Cannot borrow this amount of copies");
                                    
                                }
                                else{
                                    validCopies = true;
                                }
                            }
                            for(int i =1;i<= amountCopies; i++){
                            b.Borrow(p);
                            }
                        }

                        if (pValid == false){
                            System.out.println("Patron does not exist");
                        }
                        }
                    }
                        else if(addPat.equals("N")){
                            int pId;
                            String name;
                            String address;
                            String phoneNum;
                            String pType ="";
                            int amountCopies = 0;
                            

                            System.out.println("Enter the patron Id");
                            
                            pId = scanner.nextInt();

                            System.out.println("Enter the patron's name");
                            name = scanner.next();

                            System.out.println("Enter the patron's address");
                            address = scanner.next();

                            System.out.println("Enter the phone number");
                            phoneNum = scanner.next();

                            //Enter the type of patron
                            while(validInput == false){
                            System.out.println("Enter the type of patron(S,E)");
                            
                            pType = scanner.next();
                            if(pType.equals("S") || pType.equals("E")){
                                validInput = true;
                            }
                    
                            else{
                                System.out.println("Invalid Input");
                            }
                            }
    
                            validInput = false;
                            

                            //Enter if the patron is a student
                            if(pType.equals("S")){
                                int studentID;
                                String school;
                                int grade;
                                System.out.println("Enter the patron's Student ID");
                                studentID = scanner.nextInt();

                                System.out.println("Enter the patron's school");
                                school = scanner.next();

                                System.out.println("Enter the patron's grade");
                                grade = scanner.nextInt();

                                //Create a student object with the inputed data
                                Student s = new Student(pId,name,address,phoneNum,studentID, school, grade);
                                l.addPatron(s);
                                boolean validCopies = false;

                                //Enter the amount of copies to be borrowed
                                while(validCopies == false){

                                System.out.println("Enter the amount of copies you wish to borrow");
                                amountCopies = scanner.nextInt();

                                if (amountCopies > (b.getCopyNum()-b.getBorrowAmount())){
                                    System.out.println("Cannot borrow this amount of copies");
                                    
                                }
                                else{
                                    validCopies = true;
                                }
                            }

                            //Borrow the books
                            for(int i =1;i<= amountCopies; i++){
                            b.Borrow(s);
                            }  
                            }

                            //Enter if the patron is a Employee
                            else if(pType.equals("E")){
                                 int empID;
                                 String position;

                                 System.out.println("Enter the employee ID");
                                 empID = scanner.nextInt();

                                 System.out.println("Enter the position");

                                 position = scanner.next();

                                 //Create an employee
                                 Employee e = new Employee(pId,name,address,phoneNum,empID, position);
                                 l.addPatron(e);
                                 
                                 boolean validCopies = false;

                                 //Enter the amount of copies to be borrowed
                            while(validCopies == false){

                                System.out.println("Enter the amount of copies you wish to borrow");
                                amountCopies = scanner.nextInt();

                                if (amountCopies > (b.getCopyNum()-b.getBorrowAmount())){
                                    System.out.println("Cannot borrow this amount of copies");
                                    
                                }
                                else{
                                    validCopies = true;
                                }
                            }

                            //Borrow the books
                            for(int i =1;i<= amountCopies; i++){
                            b.Borrow(e);
                            }
                            }

                            
                    }

                }

                //Enter if could not find book
                
                }
               
            }
            if (valid == false){
                System.out.println("Book is not in data base");
            }
        }
            //Enter if the item is a periodical
            else if (pubType.equals("P")){
                boolean valid = false;
                String title;

                //Enter the title of the periodical
                System.out.println("Enter the title of the periodical");
                title = scanner.next();

                ArrayList<Periodical> pList = l.getPeriodicalList();
                //Search the data base for the periodical
                for(Periodical p: pList){
                    //Enter if found the periodical
                    if(title.equals(p.getTitle())){
                    valid = true;
                    String borrow = "";
                    System.out.println(p.getTitle() + " " + p.getAuthor().getName() + " " + p.getIsbn() + " " + " Total copies: " + p.getCopyNum() + " Total copies currently available: " + (p.getCopyNum() + p.getBorrowAmount()));

                    //Enter if the user wants to borrow item
                    while(validInput == false){
                    System.out.println("Do you wish to borrow this periodical?(Y,N)");
                    borrow = scanner.next();

                    if(borrow.equals("Y") || borrow.equals("N")){
                        validInput = true;
                    }
            
                    else{
                        System.out.println("Invalid Input");
                    }
                    }
                    validInput = false;

                    if(borrow.equals("Y")){
                        String addPat = "";
                        //Have the user enter whether the patron is in the database or not
                        while(validInput == false){
                            System.out.println("Is the Patron already in the System?(Y,N)");
                            addPat = scanner.next();
                            if(addPat.equals("Y") || addPat.equals("N")){
                                validInput = true;
                            }
                    
                            else{
                                System.out.println("Invalid Input");
                            }
                            }
    
                            validInput = false;
                            //Enter if the patron is already in the system
                            if(addPat.equals("Y")){
                                int pId;
                            System.out.println("Enter the patron's Id");
                            pId = scanner.nextInt();
                            ArrayList <Patron> perList = l.getPatronList();
                            boolean pValid = false;
                            for(Patron per: perList){
                                int amountCopies = 0;
                                if(pId == per.getPatronID()){
                                pValid = true;
                                boolean validCopies = false;
    
                                //Enter the amount of copies to be borrowed
                                while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (p.getCopyNum()-p.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
                                for(int i =1;i<= amountCopies; i++){
                                p.Borrow(per);
                                }
                            }
    
                            if (pValid == false){
                                System.out.println("Patron does not exist");
                            }
                            }
                        }
                        else if(addPat.equals("N")){
                                int pId;
                                String name;
                                String address;
                                String phoneNum;
                                String pType ="";
                                int amountCopies = 0;
                                
    
                                System.out.println("Enter the patron Id");
                                
                                pId = scanner.nextInt();
    
                                System.out.println("Enter the patron's name");
                                name = scanner.next();
    
                                System.out.println("Enter the patron's address");
                                address = scanner.next();
    
                                System.out.println("Enter the phone number");
                                phoneNum = scanner.next();
    
                                //Enter the type of patron
                                while(validInput == false){
                                System.out.println("Enter the type of patron(S,E)");
                                
                                pType = scanner.next();
                                if(pType.equals("S") || pType.equals("E")){
                                    validInput = true;
                                }
                        
                                else{
                                    System.out.println("Invalid Input");
                                }
                                }
        
                                validInput = false;
                                
    
                                //Enter if the patron is a student
                                if(pType.equals("S")){
                                    int studentID;
                                    String school;
                                    int grade;
                                    System.out.println("Enter the patron's Student ID");
                                    studentID = scanner.nextInt();
    
                                    System.out.println("Enter the patron's school");
                                    school = scanner.next();
    
                                    System.out.println("Enter the patron's grade");
                                    grade = scanner.nextInt();
    
                                    //Create a student object with the inputed data
                                    Student s = new Student(pId,name,address,phoneNum,studentID, school, grade);
                                    l.addPatron(s);
                                    boolean validCopies = false;
    
                                    //Enter the amount of copies to be borrowed
                                    while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (p.getCopyNum()-p.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
    
                                //Borrow the periodicals
                                for(int i =1;i<= amountCopies; i++){
                                p.Borrow(s);
                                }  
                                }
    
                                //Enter if the patron is a Employee
                                else if(pType.equals("E")){
                                     int empID;
                                     String position;
    
                                     System.out.println("Enter the employee ID");
                                     empID = scanner.nextInt();
    
                                     System.out.println("Enter the position");
    
                                     position = scanner.next();
    
                                     //Create an employee
                                     Employee e = new Employee(pId,name,address,phoneNum,empID, position);
                                     l.addPatron(e);
                                     
                                     boolean validCopies = false;
    
                                    //Enter the amount of copies to be borrowed
                                while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (p.getCopyNum()-p.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
    
                                //Borrow the periodicals
                                for(int i =1;i<= amountCopies; i++){
                                p.Borrow(e);
                                }
                            }

                    }

                }

                
                }
                if (valid == false){
                    System.out.println("Periodical is not in data base");
                }
                }
                if (valid == false){
                    System.out.println("Periodical is not in data base");
                }
            }
        }

        //Enter if searching by ISBN
        if(type.equals("I")){
            String pubType ="";

            //Enter the type of library item
            while(validInput == false){
            System.out.println("Enter the name of the type of puplication that is being borrowed(B,P)");
            pubType = scanner.next();
            if(pubType.equals("B") || pubType.equals("P")){
                validInput = true;
            }
    
            else{
                System.out.println("Invalid Input");
            }
            }
            validInput = false;

            //Enter if the item is a book
            if(pubType.equals("B")){
                boolean valid = false;
                String isbn;
                //Enter the ISBN of the book
                System.out.println("Enter the ISBN of the book");
                isbn = scanner.next();

                ArrayList<Book> bList = l.getBookList();

                //Search the database for the book
                for(Book b: bList){
                    if(isbn.equals(b.getIsbn())){
                    valid = true;
                    String borrow ="";
                    System.out.println(b.getTitle() + " " + b.getAuthor().getName() + " " + b.getIsbn() + " " + " Total copies: " + b.getCopyNum() + " Total copies currently available: " + (b.getCopyNum() - b.getBorrowAmount()));

                    //Have the user input if the book is to be borrowed
                    while(validInput == false){
                    System.out.println("Do you wish to borrow this book?(Y,N)");
                    borrow = scanner.next();
                    
                    if(borrow.equals("Y") || borrow.equals("N")){
                        validInput = true;
                    }
            
                    else{
                        System.out.println("Invalid Input");
                    }
                    }
                    validInput = false;


                    //Enter if the book is going to be borrowed
                    if(borrow.equals("Y")){
                        String addPat ="";
                         //Have the user enter whether the patron is in the database or not
                         while(validInput == false){
                            System.out.println("Is the Patron already in the System?(Y,N)");
                            addPat = scanner.next();
                            if(addPat.equals("Y") || addPat.equals("N")){
                                validInput = true;
                            }
                    
                            else{
                                System.out.println("Invalid Input");
                            }
                            }
    
                            validInput = false;
                            //Enter if the patron is already in the system
                            if(addPat.equals("Y")){
                                int pId;
                            System.out.println("Enter the patron's Id");
                            pId = scanner.nextInt();
                            ArrayList <Patron> pList = l.getPatronList();
                            boolean pValid = false;
                            for(Patron p: pList){
                                int amountCopies = 0;
                                if(pId == p.getPatronID()){
                                pValid = true;
                                boolean validCopies = false;
    
                                //Enter the amount of copies to be borrowed
                                while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (b.getCopyNum()-b.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
                                for(int i =1;i<= amountCopies; i++){
                                b.Borrow(p);
                                }
                            }
    
                            if (pValid == false){
                                System.out.println("Patron does not exist");
                            }
                            }
                        }
                            else if(addPat.equals("N")){
                                int pId;
                                String name;
                                String address;
                                String phoneNum;
                                String pType ="";
                                int amountCopies = 0;
                                
    
                                System.out.println("Enter the patron Id");
                                
                                pId = scanner.nextInt();
    
                                System.out.println("Enter the patron's name");
                                name = scanner.next();
    
                                System.out.println("Enter the patron's address");
                                address = scanner.next();
    
                                System.out.println("Enter the phone number");
                                phoneNum = scanner.next();
    
                                //Enter the type of patron
                                while(validInput == false){
                                System.out.println("Enter the type of patron(S,E)");
                                
                                pType = scanner.next();
                                if(pType.equals("S") || pType.equals("E")){
                                    validInput = true;
                                }
                        
                                else{
                                    System.out.println("Invalid Input");
                                }
                                }
        
                                validInput = false;
                                
    
                                //Enter if the patron is a student
                                if(pType.equals("S")){
                                    int studentID;
                                    String school;
                                    int grade;
                                    System.out.println("Enter the patron's Student ID");
                                    studentID = scanner.nextInt();
    
                                    System.out.println("Enter the patron's school");
                                    school = scanner.next();
    
                                    System.out.println("Enter the patron's grade");
                                    grade = scanner.nextInt();
    
                                    //Create a student object with the inputed data
                                    Student s = new Student(pId,name,address,phoneNum,studentID, school, grade);
                                    l.addPatron(s);
                                    boolean validCopies = false;
    
                                    //Enter the amount of copies to be borrowed
                                    while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (b.getCopyNum()-b.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
    
                                //Borrow the books
                                for(int i =1;i<= amountCopies; i++){
                                b.Borrow(s);
                                }  
                                }
    
                                //Enter if the patron is a Employee
                                else if(pType.equals("E")){
                                     int empID;
                                     String position;
    
                                     System.out.println("Enter the employee ID");
                                     empID = scanner.nextInt();
    
                                     System.out.println("Enter the position");
    
                                     position = scanner.next();
    
                                     //Create an employee
                                     Employee e = new Employee(pId,name,address,phoneNum,empID, position);
                                     l.addPatron(e);
                                     
                                     boolean validCopies = false;
    
                                     //Enter the amount of copies to be borrowed
                                while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (b.getCopyNum()-b.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
    
                                //Borrow the books
                                for(int i =1;i<= amountCopies; i++){
                                b.Borrow(e);
                                }
                            }

                    }

                }

                
                }
                
            }
            if (valid == false){
                System.out.println("Book is not in data base");
            }
        }
            //Enter if the item is a periodical
            else if (pubType.equals("P")){
                boolean valid = false;
                String isbn;
                System.out.println("Enter the ISBN of the periodical");
                isbn = scanner.next();

                ArrayList<Periodical> pList = l.getPeriodicalList();
                for(Periodical p: pList){
                    if(isbn.equals(p.getIsbn())){
                    valid = true;
                    String borrow = "";
                    System.out.println(p.getTitle() + " " + p.getAuthor().getName() + " " + p.getIsbn() + " " + " Total copies: " + p.getCopyNum() + " Total copies currently available: " + (p.getCopyNum() + p.getBorrowAmount()));
                    System.out.println();
                   //Enter if the user wants to borrow item
                   while(validInput == false){
                    System.out.println("Do you wish to borrow this periodical?(Y,N)");
                    borrow = scanner.next();

                    if(borrow.equals("Y") || borrow.equals("N")){
                        validInput = true;
                    }
            
                    else{
                        System.out.println("Invalid Input");
                    }
                    }
                    validInput = false;

                    if(borrow.equals("Y")){
                        String addPat = "";
                        //Have the user enter whether the patron is in the database or not
                        while(validInput == false){
                            System.out.println("Is the Patron already in the System?(Y,N)");
                            addPat = scanner.next();
                            if(addPat.equals("Y") || addPat.equals("N")){
                                validInput = true;
                            }
                    
                            else{
                                System.out.println("Invalid Input");
                            }
                            }
    
                            validInput = false;
                            //Enter if the patron is already in the system
                            if(addPat.equals("Y")){
                                int pId;
                            System.out.println("Enter the patron's Id");
                            pId = scanner.nextInt();
                            ArrayList <Patron> perList = l.getPatronList();
                            boolean pValid = false;
                            for(Patron per: perList){
                                int amountCopies = 0;
                                if(pId == per.getPatronID()){
                                pValid = true;
                                boolean validCopies = false;
    
                                //Enter the amount of copies to be borrowed
                                while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (p.getCopyNum()-p.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
                                for(int i =1;i<= amountCopies; i++){
                                p.Borrow(per);
                                }
                            }
    
                            if (pValid == false){
                                System.out.println("Patron does not exist");
                            }
                            }
                        }
                        else if(addPat.equals("N")){
                                int pId;
                                String name;
                                String address;
                                String phoneNum;
                                String pType ="";
                                int amountCopies = 0;
                                
    
                                System.out.println("Enter the patron Id");
                                
                                pId = scanner.nextInt();
    
                                System.out.println("Enter the patron's name");
                                name = scanner.next();
    
                                System.out.println("Enter the patron's address");
                                address = scanner.next();
    
                                System.out.println("Enter the phone number");
                                phoneNum = scanner.next();
    
                                //Enter the type of patron
                                while(validInput == false){
                                System.out.println("Enter the type of patron(S,E)");
                                
                                pType = scanner.next();
                                if(pType.equals("S") || pType.equals("E")){
                                    validInput = true;
                                }
                        
                                else{
                                    System.out.println("Invalid Input");
                                }
                                }
        
                                validInput = false;
                                
    
                                //Enter if the patron is a student
                                if(pType.equals("S")){
                                    int studentID;
                                    String school;
                                    int grade;
                                    System.out.println("Enter the patron's Student ID");
                                    studentID = scanner.nextInt();
    
                                    System.out.println("Enter the patron's school");
                                    school = scanner.next();
    
                                    System.out.println("Enter the patron's grade");
                                    grade = scanner.nextInt();
    
                                    //Create a student object with the inputed data
                                    Student s = new Student(pId,name,address,phoneNum,studentID, school, grade);
                                    l.addPatron(s);
                                    boolean validCopies = false;
    
                                    //Enter the amount of copies to be borrowed
                                    while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (p.getCopyNum()-p.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
    
                                //Borrow the periodicals
                                for(int i =1;i<= amountCopies; i++){
                                p.Borrow(s);
                                }  
                                }
    
                                //Enter if the patron is a Employee
                                else if(pType.equals("E")){
                                     int empID;
                                     String position;
    
                                     System.out.println("Enter the employee ID");
                                     empID = scanner.nextInt();
    
                                     System.out.println("Enter the position");
    
                                     position = scanner.next();
    
                                     //Create an employee
                                     Employee e = new Employee(pId,name,address,phoneNum,empID, position);
                                     l.addPatron(e);
                                     
                                     boolean validCopies = false;
    
                                    //Enter the amount of copies to be borrowed
                                while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (p.getCopyNum()-p.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
    
                                //Borrow the periodicals
                                for(int i =1;i<= amountCopies; i++){
                                p.Borrow(e);
                                }
                                
                            }

                            else if(pType.equals("E")){
                                 int empID;
                                 String position;

                                 System.out.println("Enter the employee ID");
                                 empID = scanner.nextInt();

                                 System.out.println("Enter the position");

                                 position = scanner.next();
                                 Employee e = new Employee(pId,name,address,phoneNum,empID, position);
                                 l.addPatron(e);
                                 boolean validCopies = false;
                               
                                while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (p.getCopyNum()-p.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
                                for(int i =1;i<= amountCopies; i++){
                                p.Borrow(e);
                                }
                            }
                    }

                }

               
                }
                
            }
            if (valid == false){
                System.out.println("Periodical is not in data base");
            }
        }
            
            else{
                System.out.println("Invalid input");
            }
        }

        //Enter if sereaching by the Author
        if(type.equals("A")){
            String authorName;
            System.out.println("Enter the name of the Author");
            authorName = scanner.next();
            ArrayList <LibaryItem> aBookList = new ArrayList<LibaryItem>();

            //Search the database for the author
            for(Author a: l.getAuthorList()){

                //Enter if found the author
                if(a.getName().equals(authorName)){
                    aBookList = a.getWrittenList();
                }
            }

            //Enter if the author has written any items
            if(aBookList.size()>0){

                //Display all the authors items
             for(LibaryItem p: aBookList){
                System.out.println(p.getTitle() + " " + p.getAuthor().getName() + " " + p.getIsbn() + " " + " Total copies: " + p.getCopyNum() + " Total copies currently available: " + (p.getCopyNum() - p.getBorrowAmount()));
             }

             String choice= "";

             //Have the user enter if they wish to borrow an item
             while(validInput == false){
             System.out.println("Do you wish to borrow a publication from this list?(Y,N)");
             choice = scanner.next();

            if(choice.equals("Y") || choice.equals("N"))
            {
                validInput = true;
            }

            else{
                System.out.println("Invalid Input");
            }
            
             }
             validInput = false;

             //Enter if the user input Y
             if (choice.equals("Y")){
                boolean  valid= false;

                System.out.println("Enter the publication title");
                String title = scanner.next();

                //Search the database for the item
                for(LibaryItem p: aBookList){

                    //Enter if found the item
                    if(p.getTitle().equals(title)){
                        valid = true;
                        String addPat = "";
                        //Have the user enter whether the patron is in the database or not
                        while(validInput == false){
                            System.out.println("Is the Patron already in the System?(Y,N)");
                            addPat = scanner.next();
                            if(addPat.equals("Y") || addPat.equals("N")){
                                validInput = true;
                            }
                    
                            else{
                                System.out.println("Invalid Input");
                            }
                            }
    
                            validInput = false;
                            //Enter if the patron is already in the system
                            if(addPat.equals("Y")){
                            int pId;
                            System.out.println("Enter the patron's Id");
                            pId = scanner.nextInt();
                            ArrayList <Patron> perList = l.getPatronList();
                            boolean pValid = false;
                            for(Patron per: perList){
                                int amountCopies = 0;
                                if(pId == per.getPatronID()){
                                pValid = true;
                                boolean validCopies = false;
    
                                //Enter the amount of copies to be borrowed
                                while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (p.getCopyNum()-p.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
                                for(int i =1;i<= amountCopies; i++){
                                p.Borrow(per);
                                }
                            }
    
                            if (pValid == false){
                                System.out.println("Patron does not exist");
                            }
                            }
                        }
                        else if(addPat.equals("N")){
                                int pId;
                                String name;
                                String address;
                                String phoneNum;
                                String pType ="";
                                int amountCopies = 0;
                                
    
                                System.out.println("Enter the patron Id");
                                
                                pId = scanner.nextInt();
    
                                System.out.println("Enter the patron's name");
                                name = scanner.next();
    
                                System.out.println("Enter the patron's address");
                                address = scanner.next();
    
                                System.out.println("Enter the phone number");
                                phoneNum = scanner.next();
    
                                //Enter the type of patron
                                while(validInput == false){
                                System.out.println("Enter the type of patron(S,E)");
                                
                                pType = scanner.next();
                                if(pType.equals("S") || pType.equals("E")){
                                    validInput = true;
                                }
                        
                                else{
                                    System.out.println("Invalid Input");
                                }
                                }
        
                                validInput = false;
                                
    
                                //Enter if the patron is a student
                                if(pType.equals("S")){
                                    int studentID;
                                    String school;
                                    int grade;
                                    System.out.println("Enter the patron's Student ID");
                                    studentID = scanner.nextInt();
    
                                    System.out.println("Enter the patron's school");
                                    school = scanner.next();
    
                                    System.out.println("Enter the patron's grade");
                                    grade = scanner.nextInt();
    
                                    //Create a student object with the inputed data
                                    Student s = new Student(pId,name,address,phoneNum,studentID, school, grade);
                                    l.addPatron(s);
                                    boolean validCopies = false;
    
                                    //Enter the amount of copies to be borrowed
                                    while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (p.getCopyNum()-p.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
    
                                //Borrow the periodicals
                                for(int i =1;i<= amountCopies; i++){
                                p.Borrow(s);
                                }  
                                }
    
                                //Enter if the patron is a Employee
                                else if(pType.equals("E")){
                                     int empID;
                                     String position;
    
                                     System.out.println("Enter the employee ID");
                                     empID = scanner.nextInt();
    
                                     System.out.println("Enter the position");
    
                                     position = scanner.next();
    
                                     //Create an employee
                                     Employee e = new Employee(pId,name,address,phoneNum,empID, position);
                                     l.addPatron(e);
                                     
                                     boolean validCopies = false;
    
                                    //Enter the amount of copies to be borrowed
                                while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (p.getCopyNum()-p.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
    
                                //Borrow the periodicals
                                for(int i =1;i<= amountCopies; i++){
                                p.Borrow(e);
                                }
                                
                            }

                            else if(pType.equals("E")){
                                 int empID;
                                 String position;

                                 System.out.println("Enter the employee ID");
                                 empID = scanner.nextInt();

                                 System.out.println("Enter the position");

                                 position = scanner.next();
                                 Employee e = new Employee(pId,name,address,phoneNum,empID, position);
                                 l.addPatron(e);
                                 boolean validCopies = false;
                               
                                while(validCopies == false){
    
                                    System.out.println("Enter the amount of copies you wish to borrow");
                                    amountCopies = scanner.nextInt();
    
                                    if (amountCopies > (p.getCopyNum()-p.getBorrowAmount())){
                                        System.out.println("Cannot borrow this amount of copies");
                                        
                                    }
                                    else{
                                        validCopies = true;
                                    }
                                }
                                for(int i =1;i<= amountCopies; i++){
                                p.Borrow(e);
                                }  
                            }
                        }

                            
                            


                        }

                    }

                

                if(valid == false){
                    System.out.println("Publication is not in data base is not in data base");
                }
                }
            }
            
            else{
                System.out.println("Author is not in data base");
            }
        }
    }
    /**
 * Method to return a LibaryItem Object
 * @param l accepts Library object to obtian lists
 */
    //Method to return library items
    public static void returnLibraryItem(Library l){
        Scanner scanner = new Scanner(System.in);
        int parId;
        ArrayList<Patron> parList = l.getPatronList();

        //Have the user enter the patron's id
        System.out.println("Enter the Patron's id");
        parId = scanner.nextInt();

        for(Patron par: parList){
            //Search the system for the inputed id
            if(par.getPatronID() == parId){
                String title;
                ArrayList<LibaryItem> itemList = par.getBorrowedList();
                boolean removeBook = false;
                LibaryItem lI = new LibaryItem();

                //Display all the items the patron has borrowed
                for(LibaryItem i: itemList){
                    System.out.println(i.getTitle() + " Author: " + i.getAuthor().getName() + " " + i.getIsbn());
                }

                //Have the user input the item they wish to return
                System.out.println("Enter the title of the book you wish to return");
                title = scanner.next();

                int copyAmount = 0;

                //Obtian how many of the item the user has borrowed
                for(LibaryItem i : itemList){
                    if(i.getTitle().equals(title)){
                        removeBook = true;
                        lI = i;
                        copyAmount++;
                    }
                }

                
                if(removeBook == true){
                    boolean validAmount = false;
                    int amountRemove = 0;
                    while(validAmount == false){

                        //Have the user enter how many items they wish to return
                        System.out.println("Enter the amount of copies you wish to be returned");
                        amountRemove = scanner.nextInt();

                        //Enter if the user has inputed a value greater than the amount they have borrowed
                        if(copyAmount<amountRemove){
                            System.out.println("The patron has not borrowed that amount of copies");

                        }

                        else{
                            validAmount = true;
                        }
                    }

                    //return the item
                    for(int i= 1; i<= amountRemove;i++){
                    par.removeBorrowedItem(lI);
                    lI.Return();
                    }
                }

                else{
                    System.out.println("Invalid input");
                }

            }
        }

        
    }
        


    public static void main(String[] args) {
        Author a1 = new Author("CindyLoo", "1925/12/01");
        Author a2 = new Author("BobJohnson", "1999/08/13");
        Author a3 = new Author("JohnIger", "1987/11/13");
        Book b1 = new Book(123, "Hello", a1, "A2H357", "Publish", 2, "E", "Fiction");
        Periodical p1 = new Periodical(456, "Bye", a1, "1h4s9o", "Company", 3, "Magazine", "45");
        Patron pa1 = new Student(234, "KatherineWright", "123MainSt", "1234567890", 675, "StEdwards", 11 );
        Patron pa2 = new Employee(234, "DavePenny", "56AlexsLane", "0987654321", 3786, "Mangement" );
        Book b2 = new Book(123, "Hello", a1, "A2H357", "Publish", 2, "E", "Fiction");
        Periodical p2 = new Periodical(96," Hi", a3, "89NMK9", "Geographic", 2, "P", "76");

        a1.addWrittenItem(b1);
        a1.addWrittenItem(p1);

        a2.addWrittenItem(b2);
        a3.addWrittenItem(p2);
        b1.Borrow(pa1);
        Library l = new Library(b1, p1, pa1, a1);
        l.addAuthor(a2);
        l.addAuthor(a3);
        l.addBook(b2);
        l.addPeriodical(p2);
        l.addPatron(pa2);

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
                   // System.out.println(l.toString());
                    break;
                case 2:
                    System.out.println("Editing an existing library item...");
                    editItem(l);
                   // System.out.println(l.toString());
                    break;
                case 3:
                    System.out.println("Deleting a library item...");
                    removeItem(l);
                   // System.out.println(l.toString()); 
                    break;
                case 4:
                    System.out.println("Borrowing a library item...");
                    borrowItem(l);
                   // System.out.println(l);
                    break;
                case 5:
                    System.out.println("Returning a library item...");
                    returnLibraryItem(l);
                   // System.out.println(l);
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
=======
public class Demo {
    public static void main(String[] args) {
        Author a1 = new Author("Cindy Newman", "12-01-1925");
        Book b1 = new Book(123, "Hello", a1, "A2H357", "Publish", 2, "EBook", "Fiction");
        Periodical p1 = new Periodical(456, "Bye", a1, "1h4s9o", "Company", 3, "Magazine", "45");
        Patron pa1 = new Patron(234, "Katherine Wall", "123 Main st", "1234567890");

        // System.out.println(p1.toString());

        // p1.Borrow();

        // System.out.println(p1.toString());

        // p1.Return();

        // System.out.println(p1.toString());

        pa1.addBorrowedItem(b1);

        System.out.println(pa1.toString());



    }
}
