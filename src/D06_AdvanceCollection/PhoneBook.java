package D06_AdvanceCollection;
//Implement a basic phone book using HashMap<String, String> with name as key
// and number as value. Add, delete, search contacts.

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String args[]) {

        // Create a HashMap to store name → phone number
        HashMap<String, String> phoneBook = new HashMap<>();

        //Take Input
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n PHONE BOOK MENU:");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Show All Contacts");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter number: ");
                    String number = scanner.nextLine();
                    phoneBook.put(nameToAdd, number);
                    System.out.println("Contact added.");
                    break;



                case 2:
                    System.out.print("Enter name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    if (phoneBook.containsKey(nameToDelete)) {
                        phoneBook.remove(nameToDelete);
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String nameToSearch = scanner.nextLine();
                    if (phoneBook.containsKey(nameToSearch)) {
                        System.out.println("Number: " + phoneBook.get(nameToSearch));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.println("\n📇 All Contacts:");
                    for (String name : phoneBook.keySet()) {
                        System.out.println(name + " → " + phoneBook.get(name));
                    }
                    break;

                case 0:
                    System.out.println("Exiting Phone Book...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}




