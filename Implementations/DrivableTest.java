interface Drivable {
    void startEngine();
    void stopEngine();
}

class Car implements Drivable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println(model + " engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println(model + " engine stopped.");
    }

}

public class DrivableTest {
    public static void main(String[] args) {
        Drivable myCar = new Car("Toyota Corolla");

        myCar.startEngine();  // Output: Toyota Corolla engine started.
        myCar.stopEngine();   // Output: Toyota Corolla engine stopped.
    }
}
