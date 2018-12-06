package Command;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * Command pattern is a data driven design pattern and falls under behavioral pattern category.
 * A request is wrapped under an object as command and passed to invoker object.
 * Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command
 */
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
