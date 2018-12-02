package FactoryMethod;

public class Rectangle implements Shape {
    Rectangle() {}

    //@Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }
    //@Override
    public void erase() {
        System.out.println("Rectangle.erase");
    }
}
