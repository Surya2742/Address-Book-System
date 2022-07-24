package addressBook;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class ContactMain {

	static Dictionary dictionary = new Hashtable();
	static Hashtable<Integer, ArrayList<AddContact>> hashTable = new Hashtable<Integer, ArrayList<AddContact>>();
	Instruction instruction =new Instruction();
        static InputScanner inputScanner = new InputScanner();

	public static void main(String[] args) {
		System.out.println("enter the address book limit");
		int addressBookLimit = inputScanner.inputInteger();
		for (int i = 1; i <= addressBookLimit; i++) {
			ArrayList<AddContact> addContactDetails = new ArrayList<AddContact>();
			while (true) {
				AddContact addPersonDetails = new AddContact();
				System.out.println(
						"Input  01. Add Details, 02. Edit details, 03. Delete details, 04. View details.\n Enter any Number to Ignore");
				int options = inputScanner.inputInteger();
				if (options == 01 || options == 02 || options == 03 || options == 04) {
					switch (options) {
					case 01:
						addPersonDetails.setContactDetails();
						addContactDetails.add(addPersonDetails);
						break;
					case 02:
						System.out.println("Enter the name to edit");
						addPersonDetails.editDetails(addContactDetails);
						break;
					case 03:
						addPersonDetails.deleteDetails(addContactDetails);
						break;
					case 04:
						addPersonDetails.viewDetails(addContactDetails);
						break;
					default:
						System.out.println("you have not perform any operation");
						break;
					}

				} else {
					System.out.println("Details are upto date");
					break;
				}
			}
			
		}
				
	}
	
}
