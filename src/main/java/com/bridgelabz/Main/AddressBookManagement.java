package com.bridgelabz.Main;

import java.util.Scanner;

import com.bridgelabz.Service.ContactImplement;

/*
 * Address Book Management
 */
public class AddressBookManagement {

	public static void main(String[] args) {
		System.out.println("-----Welcome To Address Book Management------");
		boolean exit = false;
		
		ContactImplement contact = new ContactImplement();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Choice");
		while (!exit) {
			System.out.println("1.Create/Add Contact\t 2.Update Contact\t 3.Delete Contact\t *.Default");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Add New Contact");
				contact.addContact();
				break;
			case 2:
				System.out.println("Edit Contact");
				contact.updatePerson();
				break;
			case 3:
				System.out.println("Delete Contact");
				contact.deletePerson();
				break;
			default:
					exit = true;
					System.out.println("Some thing wrong....");
					break;
			}
		}

	}

}
