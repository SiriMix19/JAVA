public class person {
    int age;
    String id;
    public person(int age){
        this.age=age;
    }
    public void age(){
        System.out.println("อายุ "+this.age);
    }
    public void setID(String id) {
        this.id=id;
    }
    public String getID() {
        return this.id;
    }
    public void firstname() {
        System.out.println("ชื่อ อภิสิทธิ์");
    }
    public void lasstname() {
        System.out.println("นามสกุล เพชรหงษ์");
    }
    public void birthDate() {
        System.out.println("วันเกิด 23 มิถุนายน 2545");
    }
    public void bloodType() {
        System.out.println("กรุ๊ปเลือด B ");
    }
}