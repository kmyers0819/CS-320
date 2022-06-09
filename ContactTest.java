package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Contact;

class ContactTest {
	
	//test id
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() ->{
			new Contact("1234567890000", "Kasey Myers", "Myers", 
					"1231231234", "123 not real st glasgow");
		});
	}
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() ->{
			new Contact(null, "Kasey Myers", "Myers", "1231231234", 
					"123 not real st glasgow");
		});
	}
	
	//test firstName
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() ->{
			new Contact("1234567890", "Kasey Myers", "Myers", 
					"1231231234", "123 not real st glasgow");
		});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() ->{
			new Contact("1234567890", null, "Myers", 
					"1231231234", "123 not real st glasgow");
		});
	}
	
	//test lastName
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() ->{
			new Contact("1234567890", "Kasey", "Myers Myers", 
					"1231231234", "123 not real st glasgow");
		});
	}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() ->{
			new Contact("1234567890", "Kasey", null, 
					"1231231234", "123 not real st glasgow");
		});
	}
	
	//test phoneNumber
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() ->{
			new Contact("1234567890", "Kasey", "Myers", 
							"12312312345", "123 not real st glasgow");
		});
	}
	
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() ->{
			new Contact("1234567890", "Kasey", "Myers", 
							null, "123 not real st glasgow");
		});
	}
	
	//test address
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() ->{
			new Contact("1234567890", "Kasey", "Myers", "1231231234", 
					"1234567890 not real street glasgow ky");
		});
	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() ->{
			new Contact("1234567890", "Kasey", "Myers", "1231231234", 
					null);
		});
	}
}