package main;

public class Contact {
	
	//variables whose length should be <= 10
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	//variables whose length should be <= 30
	private String address;
	
	public Contact(String id, String firstName, String lastName, 
			String phoneNumber, String address) {
		
		//check if id is valid
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID:"
					+ " null or length > 10");
		}
		
		//check if first name is valid
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name:"
					+ " null or length > 10");
		}
		
		//check if last name is valid
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name:"
					+ " null or length > 10");
		}
		
		//check if phone number is valid
		if (phoneNumber == null || phoneNumber.length() > 10) {
			throw new IllegalArgumentException("Invalid phone number:"
					+ " null or length > 10");
		}
		
		//check if address is valid
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address:"
					+ " null or length > 30");
		}
		
		/*
		this.id = firstName.substring(0,3) + lastName.substring(0,2)
		+ phoneNumber.substring(2,5) + address.substring(0,2);
		*/
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	//getter methods
	public String getContactId() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	//setter methods
	public void setContactId(String id) {
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	public static void main(String args[]) {
		Contact c = new Contact("Kasey", "Myers", "3214082126", "3497 wilson rd cave city, ky") {
			System.out.println(c.getContactId());
			System.out.println(c.getFirstName());
			System.out.println(c.getLastName());
			System.out.println(c.getPhoneNumber());
			System.out.println(c.getAddress());
		}
	}
	*/
}