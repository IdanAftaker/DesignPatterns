package Adapter;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * Adapter pattern works as a bridge between two incompatible interfaces.
 * This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.
 * This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces.
 */
public class Adapter {
    public static void main(String[] args) {
        Socket socket220v = new Socket220v();
        String outputFromSocket = socket220v.getOutput();
        System.out.println("the Voltage of the Socket is: " + outputFromSocket);

        ConnectorAdapter adapter = new ConnectorAdapter(new Plug110v());
        String inputToPlug = adapter.getAdapterOutput(outputFromSocket);
        System.out.println("New output by adapter is: " + inputToPlug);
    }
}
