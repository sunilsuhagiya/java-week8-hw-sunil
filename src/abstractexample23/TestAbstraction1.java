package abstractexample23;

public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s= new Cicle1(); // In real scenario, object is provided through method,e.g.,getShape()method
        s.draw();
    }
}
