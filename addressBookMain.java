package addressBookSystem;

public class addressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System");

		addressBook contact = new addressBook();
		System.out.println("Enter Following Contact Details");
		InputScanner is = new InputScanner();
		
		System.out.println("Enter First Name:");
		String contactFirstName = is.inputString();
		contact.setFirstName(contactFirstName);

		System.out.println("Enter Last Name:");
		String contactLastName = is.inputString();
		contact.setLastName(contactLastName);

		System.out.println("Enter Address:");
		String contactAddress = is.inputString();
		contact.setAddress(contactAddress);

		System.out.println("Enter City:");
		String contactCity = is.inputString();
		contact.setCity(contactCity);

		System.out.println("Enter State:");
		String contactState = is.inputString();
		contact.setState(contactState);

		System.out.println("Enter Email:");
		String contactEmail = is.inputString();
		contact.setEmail(contactEmail);

		System.out.println("Enter Zip: ");
		String contactZip = is.inputString();
		contact.setZip(contactZip);

		System.out.println("Enter Phone Number: ");
		String contactPhoneNumber = is.inputString();
		contact.setPhoneNumber(contactPhoneNumber);
		is.scannerClose();

		System.out.println(" First Name: " + contact.getFirstName());
		System.out.println("Last Name: " + contact.getLastName());
		System.out.println("Address: " + contact.getAddress());
		System.out.println("City: " + contact.getCity());
		System.out.println("State: " + contact.getState());
		System.out.println("Zip: " + contact.getZip());
		System.out.println("Phone Number: " + contact.getPhoneNumber());
		System.out.println("Email: " + contact.getEmail());

	}

}
