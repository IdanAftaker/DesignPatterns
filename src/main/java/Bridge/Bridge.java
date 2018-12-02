package Bridge;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 */
public class Bridge {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
