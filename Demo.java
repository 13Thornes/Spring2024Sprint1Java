
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

public static void removeItem(Library l){
    boolean valid = false;
    Scanner scanner = new Scanner(System.in);
    String itemName;
    String itemType;
    Book removeBook = new Book();
    System.out.println("Enter the type of Item(B,P)");
    itemType = scanner.next();

    if(itemType.equals("B")){
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
        l.removeBook(removeBook);
      }
    }
     else if(itemType.equals("P")){
      System.out.println("Enter the Name of the Periodical you want to remove");
  
      Periodical removeP = new Periodical();
      itemName = scanner.next();
  
  
      ArrayList<Periodical> pList;
      pList = l.getPeriodicalList();
      for (Periodical p : pList) {
          if (p.getTitle().equals(itemName));
          {
              valid = true;
             removeP = p;
          }
        }
  
        if(valid == false){
          System.out.println("Periodical does not exist");
        }

        else{
            l.removePeriodical(removeP);
        }
    }

    else{
        System.out.println("Invalid input");
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
          System.out.println("Enter the Name of the Periodical you want to Remove");
      
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

    public static void borrowItem(Library l){
        Scanner scanner = new Scanner(System.in);
        String type;

        System.out.println("Enter what search method you would like to use(T,A,I)");

        type = scanner.next();

        if(type.equals("T")){
            String pubType;

            System.out.println("Enter the name of the type of puplication that is being borrowed(B,P)");
            pubType = scanner.next();

            if(pubType.equals("B")){
                boolean valid = false;
                String title;
                System.out.println("Enter the title of the book");
                title = scanner.next();

                ArrayList<Book> bList = l.getBookList();
                for(Book b: bList){
                    if(title.equals(b.getTitle())){
                    valid = true;
                    String borrow;
                    System.out.println(b.getTitle() + " " + b.getAuthor().getName() + " " + b.getIsbn() + " " + " Total copies: " + b.getCopyNum() + " Total copies currently avaible: " + (b.getCopyNum() - b.getBorrowAmount()));
                    System.out.println();
                    System.out.println("Do you wish to borrow this book?(Y,N)");
                    borrow = scanner.next();

                    if(borrow.equals("Y")){
                        String addPat;
                        System.out.println("Is the Patron already in the System?(Y,N)");
                        addPat = scanner.next();
                        if(addPat.equals("Y")){
                            int pId;
                        System.out.println("Enter the patron's Id");
                        pId = scanner.nextInt();
                        ArrayList <Patron> pList = l.getPatronList();
                        boolean pValid = false;
                        for(Patron p: pList){
                            if(pId == p.getPatronID()){
                            pValid = true;

                            b.Borrow(p);
                            }
                        }

                        if (pValid == false){
                            System.out.println("Patron does not exist");
                        }
                        }

                        else if(addPat.equals("N")){
                            int pId;
                            String name;
                            String address;
                            String phoneNum;
                            String pType;

                            System.out.println("Enter the patron Id");
                            
                            pId = scanner.nextInt();

                            System.out.println("Enter the patron's name");
                            name = scanner.next();

                            System.out.println("Enter the patron's address");
                            address = scanner.next();

                            System.out.println("Enter the phone number");
                            phoneNum = scanner.next();

                            System.out.println("Enter the type of patron(S,E)");
                            
                            pType = scanner.next();

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

                                Student s = new Student(pId,name,address,phoneNum,studentID, school, grade);;
                                b.Borrow(s);
                                l.addPatron(s);  
                            }

                            else if(pType.equals("E")){
                                 int empID;
                                 String position;

                                 System.out.println("Enter the employee ID");
                                 empID = scanner.nextInt();

                                 System.out.println("Enter the position");

                                 position = scanner.next();
                                 Employee e = new Employee(pId,name,address,phoneNum,empID, position);
                                 
                                 b.Borrow(e);
                                 l.addPatron(e);
                            }

                            else{
                                System.out.println("Invalid Input");
                            }
                            


                        }

                        else{
                            System.out.println("Invalid input");
                        }
                    }

                }

                if (valid == false){
                    System.out.println("Book is not in data base");
                }
                }
            }
            else if (pubType.equals("P")){
                boolean valid = false;
                String title;
                System.out.println("Enter the title of the periodical");
                title = scanner.next();

                ArrayList<Periodical> pList = l.getPeriodicalList();
                for(Periodical p: pList){
                    if(title.equals(p.getTitle())){
                    valid = true;
                    String borrow;
                    System.out.println(p.getTitle() + " " + p.getAuthor() + " " + p.getIsbn() + " " + " Total copies: " + p.getCopyNum() + "Total copies currently avaible: " + (p.getCopyNum() + p.getBorrowAmount()));
                    System.out.println();
                    System.out.println("Do you wish to borrow this periodical?(Y,N)");
                    borrow = scanner.next();

                    if(borrow.equals("Y")){
                        String addPat;
                        System.out.println("Is the Patron already in the System?(Y,N)");
                        addPat = scanner.next();
                        if(addPat.equals("Y")){
                            int pId;
                        System.out.println("Enter the patron's Id");
                        pId = scanner.nextInt();
                        ArrayList <Patron> perList = l.getPatronList();
                        boolean pValid = false;
                        for(Patron per: perList){
                            if(pId == per.getPatronID()){
                            pValid = true;

                            p.Borrow(per);

                            per.addBorrowedItem(p);
                            }
                        }

                        if (pValid == false){
                            System.out.println("Patron does not exist");
                        }
                        }

                        else if(addPat.equals("N")){
                            int pId;
                            String name;
                            String address;
                            String phoneNum;
                            String pType;

                            System.out.println("Enter the patron Id");
                            
                            pId = scanner.nextInt();

                            System.out.println("Enter the patron's name");
                            name = scanner.next();

                            System.out.println("Enter the patron's address");
                            address = scanner.next();

                            System.out.println("Enter the phone number");
                            phoneNum = scanner.next();

                            System.out.println("Enter the type of patron(S,E)");
                            
                            pType = scanner.next();

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

                                Student s = new Student (pId,name,address,phoneNum,studentID, school, grade);
                                p.Borrow(s);
                                l.addPatron(s);
                                
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
                                 p.Borrow(e);
                            }

                            else{
                                System.out.println("Invalid Input");
                            }
                            


                        }

                        else{
                            System.out.println("Invalid input");
                        }
                    }

                }

                if (valid == false){
                    System.out.println("Periodical is not in data base");
                }
                }
            }
            
            else{
                System.out.println("Invalid input");
            }
        }

        if(type.equals("I")){
            String pubType;

            System.out.println("Enter the name of the type of puplication that is being borrowed(B,P)");
            pubType = scanner.next();

            if(pubType.equals("B")){
                boolean valid = false;
                String isbn;
                System.out.println("Enter the ISBN of the book");
                isbn = scanner.next();

                ArrayList<Book> bList = l.getBookList();
                for(Book b: bList){
                    if(isbn.equals(b.getIsbn())){
                    valid = true;
                    String borrow;
                    System.out.println(b.getTitle() + " " + b.getAuthor().getName() + " " + b.getIsbn() + " " + " Total copies: " + b.getCopyNum() + " Total copies currently avaible: " + (b.getCopyNum() - b.getBorrowAmount()));
                    System.out.println();
                    System.out.println("Do you wish to borrow this book?(Y,N)");
                    borrow = scanner.next();

                    if(borrow.equals("Y")){
                        String addPat;
                        System.out.println("Is the Patron already in the System?(Y,N)");
                        addPat = scanner.next();
                        if(addPat.equals("Y")){
                            int pId;
                        System.out.println("Enter the patron's Id");
                        pId = scanner.nextInt();
                        ArrayList <Patron> pList = l.getPatronList();
                        boolean pValid = false;
                        for(Patron p: pList){
                            if(pId == p.getPatronID()){
                            pValid = true;

                            b.Borrow(p);
                            }
                        }

                        if (pValid == false){
                            System.out.println("Patron does not exist");
                        }
                        }

                        else if(addPat.equals("N")){
                            int pId;
                            String name;
                            String address;
                            String phoneNum;
                            String pType;

                            System.out.println("Enter the patron Id");
                            
                            pId = scanner.nextInt();

                            System.out.println("Enter the patron's name");
                            name = scanner.next();

                            System.out.println("Enter the patron's address");
                            address = scanner.next();

                            System.out.println("Enter the phone number");
                            phoneNum = scanner.next();

                            System.out.println("Enter the type of patron(S,E)");
                            
                            pType = scanner.next();

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

                                Student s = new Student(pId,name,address,phoneNum,studentID, school, grade);;
                                b.Borrow(s);
                                l.addPatron(s);  
                            }

                            else if(pType.equals("E")){
                                 int empID;
                                 String position;

                                 System.out.println("Enter the employee ID");
                                 empID = scanner.nextInt();

                                 System.out.println("Enter the position");

                                 position = scanner.next();
                                 Employee e = new Employee(pId,name,address,phoneNum,empID, position);
                                 
                                 b.Borrow(e);
                                 l.addPatron(e);
                            }

                            else{
                                System.out.println("Invalid Input");
                            }
                            


                        }

                        else{
                            System.out.println("Invalid input");
                        }
                    }

                }

                if (valid == false){
                    System.out.println("Book is not in data base");
                }
                }
            }
            else if (pubType.equals("P")){
                boolean valid = false;
                String isbn;
                System.out.println("Enter the ISBN of the periodical");
                isbn = scanner.next();

                ArrayList<Periodical> pList = l.getPeriodicalList();
                for(Periodical p: pList){
                    if(isbn.equals(p.getIsbn())){
                    valid = true;
                    String borrow;
                    System.out.println(p.getTitle() + " " + p.getAuthor() + " " + p.getIsbn() + " " + " Total copies: " + p.getCopyNum() + "Total copies currently avaible: " + (p.getCopyNum() + p.getBorrowAmount()));
                    System.out.println();
                    System.out.println("Do you wish to borrow this periodical?(Y,N)");
                    borrow = scanner.next();

                    if(borrow.equals("Y")){
                        String addPat;
                        System.out.println("Is the Patron already in the System?(Y,N)");
                        addPat = scanner.next();
                        if(addPat.equals("Y")){
                            int pId;
                        System.out.println("Enter the patron's Id");
                        pId = scanner.nextInt();
                        ArrayList <Patron> perList = l.getPatronList();
                        boolean pValid = false;
                        for(Patron per: perList){
                            if(pId == per.getPatronID()){
                            pValid = true;

                            p.Borrow(per);

                            per.addBorrowedItem(p);
                            }
                        }

                        if (pValid == false){
                            System.out.println("Patron does not exist");
                        }
                        }

                        else if(addPat.equals("N")){
                            int pId;
                            String name;
                            String address;
                            String phoneNum;
                            String pType;

                            System.out.println("Enter the patron Id");
                            
                            pId = scanner.nextInt();

                            System.out.println("Enter the patron's name");
                            name = scanner.next();

                            System.out.println("Enter the patron's address");
                            address = scanner.next();

                            System.out.println("Enter the phone number");
                            phoneNum = scanner.next();

                            System.out.println("Enter the type of patron(S,E)");
                            
                            pType = scanner.next();

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

                                Student s = new Student (pId,name,address,phoneNum,studentID, school, grade);
                                p.Borrow(s);
                                l.addPatron(s);
                                
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
                                 p.Borrow(e);
                            }

                            else{
                                System.out.println("Invalid Input");
                            }
                            


                        }

                        else{
                            System.out.println("Invalid input");
                        }
                    }

                }

                if (valid == false){
                    System.out.println("Periodical is not in data base");
                }
                }
            }
            
            else{
                System.out.println("Invalid input");
            }
        }

        if(type.equals("A")){
            String pubType;
            String authorName;
            System.out.println("Enter the name of the Author");
            authorName = scanner.next();
            ArrayList <LibaryItem> aBookList = new ArrayList<LibaryItem>();

            for(Author a: l.getAuthorList()){
                if(a.getName().equals(authorName)){
                    aBookList = a.getWrittenList();
                }
            }

            if(aBookList.size()>0){
             for(LibaryItem p: aBookList){
                System.out.println(p.getTitle() + " " + p.getAuthor() + " " + p.getIsbn() + " " + " Total copies: " + p.getCopyNum() + "Total copies currently avaible: " + (p.getCopyNum() + p.getBorrowAmount()));
             }

             String choice;
             System.out.println("Do you wishe to borrow a publication from this list?(Y,N)");
             choice = scanner.next();

             if (choice.equals("Y")){
                System.out.println("Enter the publication title");
                boolean  valid= false;
                String title = scanner.next();
                for(LibaryItem p: aBookList){
                    if(p.getTitle().equals(title)){
                        valid = true;
                        String addPat;
                        System.out.println("Is the Patron already in the System?(Y,N)");
                        addPat = scanner.next();
                        if(addPat.equals("Y")){
                            int pId;
                        System.out.println("Enter the patron's Id");
                        pId = scanner.nextInt();
                        ArrayList <Patron> perList = l.getPatronList();
                        boolean pValid = false;
                        for(Patron per: perList){
                            if(pId == per.getPatronID()){
                            pValid = true;

                            p.Borrow(per);

                            per.addBorrowedItem(p);
                            }
                        }

                        if (pValid == false){
                            System.out.println("Patron does not exist");
                        }
                        }

                        else if(addPat.equals("N")){
                            int pId;
                            String name;
                            String address;
                            String phoneNum;
                            String pType;

                            System.out.println("Enter the patron Id");
                            
                            pId = scanner.nextInt();

                            System.out.println("Enter the patron's name");
                            name = scanner.next();

                            System.out.println("Enter the patron's address");
                            address = scanner.next();

                            System.out.println("Enter the phone number");
                            phoneNum = scanner.next();

                            System.out.println("Enter the type of patron(S,E)");
                            
                            pType = scanner.next();

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

                                Student s = new Student (pId,name,address,phoneNum,studentID, school, grade);
                                p.Borrow(s);
                                l.addPatron(s);
                                
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
                                 p.Borrow(e);
                            }

                            else{
                                System.out.println("Invalid Input");
                            }
                            


                        }

                        else{
                            System.out.println("Invalid input");
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

        


    public static void main(String[] args) {
        Author a1 = new Author("Cindy", "12-01-1925");
        Book b1 = new Book(123, "Hello", a1, "A2H357", "Publish", 2, "EBook", "Fiction");
        Periodical p1 = new Periodical(456, "Bye", a1, "1h4s9o", "Company", 3, "Magazine", "45");
        Patron pa1 = new Patron(234, "Katherine Wall", "123 Main st", "1234567890");

        a1.addWrittenItem(b1);
        a1.addWrittenItem(p1);
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
                    removeItem(l);
                    System.out.println(l.toString()); 
                    break;
                case 4:
                    System.out.println("Borrowing a library item...");
                    borrowItem(l);
                    System.out.println(l);
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
