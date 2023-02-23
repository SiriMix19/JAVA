package zoo;
import selectanim.*;

public class Zoo {
    public static void main(String args[]) {
        System.out.println("---  menu in myrestaurants ---!");

        animall fl = new animall();
        fl.list();
        System.out.println("-----------------------------------");
        String foodinput = chooseanim.getfood();
        System.out.println("Your favorite menu is = " + foodinput);

        }
}

