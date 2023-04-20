public class Car_S extends Car {
    Car_S() {
        super("ISUZU");
    }

    Car_S(int price, int tex) {
        super(price, tex);
    }

    public static void main(String[] args) {
        Car_S sendan = new Car_S();
        sendan.name = "IZUSU";
        System.out.println("Brand :" + sendan.name);
        sendan.color = "Black";
        System.out.println("Coler :" + sendan.color);
        Car_S sendan2 = new Car_S(250000, 3000);
        sendan2.discount = "35%";
        System.out.println("Discount :" + sendan2.discount);
        sendan2.wheels = "4";
        System.out.println("Wheels :" + sendan2.wheels);
        sendan2.doors = "4";
        System.out.println("Doors :" + sendan2.doors);
    }
}
