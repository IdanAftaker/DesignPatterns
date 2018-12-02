package Bridge;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
