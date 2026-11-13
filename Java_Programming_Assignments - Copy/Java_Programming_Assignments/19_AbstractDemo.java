abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting.");
    }

    abstract void move();
}

class Car extends Vehicle {
    Car(String brand) { super(brand); }
    void move() { System.out.println("Car moves on four wheels."); }
}

class Bike extends Vehicle {
    Bike(String brand) { super(brand); }
    void move() { System.out.println("Bike moves on two wheels."); }
}

class Bus extends Vehicle {
    Bus(String brand) { super(brand); }
    void move() { System.out.println("Bus carries passengers."); }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota"),
            new Bike("Honda"),
            new Bus("Volvo")
        };

        for (Vehicle v : vehicles) {
            v.start();
            v.move();
            System.out.println();
        }
    }
}
