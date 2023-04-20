public class TestJavaStrcture {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("BMW X5");
        car.setYear(1999);
        car.setModel("E53");
        car.setengineSize(3.0f);
        System.out.println("-------------------Car1-------------------------");
        System.out.println("Car Name :" + car.getBrand());
        System.out.println("Car Year :" + car.getYear());
        System.out.println("Car Model :" + car.getModel());
        System.out.println("Car Engine Size :" + car.getengineSize());
        
        System.out.println("-------------------Car2-------------------------");
        Car car2 = new Car();
        car2.setBrand("BMW X3");
        car2.setYear(1999);
        System.out.println("Car2 Name :" + car.getBrand());
        System.out.println("Car2 Year :" + car.getYear());

        System.out.println("-------------------Car2-------------------------");
        Car car3 = new Car();
        car3.setBrand("BMW X4");
        car3.setengineSize(1990);
        car.setModel("E53");
        System.out.println("Car3 Name :" + car.getBrand());
        System.out.println("Car3 Engine Size :" + car.getengineSize());
        System.out.println("Car Model :" + car.getModel());
    }
}
