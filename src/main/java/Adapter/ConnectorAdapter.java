package Adapter;

public class ConnectorAdapter {
    Plug plug;
    public ConnectorAdapter(Plug plug) { this.plug = plug; }
    public String getAdapterOutput(String outputFromScoket) {
        if (outputFromScoket.equals(plug.getInput())) {
            return outputFromScoket;
        }
        else {
            String adapterOutput = plug.getInput();
            return adapterOutput;
        }
    }
}
