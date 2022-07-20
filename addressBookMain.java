package addressBookSystem;

public class addressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System");

		addressBook personContact0 = new addressBook();
		System.out.println("Enter Following Contact Details for Person 1");
		InputScanner is0 = new InputScanner();
		
		System.out.println("Enter First Name:");
		String contactFirstName = is0.inputString();
		personContact0.setFirstName(contactFirstName);

		System.out.println("Enter Last Name:");
		String contactLastName = is0.inputString();
		personContact0.setLastName(contactLastName);

		System.out.println("Enter Address:");
		String contactAddress = is0.inputString();
		personContact0.setAddress(contactAddress);

		System.out.println("Enter City:");
		String contactCity = is0.inputString();
		personContact0.setCity(contactCity);

		System.out.println("Enter State:");
		String contactState = is0.inputString();
		personContact0.setState(contactState);

		System.out.println("Enter Email:");
		String contactEmail = is0.inputString();
		personContact0.setEmail(contactEmail);

		System.out.println("Enter Zip: ");
		String contactZip = is0.inputString();
		personContact0.setZip(contactZip);

		System.out.println("Enter Phone Number: ");
		String contactPhoneNumber = is0.inputString();
		personContact0.setPhoneNumber(contactPhoneNumber);

		//System.out.println(" First Name: " + personContact0.getFirstName());
		//System.out.println("Last Name: " + personContact0.getLastName());
		//System.out.println("Address: " + personContact0.getAddress());
		//System.out.println("City: " + personContact0.getCity());
		//System.out.println("State: " + personContact0.getState());
		//System.out.println("Zip: " + personContact0.getZip());
		//System.out.println("Phone Number: " + personContact0.getPhoneNumber());
		//System.out.println("Email: " + personContact0.getEmail());
		
		addressBook personContact1 = new addressBook();
		System.out.println("Enter Following Contact Details for Person 2");
		InputScanner is1 = new InputScanner();
		System.out.println("Enter First Name:");
		personContact1.setFirstName(is1.inputString());
		System.out.println("Enter Last Name:");
		personContact1.setLastName(is1.inputString());
		System.out.println("Enter Address:");
		personContact1.setAddress(is1.inputString());
		System.out.println("Enter City:");
		personContact1.setCity(is1.inputString());
		System.out.println("Enter State:");
		personContact1.setState(is1.inputString());
		System.out.println("Enter Email:");
		personContact1.setEmail(is1.inputString());
		System.out.println("Enter Zip Code:");
		personContact1.setZip(is1.inputString());
		System.out.println("Enter Phone Number");
		personContact1.setPhoneNumber(is1.inputString());
		
		addressBook personContact2 = new addressBook();
		System.out.println("Enter Following Contact Details for Person 3");
		InputScanner is2 = new InputScanner();
		System.out.println("Enter First Name:");
		personContact2.setFirstName(is2.inputString());
		System.out.println("Enter Last Name:");
		personContact2.setLastName(is2.inputString());
		System.out.println("Enter Address:");
		personContact2.setAddress(is2.inputString());
		System.out.println("Enter City:");
		personContact2.setCity(is2.inputString());
		System.out.println("Enter State:");
		personContact2.setState(is2.inputString());
		System.out.println("Enter Email:");
		personContact2.setEmail(is2.inputString());
		System.out.println("Enter Zip Code:");
		personContact2.setZip(is2.inputString());
		System.out.println("Enter Phone Number");
		personContact2.setPhoneNumber(is2.inputString());
		
		addressBookStore addressBookStore = new addressBookStore();
        addressBookStore.Add(personContact0);
        addressBookStore.Add(personContact1);
        addressBookStore.Add(personContact2);
        
        addressBookInterface addressBookInterface = new addressBookInterface();
		addressBookInterface.print(addressBookStore.getContactList());
		
		InputScanner is3 = new InputScanner();
		System.out.println("Enter name of contact you want to edit");
		String name = is3.inputString();
		if(personContact0.getFirstName().equalsIgnoreCase(name) == true)
			addressBookInterface.edit(personContact0);
		else if(personContact1.getFirstName().equalsIgnoreCase(name) == true)
			addressBookInterface.edit(personContact1);
		else if(personContact2.getFirstName().equalsIgnoreCase(name) == true)
			addressBookInterface.edit(personContact2);
		System.out.println("Contact List after edit");
		addressBookInterface.print(addressBookStore.getContactList());
		
		InputScanner is5 = new InputScanner();
		System.out.println("Enter name of contact you want to delete");
		String contactName = is5.inputString();
		if(personContact0.getFirstName().equalsIgnoreCase(contactName) == true)
			addressBookStore .remove(personContact0);
		else if(personContact1.getFirstName().equalsIgnoreCase(contactName) == true)
			addressBookStore.remove(personContact1);
		else if(personContact2.getFirstName().equalsIgnoreCase(contactName) == true)
			addressBookStore.remove(personContact2);
		System.out.println("Contact List after deletion");
		addressBookInterface.print(addressBookStore.getContactList());

	}

}
