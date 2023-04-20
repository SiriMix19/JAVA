package selectanim;
import java.util.Scanner ;
public class chooseanim {
public static String getfood() {
    try (Scanner scanner = new Scanner (System.in)){
        System.out.print("Please choose your favorite food in this menu : ");
        String input = scanner.nextLine();
        return input;
    }
}
} 
    

