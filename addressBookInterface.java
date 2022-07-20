package addressBookSystem;

import java.util.Set;

public class addressBookInterface {

	void print(Set<addressBook> contactList) {
		for (addressBook s : contactList) {
			System.out.println(s);
			}
	}
	
}