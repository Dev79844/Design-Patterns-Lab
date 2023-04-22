package Memento1;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker caretaker = new CareTaker();

        originator.setState("State 1");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State 2");

        // Save the current state again
        caretaker.add(originator.saveStateToMemento());

        // Change the state again
        originator.setState("State 3");

        // Restore the previous state
        originator.getStateFromMemento(caretaker.get(0));

        System.out.println("Current state: " + originator.getState());
    }
}
