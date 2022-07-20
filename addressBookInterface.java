package addressBookSystem;

import java.util.Set;

public class addressBookInterface {

	void print(Set<addressBook> contactList) {
		for (addressBook s : contactList) {
			System.out.println(s);
			}
	}
	
	void edit(addressBook contact) {
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
}