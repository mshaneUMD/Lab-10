package interfacepolymorphism;

//Mouse class implements USB interface with click functionality
public class Mouse implements USB {
  void click() {
    System.out.println("mouse is clicked");
  }

  // overriding methods open() and close() and output messages:
  // "mouse USB opened and connected successfully"
  // "mouse USB closed and disconnected"

  // coding starts here

  @Override
  public void open() {
    // Print the open message.
    System.out.println("mouse USB opened and connected successfully");
  }

  @Override
  public void close() {
    // Print the close message.
    System.out.println("mouse USB closed and disconnected");
  }

  // coding ends here
}