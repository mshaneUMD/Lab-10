package interfacepolymorphism;

public class Main {
    public static void main(String[] args) {
        //create an object of laptop mac
        LapTop mac = new LapTop("Mac", "white", 14999);

        //start to run laptop
        mac.start();
        System.out.println("-------------------------------");

        //using keyboard of laptop
        // coding starts here

        // Create a Keyboard object.
        Keyboard keyboard = new Keyboard();

        // Tell the laptop to use the keyboard device and open it.
        mac.useUsb(keyboard).open();

        // Print out a line.
        System.out.println("-------------------------------");

        //coding ends here

        //use mouth of laptop
        // coding starts here

        // Create a Mouse object.
        Mouse mouse = new Mouse();

        // Tell the laptop to use the mouse device and open it.
        mac.useUsb(mouse).open();

        // Print out a line.
        System.out.println("-------------------------------");

        //coding ends here

        //close mouse, keyboard, and shutdown laptop mac
        mouse.close();
        keyboard.close();
        mac.powerOff();
    }
}
