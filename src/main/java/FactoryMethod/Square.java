package FactoryMethod;

public class Square implements Shape{
    Square() {}

    //@Override
    public void draw() {
        System.out.println("Square.draw");
    }
    //@Override
    public void erase() {
        System.out.println("Square.erase");
    }
}
