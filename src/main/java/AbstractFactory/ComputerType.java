package AbstractFactory;

public class ComputerType {
    String computerType;

    public ComputerType(String computerType){
        this.computerType = computerType;
    }
    public Computer getComputer() throws Exception{
        Computer comp = null;
        if (computerType.equalsIgnoreCase("PC")) comp = new PC();

        else if(computerType.equalsIgnoreCase("Workstation")) comp = new Workstation();

        else if(computerType.equalsIgnoreCase("Server")) comp = new Server();

        else throw new Exception("Invalid Computer Type");

        return comp;
    }
}
