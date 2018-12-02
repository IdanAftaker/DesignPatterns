package FactoryMethod;

public class Circle implements Shape {
    Circle() {}

    //@Override
    public void draw() {
        System.out.println("Circle.draw");
    }
    //@Override
    public void erase() {
        System.out.println("Circle.erase");
    }
}
