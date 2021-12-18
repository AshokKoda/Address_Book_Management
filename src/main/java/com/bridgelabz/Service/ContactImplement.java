package com.bridgelabz.Service;

import java.util.Scanner;

import com.bridgelabz.entity.AddressEntity;
import com.bridgelabz.entity.PersonEntity;
import com.bridgelabz.interfaces.IContact;

public class ContactImplement implements IContact {

	PersonEntity person = new PersonEntity();
	AddressEntity address = new AddressEntity();
	/*
	 * Add contact
	 */
	public void addContact() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------Enter Person Details-----------");
		System.out.println("Enter Firstname: ");
		String firstName = sc.next();
		person.setFirstName(firstName);
		
		System.out.println("Enter Lastname: ");
		String lastName = sc.next();
		person.setLastName(lastName);
		System.out.println("Fullname: " + person.getFirstName() + person.getLastName());
		
		System.out.println("Enter Email: ");
		String emailId = sc.next();
		person.setEmail(emailId);
		
		System.out.println("Enter Phone No: ");
		String phoneNo = sc.next();
		person.setPhoneNumber(phoneNo);
		
		System.out.println("Enter State: ");
		String stateName = sc.next();
		address.setState(stateName);
		
		System.out.println("Enter City: ");
		String cityName = sc.next();
		address.setCity(cityName);
		
		System.out.println("Enter Zip Code: ");
		long zipCode = sc.nextLong();
		address.setZip(zipCode);
		
		System.out.println("New added contact Details are:");
		System.out.println("FirstName:" + person.getFirstName() + " " + "LastName:" + person.getLastName() + " "
				+ "Email:" + person.getEmail() + " " + "PhoneNumber:" + person.getPhoneNumber() + " " + "Address:"
				+ person.getAddress() + " " + address.getState() + " , " + address.getCity() + " , "
				+ address.getZip());
		
	}
	
	/*
	 * Update contact with name
	 */
	public void updatePerson() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person name for update");
		String name = sc.next();
		
		if (name.equalsIgnoreCase(person.getFirstName())) {
			
			System.out.println("Person is found...");
			System.out.println("Edit the details of person");
			boolean exist = false;
			System.out.println("Select field you want to add:");
			
			while (!exist) {
				System.out.println(
						"1.First Name\t2.Last Name\t3.Email\t4.Phone Number\t5.State\t6.City\t7.Zip\t8.Default");
				int sel = sc.nextInt();
				
				switch(sel) {
				case 1:
					System.out.println("Edit first Name");
					String fname = sc.next();
					person.setFirstName(fname);
					break;
				case 2:
					System.out.println("Edit last Name");
					String lname = sc.next();
					person.setLastName(lname);
					break;
				case 3:
					System.out.println("Edit Email");
					String email = sc.next();
					person.setEmail(email);
					break;
				case 4:
					System.out.println("Edit phone number");
					String phoneNumber = sc.next();
					person.setPhoneNumber(phoneNumber);
					break;
				case 5:
					System.out.println("Edit state");
					String state = sc.next();
					address.setState(state);
					break;
				case 6:
					System.out.println("Edit city");
					String city = sc.next();
					address.setState(city);
					break;
				case 7:
					System.out.println("Edit zip");
					long zip = sc.nextInt();
					address.setZip(zip);
					break;
				default:
					exist = true;
					System.out.println("Exit");
				}
				System.out.println("Contact Updated Successfully.");
			}
		}else {
			System.out.println("Person not found");
		}
		
	}

}
