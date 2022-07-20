package addressBookSystem;

import java.util.HashSet;
import java.util.Set;

public class addressBookStore {
	
	public Set<addressBook> contactList = new HashSet<>();

	public Set<addressBook> getContactList() {
		return contactList;
	}

	void Add(addressBook addressBook) {
		contactList.add(addressBook);
	}

}
