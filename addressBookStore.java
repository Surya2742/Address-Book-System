package addressBookSystem;

import java.util.HashSet;
import java.util.Set;

public class addressBookStore {
	
	public Set<AddressBook> contactList = new HashSet<>();

	public Set<AddressBook> getContactList() {
		return contactList;
	}

	void add(AddressBook addressBook) {
		contactList.add(addressBook);
	}

	public void remove(AddressBook contact) {
		contactList.remove(contact);
	}
	
}
