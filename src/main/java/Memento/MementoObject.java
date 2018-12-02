package Memento;

public class MementoObject {
    private String state;
    public MementoObject(String state){ this.state = state; }
    public String getState(){ return state; }
    public String toString(){ return "state: " + state; }
}
