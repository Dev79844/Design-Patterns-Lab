package State1;

public class MovingState implements BikeState {
    @Override
    public void changeGear(Bike bike) {
        System.out.println("Changing gear while bike is moving.");
        bike.setGear(bike.getGear() + 1);
    }

    @Override
    public void pedal(Bike bike) {
        System.out.println("Pedaling while bike is moving.");
        bike.setSpeed(bike.getSpeed() + bike.getGear());
    }
}
