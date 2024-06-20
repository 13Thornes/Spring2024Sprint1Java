
import java.util.Scanner;



public class Demo {
    
    public void addBook()
{ Scanner scanner = new Scanner(System.in);
    String itemType;
    String choice;
    System.out.println("Is the libary Item a book or peridoical(B, P): ");
    itemType = scanner.next();

    if(itemType == "B"){

        
        
        System.out.println("Is the author of the libary item already in the system?(Y,N)?");
        choice = scanner.next();
        if(choice == "N"){
            String name;
            String DOB;

            System.out.println("Please enter the Author's full name.");
            name = scanner.next();

            System.out.println("Please enter the Author's date of birth");

            DOB = scanner.next();

            // Author a = new Author(name, DOB);

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

            //Book = new Book()


            }
            

        }

        else if(choice == "Y"){

            System.out.println("Please enter the authors full name");
            String authorName = scanner.next();

            
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

            //Book = new Book()


            }

        }

        else{
            System.out.println("Invalid Input");
        }

    }

    else if(itemType == "P"){

        
        
        System.out.println("Is the author of the libary item already in the system?(Y,N)?");
        choice = scanner.next();
        if(choice == "N"){
            String name;
            String DOB;

            System.out.println("Please enter the Author's full name.");
            name = scanner.next();

            System.out.println("Please enter the Author's date of birth");

            DOB = scanner.next();

            // Author a = new Author(name, DOB);

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

            //Book = new Book()


            }
            

        }

        else if(choice == "Y"){

            System.out.println("Please enter the authors full name");
            String authorName = scanner.next();

            
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

            //Book = new Book()


            }

        }

        else{
            System.out.println("Invalid Input");
        }
    }

    else{
        System.out.println("Invalid Input");
    }
    scanner.close();
}
    public static void main(String[] args) {
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
                    // Add logic to add a library item
                    break;
                case 2:
                    System.out.println("Editing an existing library item...");
                    // Add logic to edit a library item
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
