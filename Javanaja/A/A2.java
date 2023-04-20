
public class A2 {
    int speed;
    public void drive(){
        System.out.println("Vehicle is driving...");
        System.out.println("with spreed:"+this.speed);
    }
    public void increasespeed(int addSpeed){
        this.speed+=addSpeed;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A2 v = new A2();
        v.drive();
        v.increasespeed(100);
        v.drive();
        v.increasespeed(-30);
        v.drive();
    }
}