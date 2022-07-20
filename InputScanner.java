package addressBookSystem;

import java.util.Scanner;

public class InputScanner {

	public static Scanner scanner = new Scanner(System.in);
	
	public String inputString() {
		return scanner.next();
	}

	public void scannerClose() {
		scanner.close();
	}
	
	public int inputInteger() {
		return scanner.nextInt();
	}
}
