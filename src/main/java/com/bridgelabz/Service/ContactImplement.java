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

}
