package Command;

public class Light {
    private boolean on;

    public void switchOn() { this.on = true; }
    public void switchOff() { this.on = false; }
    public boolean getLight() { return this.on; }
}
