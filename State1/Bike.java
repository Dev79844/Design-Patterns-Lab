package State1;

public class Bike {
    private BikeState state;
    private int speed;
    private int gear;

    public Bike() {
        state = new ParkedState();
    }

    public void setState(BikeState state) {
        this.state = state;
    }

    public void changeGear() {
        state.changeGear(this);
    }

    public void pedal() {
        state.pedal(this);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}

