package interfacepolymorphism;

//Keyboard class implements USB interface
public class Keyboard implements USB {
	// overriding methods open() and close() and output messages:
	// "Keyboard USB connected successfully"
	// "Keyboard USB disconnected"

	// coding starts here

	@Override
	public void open() {
		// Print the open message.
		System.out.println("Keyboard USB connected successfully");
	}

	@Override
	public void close() {
		// Print the close message.
		System.out.println("Keyboard USB disconnected");
	}

	// coding ends here

	void click() {
		System.out.println("Keyboard is used with inputs");
	}
}
