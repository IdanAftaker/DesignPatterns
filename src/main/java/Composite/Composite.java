package Composite;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * Composite pattern is used where we need to treat a group of objects in similar way as a single object.
 * Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy.
 * This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.
 * This pattern creates a class that contains group of its own objects.
 * This class provides ways to modify its group of same objects.
 */
public class Composite {
    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse(1);
        Ellipse ellipse2 = new Ellipse(2);

        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(3);

        CompositeGraphic graphic1 = new CompositeGraphic("graphic 1");
        CompositeGraphic graphic2 = new CompositeGraphic("graphic 2");
        CompositeGraphic graphic3 = new CompositeGraphic("graphic 3");

        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic2.add(circle1);
        graphic2.add(circle2);
        graphic3.add(circle3);
        graphic3.add(graphic1);
        graphic3.add(graphic2);

        graphic3.draw();
    }
}
