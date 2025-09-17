package LoanItems;

import java.util.Scanner;

public class LoanItems {
    public static void main(String[] args) {

    }
    public static void welcomeMessage() {
        System.out.println("Welcome to the library!");
        System.out.println("Right now there are no items to loan...");
    }
    public static void registerItems(){
        System.out.println("So let's first register some items!");
        System.out.println("How many items do you want to register?");

        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();

        LoanItems[] items = new LoanItems[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("ITEM no. " + (i + 1));
            System.out.println("\tType (B or V: ");
            String type = scanner.nextLine();
            System.out.println("\tTitle: ");
            String title = scanner.nextLine();
            if (type.equalsIgnoreCase("B")) {
                items[i] = new Book(title, type);
            } else if (type.equalsIgnoreCase("V")) {
                items[i] = new Video(title, type);
            }
        }
        System.out.println("LIST OF LOAN ITEMS:");
        System.out.println("-------------------");
        for(LoanItems loanItems : items) {
            System.out.println(loanItems);
    }
    }
}
