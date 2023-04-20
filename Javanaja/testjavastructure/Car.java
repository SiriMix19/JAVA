//Car
public class Car {
    private String brand;
    private int year;
    private String model;
    private float engineSize;

    // Tucture
    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(int price, int year) {
        this.brand = price;
        this.year = year;
    }

    public Car(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    public Car(String brand, int year, String model, float engineSize) {
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.engineSize = engineSize;
    }

    // getter/setter metods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setengineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public float getengineSize() {
        return this.engineSize;
    }
}
