package Moses;

import java.util.Scanner;

public class jewsdoc {
    public static String getUserInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your Moses docthrine: ");
            String input = scanner.nextLine();
            return input;
        }
    }
}