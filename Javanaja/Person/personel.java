public class personel {
    public static void main(String[] args) {
        int age=20;
        person Person = new person (age);
        Person.setID("1319900852856");
        String x = Person.getID();
        System.out.println("รหัสประจำตัวประชาชน "+x);
        Person.firstname();
        Person.lasstname();
        Person.birthDate();
        Person.bloodType();
        Person.age();
        
    }
    
} 

