package State1;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println("Initial state: Parked");

        bike.changeGear(); // Cannot change gear while bike is parked.
        bike.pedal(); // Cannot pedal while bike is parked.

        bike.setState(new MovingState());
        System.out.println("New state: Moving");

        bike.changeGear(); // Changing gear while bike is moving.
        bike.pedal(); // Pedaling while bike is moving.
        System.out.println("Current speed: " + bike.getSpeed());
    }
}
