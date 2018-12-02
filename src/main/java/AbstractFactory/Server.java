package AbstractFactory;

public class Server extends Computer {
    public Parts getRAM() {
        return new Parts("4 GB");
    }

    public Parts getProcessor() {
        return new Parts("Intel P 4");
    }

    public Parts getMonitor() {
        return new Parts("17 inches");
    }
}
