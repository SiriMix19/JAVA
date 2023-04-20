public class Car {
    protected String name;
    protected String discount;
    protected String color;
    protected String wheels;
    protected String doors;
    public Car (String name){
        this.name = name;
    }
    public Car(int price, int tex){
        System.out.println("Total Price :" + (price+tex));
    }
}