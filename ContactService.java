package main;

import java.util.*;

public class ContactService {
	private ArrayList<Contact> contactList;
	public ContactService() {
		contactList = new ArrayList<>();
	}
	
	//add a contact
	public boolean addContact(Contact c) {
		boolean contactExists = false;
		
		//check if contact exists
		for (Contact l:contactList) {
			if (l.equals(c)) {
				contactExists = true;
			}
		}
		if (!contactExists) {
			contactList.add(c);
			return true;
		}
		else {
			return false;
		}
	}
	
	//delete a contact
	public boolean deleteContact(String id) {
		//check if contact exists
		for (Contact l:contactList) {
			if (l.getContactId().equals(id)) {
				contactList.remove(1);
				return true;
			}
		}
		return false;
	}
	
	//update the contact list
	public boolean updateContact(String id, 
			String firstName, String lastName, 
			String phoneNumber, String address) {
		for (Contact l:contactList) {
			if (l.getContactId().equals(id)) {
				
				//check and update first name
				if(!firstName.equals("") && 
						!(firstName.length() > 10)) {
					l.setFirstName(firstName);
				}
				
				//check and update last name
				if(!lastName.equals("") && 
						!(lastName.length() > 10)) {
					l.setLastName(lastName);
				}
				
				//check and update phone number
				if(!phoneNumber.equals("") && 
						!(phoneNumber.length() > 10)) {
					l.setPhoneNumber(phoneNumber);
				}
				
				//check and update address
				if(!address.equals("") && 
						!(address.length() > 30)) {
					l.setAddress(address);
				}
				return true;
			} //end main if statement
		} //end loop
		return false;
	} //end updateContact
} //end class