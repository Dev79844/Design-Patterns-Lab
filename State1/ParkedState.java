package State1;

public class ParkedState implements BikeState {
    @Override
    public void changeGear(Bike bike) {
        System.out.println("Cannot change gear while bike is parked.");
    }

    @Override
    public void pedal(Bike bike) {
        System.out.println("Cannot pedal while bike is parked.");
    }
}
