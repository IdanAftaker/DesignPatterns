package Memento;

public class Originator {
    private String state;
    public void setState(String state) { this.state = state; }
    public String getState() { return this.state; }
    public MementoObject saveStateToMemento() { return new MementoObject(state); }
    public void getStateFromMemento(MementoObject memento) { this.state = memento.getState(); }
    public String toString() { return "state: " + this.state; }
}
