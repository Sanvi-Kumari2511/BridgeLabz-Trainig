package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddressBook {
	
	//ArrayList to store contacts
	static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n----- Address Book Menu -----");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City/State");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addContact();
                case 2 -> editContact();
                case 3 -> deleteContact();
                case 4 -> searchContact();
                case 5 -> displayContacts();
                case 6 -> {
                    System.out.println("Exiting Address Book");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    //Adding contacts
    static void addContact() {
        System.out.print("First Name: ");
        String fn = sc.nextLine();
        System.out.print("Last Name: ");
        String ln = sc.nextLine();

        //Duplicate contact validation
        for (Contact c : contacts) {
            if (c.sameName(fn, ln)) {
                System.out.println("Contact already exists");
                return;
            }
        }

        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Zip: ");
        String zip = sc.nextLine();

        //Address object to ArrayList
        Address address = new Address(city, state, zip);
        contacts.add(new Contact(fn, ln, phone, email, address));
        System.out.println("Contact added successfully!");
    }

    //Edit contact
    static void editContact() {
        System.out.print("First Name: ");
        String fn = sc.nextLine();
        System.out.print("Last Name: ");
        String ln = sc.nextLine();

        for (Contact c : contacts) {
            if (c.sameName(fn, ln)) {
                System.out.print("New Phone: ");
                c.setPhone(sc.nextLine());
                System.out.print("New Email: ");
                c.setEmail(sc.nextLine());
                System.out.println("Contact updated!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    //Delete contact
    static void deleteContact() {
        System.out.print("First Name: ");
        String fn = sc.nextLine();
        System.out.print("Last Name: ");
        String ln = sc.nextLine();

        contacts.removeIf(c -> c.sameName(fn, ln));
        System.out.println("Contact deleted (if existed)");
    }

    //Search by city or state
    static void searchContact() {
        System.out.print("Enter City or State: ");
        String key = sc.nextLine();

        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(key) ||
                c.getAddress().getState().equalsIgnoreCase(key)) {
                c.display();
            }
        }
    }

    //Displaying all contacts sorted alphabetically
    static void displayContacts() {
        Collections.sort(contacts); 
        for (Contact c : contacts) {
            c.display();
        }
    }
}
