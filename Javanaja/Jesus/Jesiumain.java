
//Import function from Moses folder.
import Moses.*;

//Main file
//This is a codes.
public class Jesiumain {
    public static void main(String[] args) {
        System.out.println("---------------*JESIU DIALOGUE*---------------");
        System.out.println("Jesiu: Hello Beliver I'm Jusus");
        System.out.println("Jesiu: I have a doctrine for you. My believer");

        // Call package from devout.java
        devout Doctrine = new devout();
        Doctrine.doctrine();

        // Call package from Moses.java
        Moses Kamson = new Moses();
        Kamson.kamson();

        // Call package from jewsdevout.java
        jewsdevout Jewsdoctrine = new jewsdevout();
        Jewsdoctrine.jewsdoctrine();

        // Call package from jewsdoc.java
        String userInput = jewsdoc.getUserInput();
        System.out.println("The torah you choose is: " + userInput);
    }
}