package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.Contact;
import main.ContactService;

class ContactServiceTest {
	
	@Test
	void testAdd() {
		ContactService cs = new ContactService();
		Contact cs1 = new
				Contact("123456789","Kasey","Myers","1231231234",
						"123 not real st glasgow");
		assertEquals(true, cs.addContact(cs1));
	}
	
	@Test
	void testDelete() {
		ContactService cs = new ContactService();
		Contact cs1 = new
				Contact("123456789","Kasey","Myers","1231231234",
						"123 not real st glasgow");
		Contact cs2 = new 
				Contact("123456780","Stuart","Myers","3213214321",
						"123 not real st glasgow");
		Contact cs3 = new
				Contact("123456700","Eleanor","Myers","4564564567",
						"123 not real st glasgow");
		Contact cs4 = new
				Contact("123456000","Emilia","Myers","6546547654",
						"123 not real st glasgow");
		Contact cs5 = new
				Contact("123450000","Pearl","Myers","7897897890",
						"123 not real st glasgow");
		assertEquals(true, cs.deleteContact("987654321"));
		assertEquals(false,cs.deleteContact("098765432"));
		assertEquals(false,cs.deleteContact("123789456"));
	}
	
	@Test
	void testUpdate() {
		ContactService cs = new ContactService();
		Contact cs1 = new
				Contact("123456789","Kasey","Myers","1231231234",
						"123 not real st glasgow");
		Contact cs2 = new 
				Contact("123456780","Stuart","Myers","3213214321",
						"123 not real st glasgow");
		Contact cs3 = new
				Contact("123456700","Eleanor","Myers","4564564567",
						"123 not real st glasgow");
		Contact cs4 = new
				Contact("123456000","Emilia","Myers","6546547654",
						"123 not real st glasgow");
		Contact cs5 = new
				Contact("123450000","Pearl","Myers","7897897890",
						"123 not real st glasgow");
		cs.addContact(cs1);
		cs.addContact(cs2);
		cs.addContact(cs3);
		cs.addContact(cs4);
		cs.addContact(cs5);
		assertEquals(true,cs.updateContact("567654321", "Cat", "Dog",
				"9879879876", "654 dislike ct atlanta"));
		assertEquals(false, cs.updateContact("987123400", "Bird", "Snake",
				"5675675678", "987 prey dr montecito"));
	}
}