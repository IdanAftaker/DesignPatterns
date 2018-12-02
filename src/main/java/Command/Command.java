package Command;

public class Command {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        ICommand lightsOn = new LightOnCommand(light);
        ICommand lightsOff = new LightOffCommand(light);

        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        System.out.println("the light is on? "+light.getLight()); // true

        //switch off
        control.setCommand(lightsOff);
        control.pressButton();
        System.out.println("the light is on? "+light.getLight()); // false
    }
}
