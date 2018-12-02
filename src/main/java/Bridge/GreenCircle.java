package Bridge;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 */
public class GreenCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color: green, radius: "
                + radius +", x: " +x+", y: "+ y +"]");
    }
}
