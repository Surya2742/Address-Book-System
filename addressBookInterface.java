package addressBookSystem;

import java.util.Set;

public class addressBookInterface {

	void print(Set<AddressBook> contactList) {
		for (AddressBook s : contactList) {
			System.out.println(s);
			}
	}
	
	void edit(AddressBook contact) {
		InputScanner is4 = new InputScanner();
		System.out.println("Edit the details First Name, Last Name, Address, City, State, Zip, Phone Number, Email respectively");
		System.out.println("Re-Correct First Name");
		contact.setFirstName(is4.inputString());
		System.out.println("Re-Correct Last Name");
		contact.setLastName(is4.inputString());
		System.out.println("Re-Correct Address");
		contact.setAddress(is4.inputString());
		System.out.println("Re-Correct City");
		contact.setCity(is4.inputString());
		System.out.println("Re-Correct State");
		contact.setState(is4.inputString());
		System.out.println("Re-Correct Email");
		contact.setEmail(is4.inputString());
		System.out.println("Re-Correct Zip Code");
		contact.setZip(is4.inputString());
		System.out.println("Re-Correct Phone Number");
		contact.setPhoneNumber(is4.inputString());
	}
	
	void addContact(AddressBook personContact) {

		InputScanner inputScanner = new InputScanner();
		Instruction instruction = new Instruction();
		System.out.println("Enter Person contact details");
		instruction.EnterFirstName();
		personContact.setFirstName(inputScanner.inputString());
		instruction.EnterLastName();
		personContact.setLastName(inputScanner.inputString());
		instruction.EnterAddress();
		personContact.setAddress(inputScanner.inputString());
		instruction.EnterCity();
		personContact.setCity(inputScanner.inputString());
		instruction.EnterState();
		personContact.setState(inputScanner.inputString());
		instruction.EnterEmail();
		personContact.setEmail(inputScanner.inputString());
		instruction.EnterZip();
		personContact.setZip(inputScanner.inputString());
		instruction.EnterPhoneNumber();
		personContact.setPhoneNumber(inputScanner.inputString());
	}
	
}