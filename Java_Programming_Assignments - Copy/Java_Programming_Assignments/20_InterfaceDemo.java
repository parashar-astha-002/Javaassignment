interface Switchable {
    void turnOn();
    void turnOff();
}

class Light implements Switchable {
    public void turnOn() { System.out.println("Light is ON."); }
    public void turnOff() { System.out.println("Light is OFF."); }
}

class AC implements Switchable {
    public void turnOn() { System.out.println("AC is ON."); }
    public void turnOff() { System.out.println("AC is OFF."); }
}

class Fan implements Switchable {
    public void turnOn() { System.out.println("Fan is ON."); }
    public void turnOff() { System.out.println("Fan is OFF."); }
}

class SmartTV implements Switchable {
    public void turnOn() { System.out.println("Smart TV is ON."); }
    public void turnOff() { System.out.println("Smart TV is OFF."); }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Switchable[] devices = {
            new Light(),
            new AC(),
            new Fan(),
            new SmartTV()
        };

        for (Switchable device : devices) {
            device.turnOn();
            device.turnOff();
            System.out.println();
        }
    }
}
