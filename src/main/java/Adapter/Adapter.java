package Adapter;

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
