package addressBookSystem;

public class addressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System");
		addressBook contact = new addressBook();
		InputScanner inputScanner = new InputScanner();
		Instruction instruction = new Instruction();
		
		System.out.println("Enter Following Contact Details for Person 1");
		addressBook personContact0 = new addressBook();
		instruction.EnterFirstName();
		String contactFirstName = inputScanner.inputString();
		personContact0.setFirstName(contactFirstName);
		
		instruction.EnterLastName();
		String contactLastName = inputScanner.inputString();
		personContact0.setLastName(contactLastName);
		
		instruction.EnterAddress();
		String contactAddress = inputScanner.inputString();
		personContact0.setAddress(contactAddress);
		
		instruction.EnterCity();
		String contactCity = inputScanner.inputString();
		personContact0.setCity(contactCity);
		
		instruction.EnterState();
		String contactState = inputScanner.inputString();
		personContact0.setState(contactState);
		
		instruction.EnterEmail();
		String contactEmail = inputScanner.inputString();
		personContact0.setEmail(contactEmail);

		instruction.EnterZip();
		String contactZip = inputScanner.inputString();
		personContact0.setZip(contactZip);

		instruction.EnterPhoneNumber(); 
		String contactPhoneNumber = inputScanner.inputString();
		personContact0.setPhoneNumber(contactPhoneNumber);
		
		addressBook personContact1 = new addressBook();
		System.out.println("Enter Following Contact Details for Person 2");
		instruction.EnterFirstName();
		personContact1.setFirstName(inputScanner.inputString());
		instruction.EnterLastName();
		personContact1.setLastName(inputScanner.inputString());
		instruction.EnterAddress();
		personContact1.setAddress(inputScanner.inputString());
		instruction.EnterCity();
		personContact1.setCity(inputScanner.inputString());
		instruction.EnterState();
		personContact1.setState(inputScanner.inputString());
		instruction.EnterEmail();
		personContact1.setEmail(inputScanner.inputString());
		instruction.EnterZip();
		personContact1.setZip(inputScanner.inputString());
		instruction.EnterPhoneNumber();
		personContact1.setPhoneNumber(inputScanner.inputString());
		
		addressBook personContact2 = new addressBook();
		System.out.println("Enter Following Contact Details for Person 3");
		instruction.EnterFirstName();
		personContact2.setFirstName(inputScanner.inputString());
		instruction.EnterLastName();
		personContact2.setLastName(inputScanner.inputString());
		instruction.EnterAddress();
		personContact2.setAddress(inputScanner.inputString());
		instruction.EnterCity();
		personContact2.setCity(inputScanner.inputString());
		instruction.EnterState();
		personContact2.setState(inputScanner.inputString());
		instruction.EnterEmail();
		personContact2.setEmail(inputScanner.inputString());
		instruction.EnterZip();
		personContact2.setZip(inputScanner.inputString());
		instruction.EnterPhoneNumber();
		personContact2.setPhoneNumber(inputScanner.inputString());
		
		addressBookStore addressBookStore = new addressBookStore();
        addressBookStore.add(personContact0);
        addressBookStore.add(personContact1);
        addressBookStore.add(personContact2);
        
        addressBookInterface addressBookInterface = new addressBookInterface();
		addressBookInterface.print(addressBookStore.getContactList());
		
		int choice;
		System.out.println("Enter choice 1.Add the new contact\n 2.Edit Existing contact\n 3.Remove the contact");
		choice = inputScanner.inputInteger();

		switch (choice) {
		case 1:
			System.out.println("Enter the contact Details of Persons you want to add");
			System.out.println("Enter the no. of Contacts to add");
			int noOfContacts = inputScanner.inputInteger();
			for (int i = 1; i < noOfContacts; i++) {			
			addressBookInterface.addContact(contact);
				addressBookStore.add(contact);
				System.out.println("Contact List after add");
				addressBookStore.add(contact);
				addressBookInterface.print(addressBookStore.getContactList());
			}
			break;
		case 2:

			System.out.println("Enter name of contact you want to edit");
			String name = inputScanner.inputString();
			if (contact.getFirstName().equalsIgnoreCase(name) == true)
				addressBookInterface.edit(contact);
			else if (personContact0.getFirstName().equalsIgnoreCase(name) == true)
				addressBookInterface.edit(personContact0);
			else if (personContact1.getFirstName().equalsIgnoreCase(name) == true)
				addressBookInterface.edit(personContact1);
			else if (personContact2.getFirstName().equalsIgnoreCase(name) == true)
				addressBookInterface.edit(personContact2);
			System.out.println("Contact List after edit");
			addressBookInterface.print(addressBookStore.getContactList());
			break;

		case 3:

			System.out.println("Enter name of person you want to delete");
			String personFirstName = inputScanner.inputString();
			if (contact.getFirstName().equalsIgnoreCase(personFirstName) == true)
				addressBookStore.remove(contact);
			else if (personContact0.getFirstName().equalsIgnoreCase(personFirstName) == true)
				addressBookStore.remove(personContact0);
			else if (personContact1.getFirstName().equalsIgnoreCase(personFirstName) == true)
				addressBookStore.remove(personContact1);
			else if (personContact2.getFirstName().equalsIgnoreCase(personFirstName) == true)
				addressBookStore.remove(personContact2);
			System.out.println("Contact List after deletion");
			addressBookInterface.print(addressBookStore.getContactList());
			break;
		}
	}

}
