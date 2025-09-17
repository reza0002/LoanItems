package LoanItems;

// Imports the scanner so we can make user input
import java.util.Scanner;

// Test Class
public class Library {
    // Main method
    public static void main(String[] args) {
        welcomeMessage();
        registerItems();

    }
    // Welcome method, prints out a welcome message
    public static void welcomeMessage() {
        System.out.println("Welcome to the library!");
        System.out.println("Right now there are no items to loan...");
    }
    // Register items method, takes user input and initiates constructors
    public static void registerItems(){
        System.out.println("So let's first register some items!");
        System.out.println("How many items do you want to register?");
    // Uses the scanner
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();
    // Creates an array
        LoanItems[] items = new LoanItems[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("ITEM no. " + (i + 1));
            // Validates the user input
            String type;
            while(true) {
                System.out.print("\tType (Book or Video): ");
                type = scanner.nextLine();
                if(type.equalsIgnoreCase("Book") || type.equalsIgnoreCase("Video")) {
                    break;
                }else {
                    System.out.println("We don't have that in this library. Please try again.");
                }
            }
            System.out.print("\tTitle: ");
            String title = scanner.nextLine();
                // Assigns the attributes to the objects.
                if (type.equalsIgnoreCase("Book")) {
                    items[i] = new Book(i + 1, type, title);
                } else if (type.equalsIgnoreCase("Video")) {
                    items[i] = new Video(i + 1, type, title);
                }

        }
        // Gives a list of registered items
        System.out.println("LIST OF LOAN ITEMS:");
        System.out.println("-------------------");
        System.out.println("ID  Type \t Title");
        for(LoanItems loanItems : items) {
            System.out.print(loanItems);
            scanner.close();
        }
    }
}
