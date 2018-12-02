package Composite;

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
