//USER INPUTS PACKAGE.
//This file is in Moses folder.
package Moses;

//import java.util.Scanner for give user inputs.
import java.util.Scanner;

//Userinputs by use import java.util.Scanner
public class jewsdoc {
    public static String getUserInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Choose your Torah: ");
            String input = scanner.nextLine();
            
            //IF Else  
            if (input.equals("GENESIS")||input.equals("genesis")){
                System.out.println("GENESIS : Beresheit means “In the beginning.” It deals with Creation; Adam and Eve; the Flood; the Patriarchs and the Matriarchs of the Jewish people and ends with the descent of Jacob and his family to Egypt.");
            }
            if (input.equals("EXODUS")||input.equals("exodus")){
                System.out.println("EXODUS : Shemot, meaning “Names,” refers to the names of the Jews who entered Egypt with Jacob. It deals with their exile, slavery and suffering; the life of Moses, and his initial prophecies; the Ten Plagues and the Exodus.");
            }
            if (input.equals("LEVITICUS")||input.equals("leviticus")){
                System.out.println("LEVITICUS : Vayikra means “He called.” God calls to Moses and informs him in detail of the laws regarding the festivals, Priests (Kohanim) and the Temple service.");
            }
            if (input.equals("NUMBERS")||input.equals("numbers")){
                System.out.println("NUMBERS : Bemidbar, “In the desert,” details the travels, battles and struggles of the Jews during their 40-year sojourn in the desert after the Exodus.");
            }
            if (input.equals("DEUTERONOMY")||input.equals("deuteronomy")){
                System.out.println("DEUTERONOMY : Devarim, “Words,” refers to Moses’ address to the Jewish people before his death. This prophetic farewell includes rebuke, encouragement, warnings and prophecies.");
            }
            return input;
        }
    }
}