package addressBook;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AddContact extends PersonDetails{
		
         InputScanner inputScanner = new InputScanner();
	public void setContactDetails()  {
			System.out.println("enter the First Name");
			setFirstName(inputScanner.inputString() );
			System.out.println("enter the Last Name");
			setLastName(inputScanner.inputString());
			System.out.println("enter the Address Name");
			setAddress(inputScanner.inputString());
			System.out.println("enter the State Name");
			setState(inputScanner.inputString());
			System.out.println("enter the Phone Number");
			setPhoneNumber(inputScanner.inputString());
			System.out.println("enter the Zip/postal Code");
			setZip(inputScanner.inputString());
			System.out.println("enter the Email");
			setEmail(inputScanner.inputString());
		}

		public void getContactDetails() {
			getFirstName();
			getLastName();
			getAddress();
			getState();
			getPhoneNumber();
			getZip();
			getEmail();
		}

		public void editDetails(ArrayList<AddContact> contactDetails) {
			String name = inputScanner.inputString();
			System.out.println(contactDetails.size());
			for (int i = 0; i < contactDetails.size(); i++) {
				if (contactDetails.get(i).getFirstName().equals(name)) {
					System.out.println("Name : " + contactDetails.get(i).getFirstName() + " matches with one of the contact in AddressBook.");
					System.out.printf("Enter the number to update contact details. \n 1. First Name 2. Last Name 3. Phone Number 4. Pincode 5. Address 6. Email 7. State");
					int updateChoice =  inputScanner.inputInteger();
					
					switch (updateChoice) {
					case 1:
						System.out.println("Enter the First name to update");
						contactDetails.get(i).setFirstName(inputScanner.inputString());
						System.out.println("The First Name is Updated");
						break;
					case 2:
						System.out.println("Enter the Last name to update");
						contactDetails.get(i).setLastName(inputScanner.inputString());
						System.out.println("The Last Name is Updated");
						break;
					case 3:
						System.out.println("Enter the Phone Number to Update");
						contactDetails.get(i).setPhoneNumber(inputScanner.inputString());
						System.out.println("The Phone Number is Updated");
						break;
					case 4:
						System.out.println("Enter the Pincode/Postalcode to Update");
						contactDetails.get(i).setZip(inputScanner.inputString());
						System.out.println("The Pincode/Postalcode is Updated");
						break;
					case 5:
						System.out.println("Enter the Address to Update");
						contactDetails.get(i).setAddress(inputScanner.inputString());
						System.out.println("The Address is Updated");
						break;
					case 6:
						System.out.println("Enter the Email to Update");
						contactDetails.get(i).setEmail(inputScanner.inputString());
						System.out.println("The Email is Updated");
						break;
					case 7:
						System.out.println("Enter the State to Update");
						contactDetails.get(i).setState(inputScanner.inputString());
						System.out.println("The State is Updated");
						break;
					default:
						System.out.println("you have not update any details");
						break;
					}

				} else
					System.out.println("Name didn't matched with contact at position : " + i);
			}
		}

		public void deleteDetails(ArrayList<AddContact> contactDetails) {
			System.out.println("enter the name");
			String deleteName = inputScanner.inputString();
			for(int i = 0; i < contactDetails.size(); i++ ) {
				if (contactDetails.get(i).getFirstName().equals(deleteName)) {
					contactDetails.remove(i);
					System.out.println("The contact Details for " + deleteName + " is deleted.");
				} else 
					System.out.println("Name didn't matched with contact at position : " + i);
			}
		}
		
		public void viewDetails(ArrayList<AddContact> contactDetails) {
				System.out.println(contactDetails.toString());
		}
}