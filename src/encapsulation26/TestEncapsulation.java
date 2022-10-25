package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting values of the variables
        obj.setName("Sunil");
        obj.setAge(20);
        obj.setRollNo(51);
        // Display values of the variables
        System.out.println("Prime's Name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollno: " + obj.getRollNo());
        // Direct access of roll no is not possible due to encapsulation
    }
}
